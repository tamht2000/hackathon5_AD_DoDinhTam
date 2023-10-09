package Exam_Advance_3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class EnrollmentQueue {
    public static void main(String[] args) {
        Queue<String> enrollmentQueue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("****************JAVA-HACKATHON-05-ADVANCE-1-MENU***************");
            System.out.println("1. Nhập tên phụ huynh nộp hồ sơ");
            System.out.println("2. Phụ huynh tiếp theo");
            System.out.println("3. Thoát");
            System.out.print("Chọn: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Nhập tên phụ huynh: ");
                    String parentName = scanner.nextLine();
                    enrollmentQueue.add(parentName);
                    System.out.println("Đã thêm vào hàng đợi.");
                    break;
                case 2:
                    if (!enrollmentQueue.isEmpty()) {
                        String nextParent = enrollmentQueue.poll();
                        System.out.println("Phụ huynh đầu tiên trong danh sách: " + nextParent);
                    } else {
                        System.out.println("Hàng đợi trống rỗng.");
                    }
                    break;
                case 3:
                    System.out.println("Thoát khỏi chương trình.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
                    break;
            }
        }
    }
}
