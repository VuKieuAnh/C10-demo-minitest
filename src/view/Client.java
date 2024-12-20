package view;

import controller.demo1.BookManager;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
//        menu: 1 -> tinh tong
        switch (choice) {
            case 1:
                System.out.println("Tong tien sach la");
                int priceSum =
                BookManager.sumPrice();
                System.out.println(priceSum);
                break;
            case 2:
                System.out.println("Moi ban nhap vao ngon ngu");
                String lag = scanner.nextLine();
                BookManager.countByLanguage(lag);
                break;

        }
//        2: so sach ..
    }
}
