# FitTrack - Fitness Tracking App

FitTrack is a fully functional mobile application developed as part of the Mobile Application Development (MAD) module for the 2nd year, 2nd semester at SLIIT. Built using Android Studio with Kotlin, this app provides a user-friendly interface for tracking various fitness metrics. The app focuses on seamless navigation and a clean UI, offering features to monitor calorie intake, sleep, walking, water consumption, heart rate, and a stopwatch.

## Features
- **Calorie Intake Tracking**: Log and monitor daily calorie consumption.
- **Sleep Tracking**: Record and analyze sleep patterns.
- **Walk Tracking**: Track steps and walking distance.
- **Water Intake Monitoring**: Log daily water consumption.
- **Heart Rate Monitoring**: Monitor heart rate data (requires compatible hardware).
- **Stopwatch**: Time workouts or activities with an integrated stopwatch.
- **Intuitive UI**: Clean, responsive, and user-friendly interface with smooth navigation.

## Screenshots
![Screenshot 2025-04-05 085253](https://github.com/user-attachments/assets/afd16bb2-b85b-47cc-8a2e-7126252bb394)
![Screenshot 2025-04-05 090525](https://github.com/user-attachments/assets/061a2ca5-5c70-4eaa-9e81-2e2205a1cac6)
![Screenshot 2025-04-05 090035](https://github.com/user-attachments/assets/dec91b98-13a6-4452-93e6-95d1a448deae)
![Screenshot 2025-04-05 103523](https://github.com/user-attachments/assets/5d77e92d-dbc1-4f86-b2ab-49190b6fec78)
![Screenshot 2025-04-05 103253](https://github.com/user-attachments/assets/8eb437df-3f50-4b85-82a9-9f84ef80f097)

## Prerequisites
To clone and run this project, ensure you have the following installed:
- **Android Studio**: Version 2024.1.1 (Koala) or later.
- **JDK**: Version 17 or later.
- **Git**: For cloning the repository.
- **Kotlin Plugin**: Enabled in Android Studio (included by default in recent versions).
- **Android Device/Emulator**: API level 21 (Android 5.0) or higher.

## How to Clone and Run the Project

### 1. Clone the Repository
1. Open a terminal or command prompt.
2. Run the following command to clone the repository:
   ```bash
   git clone https://github.com/SupunPrabodha/FitTrack.git
3. Navigate to the project directory:
    ```bash
    cd FitTrack
    ```

### 2. Open the Project in Android Studio
1. Launch Android Studio.
2. Select File > Open and navigate to the cloned **FitTrack** folder.
3. Click **OK** to open the project.
4. Wait for Android Studio to sync the project and download dependencies via Gradle.

### 3. Configure the Project
1. Verify the JDK configuration:
- Go to File > Project Structure > SDK Location.
- Ensure the JDK is set to version 17 or later.
2. Check the Build Gradle configuration:
- Open app/build.gradle and confirm the following dependencies (versions may vary):

  ```gradle
  implementation 'androidx.core:core-ktx:1.13.1'
  implementation 'androidx.appcompat:appcompat:1.7.0'
  implementation 'com.google.android.material:material:1.12.0'
  implementation 'androidx.navigation:navigation-fragment-ktx:2.8.3'
  implementation 'androidx.navigation:navigation-ui-ktx:2.8.3'
  ```
3. Click **Sync Project with Gradle Files** in the toolbar to resolve dependencies.

### 4. Run the App
1. Connect an Android device via USB (with Developer Mode and USB Debugging enabled) or set up an emulator in Android Studio.
Select the device/emulator from the Device Manager.
2. Click the **Run** button (green play icon) to build and install the app.
3. The app should launch and function as expected on the selected device/emulator.

## Project Structure
- **app/src/main/java** : Contains Kotlin source code, including activities, fragments, and navigation logic.
- **app/src/main/res** : Includes XML layouts, drawables, strings, and other resources for the UI.
- **app/src/main/AndroidManifest.xml** : Defines app permissions, activities, and components.
- **build.gradle** : Gradle configuration files (project and app-level) for dependencies and build settings.

## Notes
- The project is fully functional, with all XML, Kotlin, and Gradle files included in the repository.
- Hardware-dependent features (e.g., heart rate monitoring) require compatible devices or sensors.
- Ensure a stable internet connection for the initial Gradle sync to download dependencies.
- If you encounter sync or build issues, verify the Gradle and Kotlin plugin versions in Android Studio.
Contributing
- This project was developed as a coursework assignment for SLIIT. Contributions are not expected, but feedback is welcome! Feel free to create an issue or contact the repository owner for suggestions or improvements.

## Author
Supun Prabodha
GitHub: SupunPrabodha

## License
This project is licensed under the MIT License. See the LICENSE file for details.
