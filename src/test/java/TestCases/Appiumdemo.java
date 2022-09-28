package TestCases;



import PageFactory.Demopage;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.Activity;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.swing.text.Element;
import java.net.MalformedURLException;
import java.time.Duration;

public class Appiumdemo extends BaseTest{
    @BeforeMethod
    public void Presetup()
    {
        Activity activity = new Activity("io.appium.android.apis","io.appium.android.apis.ApiDemos");
        driver.startActivity(activity);
    }
      @Test
    public void AppiumBasic()  {
          Demopage demopage = new Demopage(driver);
          String settings ="Abhilash Wifi";
          demopage.UpdateWifisettings(settings);
          //driver.findElement(AppiumBy.accessibilityId("Preference")).click();
          //driver.findElement(By.xpath(
               //   "//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();
          //driver.findElement(By.id("android:id/checkbox")).click();
          //driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
         // String alerttitle = driver.findElement(By.id("android:id/alertTitle")).getText();
          //System.out.println(alerttitle);
          //Assert.assertEquals("WiFi settings",alerttitle);
         // driver.findElement(By.id("android:id/edit")).sendKeys("Abhilash wifi");
          //driver.findElement(By.id("android:id/button1")).click();

      }

      @Test
      public void Longpress(){
          Demopage demopage = new Demopage(driver);
          driver.findElement(AppiumBy.accessibilityId("Views")).click();
          driver.findElement(AppiumBy.accessibilityId("Expandable Lists")).click();
          driver.findElement(AppiumBy.accessibilityId("1. Custom Adapter")).click();
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
          WebElement ele = driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"));
          System.out.println(ele);
          System.out.println("Appium pull and push");
          LongPressAction(ele);
      }
    }

