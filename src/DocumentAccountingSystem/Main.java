package DocumentAccountingSystem;

import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main (String[] args) {
        ContractForTheSupply contract1 = new ContractForTheSupply(1, "Computer", 4, new Date(2013, Calendar.DECEMBER,17));
        contract1.give();

        System.out.println();

        ContractWithWorker contract2 = new ContractWithWorker(new Date(2013, Calendar.NOVEMBER, 2014), 2, new Date(2013,Calendar.NOVEMBER, 15), new Date(2014, Calendar.NOVEMBER, 12), "Andrey");
        contract2.give();

        System.out.println();

        FinanceInvoice invoice = new FinanceInvoice(new Date(2013, Calendar.OCTOBER, 11),3, 5400.00, 3);
        invoice.give();
    }
}
