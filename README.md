# Fullmoon Android

## Overview
Fullmoon Android is an open-source Android application designed to mirror the functionality of the iOS Fullmoon app. It allows users to interact with large language models (LLMs) directly on their Android devices. The app includes customizable settings, chat history management, and integrates on-device machine learning using TensorFlow Lite.

## Features
- **Local LLM Interaction** – Engage with LLMs directly on your Android device.
- **Customizable Interface** – Modify the app’s appearance and settings.
- **Chat History Management** – Save and review past interactions.
- **Onboarding Flow** – Seamless user onboarding experience.
- **Settings Page** – Access and adjust app configurations easily.
- **Modern UI** – Built using Jetpack Compose for a sleek and responsive user interface.

## Steps to Run
### 1. Clone the Repository
```bash
git clone https://github.com/your-username/fullmoon-android.git
```

### 2. Open the Project in Android Studio
- Sync the Gradle files.
- Build and run the application on an emulator or a physical device.

## Configuration
### TensorFlow Lite Model
- Ensure the `model.tflite` file is present in the `assets/` directory.
- Replace this model with your preferred LLM for custom implementations.

## Dependencies
All dependencies are managed in the `build.gradle.kts` file. Ensure all versions are compatible:
- **Compose Compiler**: 1.5.3
- **Hilt**: 2.47
- **TensorFlow Lite**: 2.13.0

## Contributing
Contributions are welcome. To contribute:
1. Fork the repository.
2. Create a feature branch:
   ```bash
   git checkout -b feature-name
   ```
3. Commit your changes:
   ```bash
   git commit -m "Add new feature"
   ```
4. Push to the branch:
   ```bash
   git push origin feature-name
   ```
5. Open a Pull Request.

## License
This project is licensed under the MIT License.

