package element;

import org.openqa.selenium.WebElement;

public class Button extends BaseElement {

    public Button(String seletor) {
        super(seletor);
    }

    public void click() {
        WebElement element = getElement();

        element.click();
    }
}
