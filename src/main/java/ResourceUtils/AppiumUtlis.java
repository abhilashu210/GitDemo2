package ResourceUtils;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class AppiumUtlis {

    public String getscreenshot (String testcasename, AppiumDriver driver) throws IOException {
        File source = driver.getScreenshotAs(OutputType.FILE);
        String dest = (System.getProperty("user.dir")+"\\Report\\" + testcasename + ".png");
        FileHandler.copy(source,new File(dest));
        System.out.println(testcasename);
        return dest;
    }
}
