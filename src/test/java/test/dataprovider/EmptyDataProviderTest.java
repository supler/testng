package test.dataprovider;

import org.testng.Assert;
import org.testng.ITestNGListener;
import org.testng.TestListenerAdapter;
import org.testng.TestNG;
import org.testng.annotations.Test;

public class EmptyDataProviderTest {

    @Test
    public void test() {
        TestNG testng = new TestNG(false);
        TestListenerAdapter tla = new TestListenerAdapter();
        testng.addListener((ITestNGListener) tla);
        // Used to check the warning message
        testng.setVerbose(2);
        testng.setTestClasses(new Class[]{EmptyDataProviderSample.class});

        testng.run();

        Assert.assertTrue(tla.getFailedTests().isEmpty());
        Assert.assertTrue(tla.getSkippedTests().isEmpty());
        Assert.assertTrue(tla.getPassedTests().isEmpty());
    }
}
