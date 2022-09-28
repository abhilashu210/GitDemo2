package ResourceUtils;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

public class AndroidAction {
    AndroidDriver driver;

    public AndroidAction(AndroidDriver driver) {
        this.driver = driver;
    }

    public void LongPressAction(WebElement Element) {

        ((JavascriptExecutor) driver).executeScript("mobile: longClickGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) Element).getId(), "duration", 2000
        ));
    }
}