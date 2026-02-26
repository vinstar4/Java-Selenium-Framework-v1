package utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import testBase.BaseClass;

public class ExtentReportManager1 implements ITestListener {

	ExtentReports extent;
	ExtentTest test;

	@Override
	public void onStart(ITestContext context) {
		ExtentSparkReporter spark = new ExtentSparkReporter("./reports/ExtentReport.html");

		extent = new ExtentReports();
		extent.attachReporter(spark);
	}

	@Override
	public void onTestStart(ITestResult result) {
		// THIS IS THE MISSING PIECE
		test = extent.createTest(result.getMethod().getMethodName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test.pass("Test passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {

		test.fail(result.getThrowable());

		try {
			String imgPath = new BaseClass().captureScreen(result.getMethod().getMethodName());
			test.addScreenCaptureFromPath(imgPath);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onFinish(ITestContext context) {
		extent.flush();
	}
}
