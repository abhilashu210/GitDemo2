package TestCases;

import io.appium.java_client.AppiumBy;
import org.testng.annotations.Test;

public class ScrollAction extends BaseTest{
        @Test
                public void scrollaction() throws InterruptedException {
        driver.findElement(AppiumBy.accessibilityId("Views")).click();
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));"));
        Thread.sleep(2000);
        System.out.println("git commit");
        }
    }

