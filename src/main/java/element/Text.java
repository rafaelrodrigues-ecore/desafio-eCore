package element;

public class Text extends BaseElement {

    public Text(String seletor) {
        super(seletor);
    }

    public String getText() {
        return getElement().getText();
    }

}
