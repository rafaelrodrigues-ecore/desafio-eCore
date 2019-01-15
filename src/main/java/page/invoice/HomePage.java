package page.invoice;

import element.Button;
import element.TextField;
import page.Page;

public class HomePage extends Page {

    private TextField usarnameTextField = new TextField("input[name=\"username\"]");
    private TextField passwordTextField = new TextField("input[name=\"password\"]");
    private Button loginButton = new Button("button#btnLogin");

    @Override
    public String getUrl() {
        return "https://automation-sandbox.herokuapp.com/";
    }

    public InvoiceListPage loga(String user, String password) {
        goTo();

        usarnameTextField.set(user);
        passwordTextField.set(password);
        loginButton.click();

        return new InvoiceListPage();
    }

    public void tentaLogarComErro(String user, String password) {
        goTo();

        usarnameTextField.set(user);
        passwordTextField.set(password);
        loginButton.click();
    }

    public Boolean verificaMensagemErroLogin(String mensagemErro) { return textExists(mensagemErro); }

}
