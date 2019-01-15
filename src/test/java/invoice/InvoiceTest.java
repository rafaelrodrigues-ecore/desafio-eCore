package invoice;

import base.BaseTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import page.invoice.HomePage;
import page.invoice.InvoiceDetailsPage;
import page.invoice.InvoiceListPage;

import static org.testng.Assert.assertTrue;

public class InvoiceTest extends BaseTest {

    @Test(dataProvider="getDataTC003", description = "TC003 - Validar informação de Invoice")
    public void invoice(String user, String password, String hotelName, String invoiceDate,
                        String dueDate, String invoiceNumber, String bookingCode, String customerDetails,
                        String room, String checkIn, String checkOut, String totalStayCount, String totalStayAmount,
                        String depositNow, String taxVAT, String totalAmount) {
        InvoiceListPage invoiceListPage = new HomePage().loga(user, password);
        Boolean invoiceListTable = invoiceListPage.verificarInvoiceListTable(invoiceNumber, hotelName, invoiceDate, dueDate);
        invoiceListPage.goToinvoiceDetails();

        InvoiceDetailsPage invoiceDetailsPage = new InvoiceDetailsPage();

        Boolean invoiceDetailsTable = invoiceDetailsPage.verificaInvoiceDetailsTable(bookingCode, customerDetails, room, checkIn, checkOut, totalStayCount, totalStayAmount, depositNow, taxVAT, totalAmount);
        assertTrue(invoiceListTable && invoiceDetailsTable);
    }

    // Este teste está falhando devido ao valor informado no PDF = USD $19.00 (No sistema o '.00' não existe)
    @DataProvider
    public Object[][] getDataTC003() {

        return new Object[][]{{"demouser","abc123","Rendezvous Hotel","14/01/2018",
                "15/01/2018","110", "0875", "JOHNY SMITH\nR2, AVENUE DU MAROC\n123456",
        "Superior Double", "14/01/2018", "15/01/2018", "1", "$150", "USD $20.90", "USD $19.00", "USD $209"}};
    }

}
