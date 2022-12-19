package DocumentAccountingSystem;

import java.util.Date;

public class ContractForTheSupply extends Register{
    private int documentID;
    private String productType;
    private int quantityOfProduct;
    private Date documentDate;

    public ContractForTheSupply(int documentID, String productType, int quantityOfProduct, Date documentDate) {
        this.documentID = documentID;
        this.productType = productType;
        this.quantityOfProduct = quantityOfProduct;
        this.documentDate = documentDate;
        save();
        give();
    }

    public int getDocumentID() {
        return documentID;
    }

    public void setDocumentID(int documentID) {
        this.documentID = documentID;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public int getQuantityOfProduct() {
        return quantityOfProduct;
    }

    public void setQuantityOfProduct(int quantityOfProduct) {
        this.quantityOfProduct = quantityOfProduct;
    }

    public Date getDocumentDate() {
        return documentDate;
    }

    public void setDocumentDate(Date documentDate) {
        this.documentDate = documentDate;
    }

    @Override
    public void save() {

    }

    @Override
    public void give() {
        System.out.println("ContractForTheSupply{" +
                "documentID=" + documentID +
                ", productType='" + productType + '\'' +
                ", quantityOfProduct=" + quantityOfProduct +
                ", documentDate=" + documentDate +
                '}');

    }
}
