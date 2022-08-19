import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.util.Arrays;

public class AndroidTest {

    public static void main(String[] args) throws Exception {
        AppiumDriver driver;

        DesiredCapabilities dc = new DesiredCapabilities();
             dc.setCapability("platformName","Android");
             dc.setCapability("deviceName","era1X");
              dc.setCapability("platformVersion", "6" );
            //  dc.setCapability("app", "C:\\Users\\admin\\AndroidTesting\\Test01.apk");
              dc.setCapability("newCommandTimeout", 20000);
              dc.setCapability("uiautomator2ServerInstallTimeout", 90000);
              dc.setCapability("appPackage", "com.android.calculator2");
               dc.setCapability("appPackage", "com.android.calculator2");
        dc.setCapability("appActivity", "com.android.calculator2.Calculator");



        URL url= new URL("http://localhost:4723/wd/hub");
        driver= new AndroidDriver(url, dc);
        driver.findElement(By.id("com.android.calculator2:id/digit_4")).click();
        driver.findElement(By.id("com.android.calculator2:id/op_mul")).click();
        driver.findElement(By.id("com.android.calculator2:id/digit_7")).click();
        driver.findElement(By.id("com.android.calculator2:id/eq")).click();
    String result =    driver.findElement(By.id("com.android.calculator2:id/formula")).getText();

    if(result.equals("28")){

        System.out.println(" Test Case is Passed");
    }

    else{

        System.out.println(" Test Case is failed");
    }



    }


}
