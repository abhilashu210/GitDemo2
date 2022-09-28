package TestCases;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class BaseTest {
    public AndroidDriver driver;
    AppiumDriverLocalService service;
   @BeforeClass
    public void ConfigureAppium() throws MalformedURLException {
    service = new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\aunnithan\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
            .withIPAddress("127.0.0.1").usingPort(4723).build();
    service.start();
    UiAutomator2Options options = new UiAutomator2Options();
    options.setDeviceName("AbhilashAndroidDev");
    options.setApp("C:\\Users\\aunnithan\\IdeaProjects\\AppiumDemo\\src\\main\\java\\Resources\\ApiDemos-debug.apk");
    driver = new AndroidDriver(service.getUrl(),options);
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
}

    public void LongPressAction(WebElement ele){
        ((JavascriptExecutor) driver).executeScript("mobile: longClickGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) ele).getId(), "duration",2000
        ));}
@AfterClass
public void TearDown(){
    driver.quit();
    service.stop();
}
}
