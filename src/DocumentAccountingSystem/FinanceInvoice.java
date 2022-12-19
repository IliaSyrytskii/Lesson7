package DocumentAccountingSystem;

import java.util.Date;

public class FinanceInvoice extends Register {
    private Date documentDate;
    private int documentID;
    private double monthAmount;
    private int codeDepartament;

    public FinanceInvoice(Date documentDate, int documentID, double monthAmount, int codeDepartament) {
        this.documentDate = documentDate;
        this.documentID = documentID;
        this.monthAmount = monthAmount;
        this.codeDepartament = codeDepartament;
        save();
        give();
    }

    @Override
    public void save() {

    }

    @Override
    public void give() {
        System.out.println("FinanceInvoice{" +
                "documentDate=" + documentDate +
                ", documentID=" + documentID +
                ", monthAmount=" + monthAmount +
                ", codeDepartament=" + codeDepartament +
                '}');

    }

}
