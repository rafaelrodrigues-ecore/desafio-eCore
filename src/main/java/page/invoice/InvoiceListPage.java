package page.invoice;

import element.Hyperlink;
import element.Text;
import page.Page;

public class InvoiceListPage extends Page {

    private Hyperlink invoiceDetailsHyperlink = new Hyperlink("div:nth-child(3) > div:nth-child(5) > a");
    private Text invoiceNumberText = new Text("div:nth-child(3) > div:nth-child(1)");
    private Text hotelNameText = new Text("div:nth-child(3) > div:nth-child(2)");
    private Text invoiceDateText = new Text("div:nth-child(3) > div:nth-child(3)");
    private Text dueDateText = new Text("div:nth-child(3) > div:nth-child(4)");

    @Override
    public String getUrl() {
        return null;
    }

    public void goToinvoiceDetails() {
        invoiceDetailsHyperlink.click();
        goToNextWindow();
    }

    public Boolean estarInvoiceListPage(String invoiceListTitle) {
        return textExists(invoiceListTitle);
    }

    public Boolean verificarInvoiceListTable(String invoiceNumber, String hotelName, String invoiceDate, String dueDate)
    {

        return invoiceNumberText.getText().contains(invoiceNumber) &&
        hotelNameText.getText().contains(hotelName) &&
        invoiceDateText.getText().contains(invoiceDate) &&
        dueDateText.getText().contains(dueDate);

    }

}
