Fullmoon Android

Overview

Fullmoon Android is an open-source Android application that mirrors the functionality of the iOS Fullmoon app. It enables users to interact with large language models (LLMs) locally on their Android devices. The app supports customizable settings, chat history management, and integrates on-device machine learning using TensorFlow Lite.

Features

Local LLM Interaction: Engage with LLMs directly on your Android device.
Customizable Interface: Modify the app's appearance and settings to suit your preferences.
Chat History Management: Save and view past interactions.
Onboarding Flow: Seamless user onboarding experience.
Settings Page: Access and adjust app configurations easily.
Modern UI: Built using Jetpack Compose for a sleek and responsive user interface.


Steps to Run

Clone the repository:
git clone https://github.com/your-username/fullmoon-android.git

Open the project in Android Studio.
Sync the Gradle files.
Build and run the app on an emulator or a physical device.

Configuration

TensorFlow Lite Model
Ensure the model.tflite file is present in the assets/ directory. Replace this model with your preferred LLM for custom implementations.

Dependencies

All dependencies are managed in the build.gradle.kts file. Ensure all versions are compatible:

Compose Compiler: 1.5.3
Hilt: 2.47
TensorFlow Lite: 2.13.0

Contributing

We welcome contributions from the community! To contribute:
Fork the repository.

Create a feature branch:
git checkout -b feature-name

Commit your changes:
git commit -m "Add new feature"

Push to the branch:
git push origin feature-name

Open a Pull Request.

License

This project is licensed under the MIT License.c
