package Exam_Advance_2;

import java.util.Scanner;
import java.util.Stack;

public class ReverseSentence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> wordStack = new Stack<>();
        String sentence;

        while (true) {
            System.out.println("****************JAVA-HACKATHON-05-ADVANCE-1-MENU***************");
            System.out.println("1. Nhập câu");
            System.out.println("2. Đảo ngược câu");
            System.out.println("3. Thoát");
            System.out.print("Chọn một tùy chọn (1/2/3): ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Nhập câu: ");
                    sentence = scanner.nextLine();
                    // Tách các từ trong câu và đưa chúng vào stack
                    String[] words = sentence.split(" ");
                    for (String word : words) {
                        wordStack.push(word);
                    }
                    break;
                case 2:
                    System.out.println("Câu sau khi đảo ngược:");
                    // Đảo ngược và hiển thị câu
                    while (!wordStack.isEmpty()) {
                        System.out.print(wordStack.pop() + " ");
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Kết thúc chương trình.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Tùy chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }
}
