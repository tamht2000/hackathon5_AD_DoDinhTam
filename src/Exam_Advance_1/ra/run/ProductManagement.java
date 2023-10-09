package Exam_Advance_1.ra.run;

import Exam_Advance_1.ra.bussinessImp.Catalog;
import Exam_Advance_1.ra.bussinessImp.Product;

import java.util.*;

public class ProductManagement {
    public static Scanner sc = new Scanner(System.in);
    public static int choice;
    public static List<Catalog> catalogList = new ArrayList<>();
    public static List<Product> productList = new ArrayList<>();

    public static void main(String[] args) {
        do {
            System.out.println("****************JAVA-HACKATHON-05-ADVANCE-2-MENU***************");
            System.out.println("1. Nhập số danh mục sản phẩm và nhập thông tin các danh mục");
            System.out.println("2. Nhập số sản phẩm và nhập thông tin các sản phẩm");
            System.out.println("3. Sắp xếp sản phẩm theo giá sản phẩm tăng dần (Comparable/Comparator)");
            System.out.println("4. Tìm kiếm sản phẩm theo tên danh mục sản phẩm");
            System.out.println("5. Thoát");

            System.out.print("Nhập vào lựa chọn của bạn (1-5): ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.print("Nhập số catalog (n): ");
                    int n = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < n; i++) {
                        Catalog catalog = new Catalog();
                        catalog.inputData();
                        catalogList.add(catalog);
                    }
                    break;
                case 2:
                    if (catalogList.isEmpty()) {
                        System.out.println("Chưa có danh mục sản phẩm nào. Vui lòng thêm danh mục trước.");
                    } else {
                        System.out.println("Danh sách danh mục sản phẩm có sẵn:");
                        for (int i = 0; i < catalogList.size(); i++) {
                            System.out.println((i + 1) + ". " + "ID: " + catalogList.get(i).getCatalogId() + " - Name: " + catalogList.get(i).getCatalogName());
                        }
                        System.out.print("Chọn một danh mục (theo ID):");
                        int selectedCatalogIndex = Integer.parseInt(sc.nextLine());
                        // Tìm danh mục theo mã
                        Catalog selectedCatalog = null;
                        for (Catalog catalog : catalogList) {
                            if (catalog.getCatalogId() == selectedCatalogIndex) {
                                selectedCatalog = catalog;
                                break;
                            }
                        }

                        if (selectedCatalog == null) {
                            System.out.println("Không tìm thấy danh mục với mã danh mục này.");
                        } else {
                            Product product = new Product();
                            product.inputData();
                            product.setCatalog(selectedCatalog);
                            productList.add(product);
                            System.out.println("Sản phẩm đã được thêm.");
                        }
                    }
                    break;
                case 3:
                    Collections.sort(productList, Comparator.comparing(Product::getExportPrice));
                    for (Product product : productList) {
                        product.displayData();
                    }
                    break;
                case 4:
                    System.out.println("Nhập tên danh mục cần tìm: ");
                    String categoryName = sc.nextLine();
                    for (Product product : productList) {
                        if (product.getCatalog().getCatalogName().equalsIgnoreCase(categoryName)) {
                            product.displayData();
                        }
                    }
                    break;
                case 5:
                    System.out.println("Đã thoát!");
                    System.exit(0);
                    break;
                default:
                    System.err.println("Lựa chọn không hợp lệ, vui lòng chọn lại");
                    break;
            }

        }
        while (true);

    }
}
