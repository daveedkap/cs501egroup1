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

### 1. What makes Compose declarative? (David)
*[Answer to be filled in]*

### 2. Where is state stored? (David)
*[Answer to be filled in]*

### 3. Which composables are stateful vs stateless?
*[Answer to be filled in]*

### 4. How does this differ from XML + View logic?
*[Answer to be filled in]*

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
