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
 * Stateless child composables:
 * - Receive state ONLY through parameters
 * - Use callbacks (lambdas) to notify parent of changes
 * - No remember { } or mutableStateOf here
 */

/**
 * Stateless toggle component.
 * Parent owns isEnabled, child just shows it and reports changes via onToggle.
 */
@Composable
fun CustomToggleSwitch(
    isEnabled: Boolean,
    onToggle: (Boolean) -> Unit,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column {
            Text(
                text = "Status",
                style = MaterialTheme.typography.titleMedium
            )
            Text(
                text = if (isEnabled) "Active" else "Inactive",
                style = MaterialTheme.typography.bodyMedium,
                color = if (isEnabled) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.onSurfaceVariant
            )
        }

        Switch(
            checked = isEnabled,
            onCheckedChange = onToggle
        )
    }
}

@Composable
fun CustomCounterControls(
    count: Int,
    onIncrement: () -> Unit,
    onReset: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(12.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Counter: $count",
            style = MaterialTheme.typography.titleLarge
        )

        Row(
            horizontalArrangement = Arrangement.spacedBy(10.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Button(onClick = onIncrement) {
                Text("Increment")
            }
            OutlinedButton(onClick = onReset) {
                Text("Reset")
            }
        }
    }
}

@Composable
fun CustomInfoCard(
    title: String,
    value: String,
    onAction: () -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surfaceVariant
        )
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Text(
                text = title,
                style = MaterialTheme.typography.titleMedium
            )
            Text(
                text = value,
                style = MaterialTheme.typography.bodyLarge,
                color = MaterialTheme.colorScheme.primary
            )

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.End
            ) {
                Button(onClick = onAction) {
                    Text("Action")
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CustomToggleSwitchPreview() {
    CS501EGroup1Theme {
        Surface(modifier = Modifier.padding(16.dp)) {
            CustomToggleSwitch(
                isEnabled = true,
                onToggle = { }
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CustomCounterControlsPreview() {
    CS501EGroup1Theme {
        Surface(modifier = Modifier.padding(16.dp)) {
            CustomCounterControls(
                count = 5,
                onIncrement = { },
                onReset = { }
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CustomInfoCardPreview() {
    CS501EGroup1Theme {
        Surface(modifier = Modifier.padding(16.dp)) {
            CustomInfoCard(
                title = "Sample Title",
                value = "Sample Value",
                onAction = { }
            )
        }
    }
}
