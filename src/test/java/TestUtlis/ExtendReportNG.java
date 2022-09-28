package TestUtlis;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendReportNG {

    public static ExtentReports getreportobject()
    {
        String path = System.getProperty("user.dir")+"\\Report\\index.html";
        ExtentSparkReporter reporter;
        reporter = new ExtentSparkReporter(path);
        reporter.config().setReportName("SeleniumPOC");
        reporter.config().setDocumentTitle("Test Results");
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(reporter);
        extent.setSystemInfo("Tester","Abhilash");
        return extent;
    }
}

