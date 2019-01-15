package element;

import org.openqa.selenium.WebElement;

public class TextField extends BaseElement {

    public TextField(String seletor) {
        super(seletor);
    }

    public void set(String text) {
        WebElement element = getElement();
        element.clear();
        element.sendKeys(text);
    }

}
