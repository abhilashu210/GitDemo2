package TestUtlis;

import ResourceUtils.AppiumUtlis;
import TestCases.BaseTest;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

public class Listener extends AppiumUtlis implements ITestListener {
    ExtentReports extent = ExtendReportNG.getreportobject();
    ExtentTest test;
    AppiumDriver driver;

    @Override
    public void onFinish(ITestContext context) {
        extent.flush();
    }

    @Override
    public void onTestStart(ITestResult result) {
        test = extent.createTest(result.getMethod().getMethodName());
    }

    @Override
    public void onTestFailure(ITestResult result) {

    }

    @Override
    public void onTestSuccess(ITestResult result) {
        test.log(Status.PASS,"Test Passed");
        try {
            driver = (AppiumDriver) result.getTestClass().getRealClass().getField("driver").get(result.getInstance());
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
        try {
            test.addScreenCaptureFromPath(getscreenshot(result.getMethod().getMethodName(),driver));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
