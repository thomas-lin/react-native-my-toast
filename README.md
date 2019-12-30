# react-native-my-toast

## Getting started

`$ npm install react-native-my-toast --save`

### Mostly automatic installation

`$ react-native link react-native-my-toast`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-my-toast` and add `MyToast.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libMyToast.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainApplication.java`
  - Add `import com.reactlibrary.MyToastPackage;` to the imports at the top of the file
  - Add `new MyToastPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-my-toast'
  	project(':react-native-my-toast').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-my-toast/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-my-toast')
  	```


## Usage
```javascript
import MyToast from 'react-native-my-toast';

// TODO: What to do with the module?
MyToast;
```
