package tuan04.bai08;

import java.util.Scanner;

public class TestCD {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        // Khởi tạo danh sách CD với kích thước ban đầu là 2
        ListCD list = new ListCD(2);
        int choice;

        do {
            System.out.println("\n--- CD MANAGEMENT SYSTEM ---");
            System.out.println("1. Add a new CD");
            System.out.println("2. Remove CD by ID");
            System.out.println("3. Update CD price");
            System.out.println("4. Print CD list");
            System.out.println("5. Calculate total cost");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");

            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                choice = -1; // Gán giá trị không hợp lệ nếu người dùng nhập chữ
            }

            switch (choice) {
                case 1:
                    list.inputCD(sc);
                    break;
                case 2:
                    list.removeCD(sc);
                    break;
                case 3:
                    list.updatePriceCD(sc);
                    break;
                case 4:
                    list.printList();
                    break;
                case 5:
                    double total = list.calculateTotalCost();
                    System.out.println("=> Total Cost of all CDs: " + total);
                    break;
                case 0:
                    System.out.println("=> Exiting program. Goodbye!");
                    break;
                default:
                    System.out.println("=> Error: Invalid choice! Please choose from 1 to 6.");
            }
        } while (choice != 0);

        sc.close();
    }
}
