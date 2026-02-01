package com.example.cs501egroup1.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cs501egroup1.ui.theme.CS501EGroup1Theme

/**
 * PART 2 - PARTHIV'S SECTION
 * 
 * TODO: Complete the stateless child composables
 * 
 * Requirements:
 * 1. Create at least one stateless composable that:
 *    - Receives state only via parameters
 *    - Emits UI (Text, Button, Switch, etc.)
 *    - Uses a lambda callback to notify the parent of changes
 * 2. Create at least one custom composable (can be a combination of basic composables)
 * 3. Ensure all composables are stateless (no internal state management)
 * 4. Add @Preview composables for testing
 */

/**
 * Example stateless composable structure:
 * 
 * @Composable
 * fun CustomCounterButton(
 *     count: Int,                    // State received via parameter
 *     onCountChange: (Int) -> Unit   // Callback to notify parent
 * ) {
 *     Button(onClick = { onCountChange(count + 1) }) {
 *         Text("Count: $count")
 *     }
 * }
 */

// TODO: Create your stateless child composables here
// Example ideas:
// - CustomToggleSwitch(isEnabled: Boolean, onToggle: (Boolean) -> Unit)
// - CustomCounterDisplay(count: Int, onIncrement: () -> Unit, onDecrement: () -> Unit)
// - CustomInfoCard(title: String, value: String, onAction: () -> Unit)

@Composable
fun CustomInfoCard(
    title: String,
    value: String,
    onAction: () -> Unit,
    modifier: Modifier = Modifier
) {
    // TODO: Implement a custom composable that displays title and value
    // and has a button that calls onAction
    // This is a placeholder - replace with your implementation
    Card(
        modifier = modifier,
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surfaceVariant
        )
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = title,
                style = MaterialTheme.typography.titleMedium
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = value,
                style = MaterialTheme.typography.bodyLarge
            )
            Spacer(modifier = Modifier.height(8.dp))
            Button(onClick = onAction) {
                Text("Action")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CustomInfoCardPreview() {
    CS501EGroup1Theme {
        CustomInfoCard(
            title = "Sample Title",
            value = "Sample Value",
            onAction = { }
        )
    }
}
