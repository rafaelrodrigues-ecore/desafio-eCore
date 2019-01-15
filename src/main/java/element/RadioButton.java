package element;

import org.openqa.selenium.WebElement;

public class RadioButton extends BaseElement {

    public RadioButton(final String seletor) {
        super(seletor);
    }

    public void check() {
        WebElement element = getElement();

        if (!element.isSelected()) {
            element.click();
        }
    }

}
