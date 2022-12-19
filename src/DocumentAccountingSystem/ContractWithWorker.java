package DocumentAccountingSystem;

import java.util.Date;

public class ContractWithWorker extends Register {
    private Date documentDate;
    private int documentID;
    private Date contractStart;
    private Date contractEnd;
    private String workerName;

    public ContractWithWorker(Date documentDate, int documentID, Date contractStart, Date contractEnd, String workerName) {
        this.documentDate = documentDate;
        this.documentID = documentID;
        this.contractStart = contractStart;
        this.contractEnd = contractEnd;
        this.workerName = workerName;
        save();
        give();
    }

    @Override
    public void save() {

    }

    @Override
    public void give() {
        System.out.println("ContractWithWorker{" +
                "documentDate=" + documentDate +
                ", documentID=" + documentID +
                ", monthAmount=" + contractStart +
                ", codeDepartament=" + contractEnd +
                ", workerName='" + workerName + '\'' +
                '}');
    }
}
