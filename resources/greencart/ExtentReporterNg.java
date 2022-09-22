package greencart;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporterNg {
	static ExtentReports report1;
	public static ExtentReports getreport()
	{
		
	String path=System.getProperty("user.dir")+"//Reports//"+"index.html";
	ExtentSparkReporter reporter=new ExtentSparkReporter(path);
    report1=new ExtentReports();
    reporter.config().setReportName("MyfirstframeworkReport");
    reporter.config().setDocumentTitle("Test Result");
    report1.attachReporter(reporter);
    report1.setSystemInfo("Tester", "Rohini");
    return report1;
	}
}
