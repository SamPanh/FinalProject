package test;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class TestListener implements ITestListener {
    @Override
    public void onFinish(ITestContext result) {
        Reporter.log("Kết thúc auto test");
    }

    @Override
    public void onStart(ITestContext result) {
        Reporter.log("Đây là đoạn khởi động auto test");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
    	 Reporter.log("Đây là test case bị fail có phần trăm pass: " + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        Reporter.log("Đây là test case bị fail: " + result.getName());

    }

    @Override
    public void onTestSkipped(ITestResult result) {
        Reporter.log("Đây là test case bị bỏ qua: " + result.getName());

    }

    @Override
    public void onTestStart(ITestResult result) {

    }

    @Override
    public void onTestSuccess(ITestResult result) {
        Reporter.log("Đây là test case chạy thành công: " + result.getName());

    }
}
