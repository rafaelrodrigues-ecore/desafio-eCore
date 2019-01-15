package element;

import org.openqa.selenium.WebElement;

public class Checkbox extends BaseElement {

    public Checkbox(String seletor) {
        super(seletor);
    }

    public void check() {
        WebElement element = getElement();

        if (!element.isSelected()) {
            element.click();
        }
    }

    public void uncheck() {
        WebElement element = getElement();

        if (element.isSelected()) {
            element.click();
        }
    }

}
