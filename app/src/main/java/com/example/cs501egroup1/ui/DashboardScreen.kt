package com.example.cs501egroup1.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cs501egroup1.ui.theme.CS501EGroup1Theme

/**
 * PART 1 - DAVID'S SECTION
 * 
 * TODO: Complete the stateful parent composable
 * 
 * Requirements:
 * 1. Use remember { mutableStateOf(...) } to manage state
 * 2. Own at least one piece of state (Boolean, Int, or String)
 * 3. Create a Column or Row layout
 * 4. Include:
 *    - Text displaying a title
 *    - Button or Switch that changes state
 *    - Dynamic text that updates automatically when state changes
 * 5. Pass state and callbacks to stateless child composables
 */
@Composable
fun DashboardScreen() {
    var counter by remember { mutableStateOf(0) }
    var isEnabled by remember { mutableStateOf(false) }
    var message by remember { mutableStateOf("Welcome to the Dashboard") }
    
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(
            text = "Interactive Dashboard",
            style = MaterialTheme.typography.headlineMedium
        )
        
        Spacer(modifier = Modifier.height(8.dp))
        
        Text(
            text = message,
            style = MaterialTheme.typography.bodyLarge,
            color = MaterialTheme.colorScheme.primary
        )
        
        Text(
            text = "Counter: $counter | Status: ${if (isEnabled) "Active" else "Inactive"}",
            style = MaterialTheme.typography.bodyLarge
        )
        
        Switch(
            checked = isEnabled,
            onCheckedChange = { 
                isEnabled = it
                message = if (it) "Dashboard is now active!" else "Dashboard is inactive"
            }
        )
        
        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Button(onClick = { 
                counter++
                message = "Counter incremented to $counter"
            }) {
                Text("Increment")
            }
            
            Button(onClick = { 
                counter = 0
                message = "Counter reset"
            }) {
                Text("Reset")
            }
        }
        
        CustomInfoCard(
            title = "Dashboard Status",
            value = if (isEnabled) "Active" else "Inactive",
            onAction = { 
                isEnabled = !isEnabled
                message = if (isEnabled) "Status toggled to Active" else "Status toggled to Inactive"
            }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DashboardScreenPreview() {
    CS501EGroup1Theme {
        DashboardScreen()
    }
}
