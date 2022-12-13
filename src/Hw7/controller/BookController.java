package Hw7.controller;

import Hw7.service.BookService;

import java.util.Scanner;

public class BookController {
    public BookService bookService = new BookService();

    public void run() {
        Scanner sc = new Scanner(System.in);

        int option = 0;
        boolean isQuit = false;

        while (!isQuit) {
            showMenu();

            System.out.print("Nhập lựa chọn : ");
            option = Integer.parseInt(sc.nextLine());

            switch (option) {
                case 1: {
                    System.out.print("Nhập tiêu đề sách cần tìm : ");
                    String title = sc.nextLine();
                    bookService.findByTitle(title);
                    break;
                }
                case 2: {
                    System.out.println("Nhập thể loại sách cần tìm: ");
                    String category = sc.nextLine();
                    bookService.findByCategory(category);
                    break;
                }
                case 3: {
                    System.out.println("Các sách được xuất bản trong năm nay là: ");
                    bookService.listBookThisYear();
                    break;
                }
                case 4: {
                    isQuit = true;
                    break;
                }
                default: {
                    System.out.println("Lựa chọn không hợp lệ");
                    break;
                }
            }
        }
    }

    public static void showMenu() {
        System.out.println("\n********* MENU *********");
        System.out.println("1 - Tìm kiếm sách theo tên");
        System.out.println("2 - Tìm kiếm sách theo thể loại");
        System.out.println("3 - Liệt kê các sách trong năm nay");
        System.out.println("4 - Thoát\n");
    }
}
