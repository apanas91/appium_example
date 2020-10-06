import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;

public class AppiumTest {

    @Test
    public void appiumDemo(){
        String DEVICE_NAME = "Nexus 6";
        String PLATFORM_NAME = "Android";
        String APPIUM_URL = "http://0.0.0.0:4723/wd/hub";

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, DEVICE_NAME);
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, PLATFORM_NAME);
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.1.1");

        AndroidDriver<AndroidElement> driver = null;
        try {
            driver = new AndroidDriver<AndroidElement>(new URL(APPIUM_URL), cap);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        WebDriverWait wait = new WebDriverWait(driver, 30);

        driver.pressKey(new KeyEvent(AndroidKey.VOLUME_DOWN));
        driver.pressKey(new KeyEvent(AndroidKey.VOLUME_UP));

        AndroidElement phone = driver.findElementByXPath("//android.widget.TextView[@content-desc='Телефон']");
        phone.click();
        AndroidElement keyboard = driver.findElementById("com.google.android.dialer:id/dialpad_fab");
        keyboard.click();

        wait.until(d -> d.findElement(By.id("com.google.android.dialer:id/one")));

        AndroidElement one = driver.findElementById("com.google.android.dialer:id/one");
        AndroidElement two = driver.findElementById("com.google.android.dialer:id/two");
        AndroidElement three = driver.findElementById("com.google.android.dialer:id/three");
        AndroidElement four = driver.findElementById("com.google.android.dialer:id/four");
        AndroidElement five = driver.findElementById("com.google.android.dialer:id/five");
        AndroidElement six = driver.findElementById("com.google.android.dialer:id/six");
        AndroidElement seven = driver.findElementById("com.google.android.dialer:id/seven");
        AndroidElement eight = driver.findElementById("com.google.android.dialer:id/eight");
        AndroidElement nine = driver.findElementById("com.google.android.dialer:id/nine");
        AndroidElement zero = driver.findElementById("com.google.android.dialer:id/zero");
        AndroidElement star = driver.findElementById("com.google.android.dialer:id/star");
        AndroidElement pound = driver.findElementById("com.google.android.dialer:id/pound");
        AndroidElement callButton = driver.findElementById("com.google.android.dialer:id/dialpad_voice_call_button");


        one.click();
        two.click();
        three.click();
        four.click();
        five.click();
        six.click();
        seven.click();
        eight.click();
        nine.click();
        zero.click();
        callButton.click();
    }

}
