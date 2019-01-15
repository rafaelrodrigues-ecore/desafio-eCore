package page;

import browser.Chrome;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.Espera;

import java.util.Set;

import static utils.Espera.waitForNumberOfWindowsToEqual;

public abstract class Page {

    protected ChromeDriver driver = Chrome.getDriver();

    public void goTo() {
        driver.get(getUrl());
    }

    public abstract String getUrl();

    public boolean textExists(String text) {

        try {
            Thread.sleep(4000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return driver.getPageSource().contains(text);
    }

    public void goToNextWindow() {
        String firstWindow = driver.getWindowHandle();
        String newWindow = "";

        waitForNumberOfWindowsToEqual(2);

        Set<String> allWindows = driver.getWindowHandles();

        for (String window : allWindows) {
            if (!window.equals(firstWindow)) {
                newWindow = window;
            }
        }

        driver.switchTo().window(newWindow);
    }
}
