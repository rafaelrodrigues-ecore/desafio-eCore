package base;

import browser.Chrome;
import org.testng.annotations.AfterClass;

public class BaseTest {

    @AfterClass
    public static void clean() {
        Chrome.getDriver().quit();
    }

}
