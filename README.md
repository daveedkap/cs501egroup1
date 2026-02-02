# Group Assignment 2: Declarative vs Imperative UI

## Project Overview
This project demonstrates the differences between declarative and imperative UI using Jetpack Compose. It includes an interactive dashboard screen that displays and updates UI state automatically.

## Team Members
- David (Part 1: Stateful Parent Composable & State Management)
- Parthiv (Part 2: Stateless Child Composables & Custom Components)

## Assignment Requirements

### Required UI Elements
- [x] Text displaying a title
- [x] Button or Switch that changes state
- [x] Dynamic text that updates automatically when state changes
- [x] A Column or Row layout
- [x] At least one custom composable

### Functional Requirements

#### Stateful Parent Composable
- [x] Uses `remember { mutableStateOf(...) }`
- [x] Owns at least one piece of state (Boolean, Int, or String)

#### Stateless Child Composable
- [x] Receives state only via parameters
- [x] Emits UI (Text, Button, Switch, etc.)
- [x] Uses a lambda callback to notify the parent of changes

#### Automatic Recomposition
- [x] Changing state automatically updates the UI
- [x] No manual "refresh" logic exists

#### Compose Preview
- [x] At least one `@Preview` composable
- [x] Preview renders correctly in Android Studio

## README Questions

### 1. What makes Compose declarative?
Compose is declarative because you describe what the UI should look like based on the current state, rather than manually updating individual views. When state changes, Compose automatically recomposes only the affected parts of the UI. You don't write imperative code like `textView.setText()` or `button.setOnClickListener()` - instead, you declare the UI structure and Compose handles the updates.

### 2. Where is state stored?
State is stored in the composable function using `remember { mutableStateOf(...) }`. In `DashboardScreen.kt`, state variables like `counter`, `isEnabled`, and `message` are stored within the composable's scope. The `remember` function ensures the state persists across recompositions, and `mutableStateOf` makes the state observable so Compose knows when to recompose.

### 3. Which composables are stateful vs stateless?
DashboardScreen is the stateful composable because it owns and manages UI state using `remember { mutableStateOf(...) }`, such as the counter value, enabled status, and displayed message. It updates this state in response to user actions and passes the current state and callback functions down to its child composables. In contrast, CustomInfoCard, CustomToggleSwitch, and CustomCounterControls are stateless composables. They do not store any state themselves and simply display UI based on the parameters they receive, using callbacks to inform the parent when user interactions occur.

### 4. How does this differ from XML + View logic?
Jetpack Compose is declarative, meaning the UI automatically updates when state changes. Developers describe what the UI should look like for a given state, and Compose handles updates through recomposition. In contrast, the XML + View system is imperative: layouts are defined in XML, and developers must manually find and update views in code to reflect state changes.

## Project Structure
```
app/
├── src/
│   └── main/
│       ├── java/com/example/cs501egroup1/
│       │   ├── MainActivity.kt
│       │   ├── DashboardScreen.kt (Part 1 - David)
│       │   └── CustomComposables.kt (Part 2 - Parthiv)
│       └── res/
│           └── values/
│               └── strings.xml
```

## How to Run
1. Open the project in Android Studio
2. Sync Gradle files
3. Run the app on an emulator or physical device
