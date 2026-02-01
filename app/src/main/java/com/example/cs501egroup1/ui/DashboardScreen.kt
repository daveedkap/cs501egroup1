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
    // TODO: Add state management using remember { mutableStateOf(...) }
    // You need at least one piece of state (Boolean, Int, or String)
    // Example: var counter by remember { mutableStateOf(0) }
    // Example: var isEnabled by remember { mutableStateOf(false) }
    // Example: var message by remember { mutableStateOf("Initial") }
    
    // Placeholder state - REPLACE THIS with your own state
    var counter by remember { mutableStateOf(0) }
    var isEnabled by remember { mutableStateOf(false) }
    
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        // TODO: Add title Text composable
        Text(
            text = "Interactive Dashboard",
            style = MaterialTheme.typography.headlineMedium
        )
        
        Spacer(modifier = Modifier.height(8.dp))
        
        // TODO: Add dynamic text that shows current state value
        // This text should automatically update when state changes
        Text(
            text = "Counter: $counter | Enabled: $isEnabled",
            style = MaterialTheme.typography.bodyLarge
        )
        
        // TODO: Add Button or Switch that changes state
        // Example: Button(onClick = { counter++ }) { Text("Increment") }
        Switch(
            checked = isEnabled,
            onCheckedChange = { isEnabled = it }
        )
        
        Button(onClick = { counter++ }) {
            Text("Increment Counter")
        }
        
        // TODO: Call stateless child composables from CustomComposables.kt
        // Pass state as parameters and lambda callbacks for state changes
        // Example: CustomCounterButton(count = counter, onCountChange = { counter = it })
        CustomInfoCard(
            title = "Status",
            value = if (isEnabled) "Active" else "Inactive",
            onAction = { isEnabled = !isEnabled }
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
