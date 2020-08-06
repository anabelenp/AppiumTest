package testcases;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class TestNativeApp {
public static AndroidDriver driver;
	
	public static void main(String[] args) throws MalformedURLException {
		
		File app = new File(".\\app\\selendroid-test-app-0.17.0 (1).apk");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Android");
		capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"io.selendroid.testapp"); //info taken from appinfo app from google store
		capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "HomeScreenActivity");
		//capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		//AppPackage & AppActivity
		
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities); 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.quit();
	}
}
