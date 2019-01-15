package page.invoice;

import element.Text;
import page.Page;

public class InvoiceDetailsPage extends Page {

    private Text bookingCodeText = new Text("table:nth-child(8) > tbody > tr:nth-child(1) > td:nth-child(2)");
    private Text customerDetailsText = new Text("div > div");
    private Text roomText = new Text("tr:nth-child(2) > td:nth-child(2)");
    private Text checkInText = new Text("tr:nth-child(5) > td:nth-child(2)");
    private Text checkOutText = new Text("tr:nth-child(6) > td:nth-child(2)");
    private Text totalStayCountText = new Text("tr:nth-child(3) > td:nth-child(2)");
    private Text totalStayAmountText = new Text("tr:nth-child(4) > td:nth-child(2)");
    private Text depositNowText = new Text("table:nth-child(12) > tbody > tr > td:nth-child(1)");
    private Text taxVATText = new Text("table:nth-child(12) > tbody > tr > td:nth-child(2)");
    private Text totalAmountText = new Text("tbody > tr > td:nth-child(3)");

    @Override
    public String getUrl() { return null; }

    public Boolean verificaInvoiceDetailsTable(String bookingCode, String customerDetails, String room,
                                               String checkIn, String checkOut, String totalStayCount,
                                               String totalStayAmount, String depositNow, String taxVAT,
                                               String totalAmount) {

        return bookingCodeText.getText().contains(bookingCode) &&
                customerDetailsText.getText().contains(customerDetails) &&
                roomText.getText().contains(room) &&
                checkInText.getText().contains(checkIn) &&
                checkOutText.getText().contains(checkOut) &&
                totalStayCountText.getText().contains(totalStayCount) &&
                totalStayAmountText.getText().contains(totalStayAmount) &&
                depositNowText.getText().contains(depositNow) &&
                taxVATText.getText().contains(taxVAT) &&
                totalAmountText.getText().contains(totalAmount);
    }


}
