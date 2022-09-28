package TestCases;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Longpresstest extends BaseTest{

    @Test
    public void longpress() throws InterruptedException {
        driver.findElement(AppiumBy.accessibilityId("Views")).click();
        driver.findElement(AppiumBy.accessibilityId("Expandable Lists")).click();
        driver.findElement(AppiumBy.accessibilityId("1. Custom Adapter")).click();
        WebElement ele = driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"));
       LongPressAction(ele); //Replaced the code with method added in base test
        //((JavascriptExecutor) driver).executeScript("mobile: longClickGesture", ImmutableMap.of(
               // "elementId", ((RemoteWebElement) ele).getId(), "duration",2000;
        //));
        Thread.sleep(2000);
    }
}
