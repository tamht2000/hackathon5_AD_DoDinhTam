package Exam_Advance_1.ra.bussinessImp;

import Exam_Advance_1.ra.bussiness.IShop;

import static Exam_Advance_1.ra.run.ProductManagement.sc;

public class Catalog implements IShop {
    private int catalogId;
    private String catalogName;
    private int priority;
    private String descriptions;
    private boolean catalogStatus;

    public Catalog() {
    }

    public Catalog(int catalogId, String catalogName, int priority, String descriptions, boolean catalogStatus) {
        this.catalogId = catalogId;
        this.catalogName = catalogName;
        this.priority = priority;
        this.descriptions = descriptions;
        this.catalogStatus = catalogStatus;
    }

    public int getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(int catalogId) {
        this.catalogId = catalogId;
    }

    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public boolean isCatalogStatus() {
        return catalogStatus;
    }

    public void setCatalogStatus(boolean catalogStatus) {
        this.catalogStatus = catalogStatus;
    }

    @Override
    public void inputData() {
        System.out.println("Vui lòng nhập id danh mục: ");
        catalogId = Integer.parseInt(sc.nextLine());
        System.out.println("Vui lòng nhập tên danh mục: ");
        catalogName = sc.nextLine();
        System.out.println("Vui lòng nhập độ ưu tiên: ");
        priority = Integer.parseInt(sc.nextLine());
        System.out.println("Vui lòng nhập mô tả: ");
        descriptions = sc.nextLine();

        System.out.println("Vui lòng nhập trạng thái hoạt động danh mục(true/false): ");
        String isActive = sc.nextLine();
        if (isActive.equals("true")) {
            catalogStatus = true;
        } else if (isActive.equals("false")) {
            catalogStatus = false;
        } else {
            catalogStatus = false;
        }
    }

    @Override
    public void displayData() {
        System.out.printf("ID: %d - Name: %s - Priority: %d - Description: %s - Status: %s\n", catalogId, catalogName, priority, descriptions, catalogStatus);
        System.out.println("----------------------------------------------------------------");
    }
}
