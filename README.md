# KMP Boilerplate Project

This repository provides a boilerplate project for Kotlin Multiplatform (KMP) development. It includes a basic setup for sharing code between Android and iOS applications, as well as common libraries and configurations to get you started quickly. The project structure and code are inspired by Petros Efthymiou's [DailyPulse](https://github.com/petros-efthymiou/DailyPulse) project.

## Table of Contents

- [Features](#features)
- [Project Structure](#project-structure)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
- [Usage](#usage)
  - [Creating a New Project](#creating-a-new-project)
- [Architecture](#architecture)
- [Contributing](#contributing)
- [License](#license)
- [Acknowledgements](#acknowledgements)

## Features

- Shared code between Android and iOS platforms
- Clean Architecture
- Model-View-Intent (MVI) pattern
- Networking with Ktor
- Local database with SQLDelight
- Dependency injection with Koin
- UI development with Jetpack Compose (Android) and SwiftUI (iOS)


## Getting Started

### Prerequisites

- [Java 17](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html)
- [Gradle](https://gradle.org/install/)
- [Android Studio](https://developer.android.com/studio)
- [Xcode](https://developer.apple.com/xcode/)

### Installation

1. **Clone the repository**:
   ```sh
   git clone https://github.com/yourusername/kmp-boilerplate.git
   cd kmp-boilerplate
   ```
2. **Install dependencies**:
    ```sh
    ./gradlew clean build
    ````
    
### Usage
**Creating a New Project**

To create a new project from this boilerplate, you can use the provided createNew.py script. This script will replace placeholders in the boilerplate with your specified project name and package name.

Run the script:
```sh
python scripts/createNew.py
```
Follow the prompts to enter your app name and package name.

Open the project in Android Studio or Xcode and start developing!


## Architecture

This project follows the principles of Clean Architecture and the Model-View-Intent (MVI) pattern. It includes:

- **Clean Architecture**: Separation of concerns into different layers (e.g., domain, data, presentation).
- **MVI Pattern**: Unidirectional data flow for managing state and side effects.
- **Ktor**: For networking and API calls.
- **SQLDelight**: For local database management.
- **Koin**: For dependency injection.
- **Jetpack Compose**: For building UI on Android.
- **SwiftUI**: For building UI on iOS.

## Contributing

Contributions are welcome! Please open an issue or submit a pull request if you have any improvements or bug fixes.

- Fork the repository
- Create your feature branch (`git checkout -b feature/your-feature`)
- Commit your changes (`git commit -m 'Add some feature'`)
- Push to the branch (`git push origin feature/your-feature`)
- Open a pull request

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgements

This project structure and code are inspired by Petros Efthymiou's [DailyPulse](https://github.com/petros-efthymiou/DailyPulse) project. Special thanks to Petros for providing a great example of a Kotlin Multiplatform project.