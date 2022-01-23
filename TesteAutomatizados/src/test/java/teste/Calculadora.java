package teste;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Before;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Calculadora {

	private AndroidDriver driver;
	
	public void AcessarCalculadora() throws MalformedURLException {
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("platformName", "Android");
		desiredCapabilities.setCapability("deviceName", "emulator-5554");
		desiredCapabilities.setCapability("automationName", "uiautomator2");
		desiredCapabilities.setCapability("appPackage", "com.android.calculator2");
		desiredCapabilities.setCapability("appActivity", "com.android.calculator2.Calculator");

		URL remoteUrl = new URL("http://localhost:4723/wd/hub");

		driver = new AndroidDriver(remoteUrl, desiredCapabilities);
	}

	public void digitar2() {
		MobileElement el1 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_2");
		el1.click();

	}

	public void AcionarTeclaMais() {

		MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("plus");
		el2.click();
	}
	
	public void fecharTest() {
		driver.quit();
	}

}
