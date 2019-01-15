package element;

import org.openqa.selenium.WebElement;

public class Hyperlink extends BaseElement {

    public Hyperlink(String seletor) {
        super(seletor);
    }

    public void click() {
        WebElement element = getElement();

        element.click();
    }
}
