package login;

import base.BaseTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import page.invoice.HomePage;
import page.invoice.InvoiceListPage;

import static org.testng.Assert.assertTrue;

public class LoginTest extends BaseTest {

    @Test(dataProvider="getDataTC001", description = "TC001 - Login (Positivo)")
    public void deveLogarUsuarioComSucesso(String user, String password) {
        InvoiceListPage invoiceListPage = new HomePage().loga(user, password);

        assertTrue(invoiceListPage.estarInvoiceListPage("Invoice List"));
    }

    @Test(dataProvider="getDataTC002", description = "TC002 - Login (Negativo)")
    public void deveRetornarErroQuandoLogarUsuarioComCredencialInvalida(String user, String password) {
        HomePage homePage = new HomePage();

        homePage.tentaLogarComErro(user, password);

        assertTrue(homePage.verificaMensagemErroLogin("Wrong username or password"));
    }

    @DataProvider
    public Object[][] getDataTC001() {
        return new Object[][]{{"demouser", "abc123"}};
    }

    // Massa de dados duplicada para o usuário 'Demouser' e password 'abc123'
    @DataProvider
    public Object[][] getDataTC002() {
        return new Object[][]{{"Demouser", "abc123"}, {"demouser_", "xyz"}, {"demouser", "nananana"}, {"Demouser", "abc123"}};
    }

}
