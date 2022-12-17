package Hw9.controller;

import Hw9.database.ProductDatabase;
import Hw9.model.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductController {

    public void run(){
        Scanner sc = new Scanner(System.in);

        int option = 0;
        boolean isQuit = false;

        while (!isQuit) {
            showMenu();

            System.out.print("Nhập lựa chọn : ");
            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1: {
                    for (int i = 0; i < ProductDatabase.products.size(); i++) {
                        ProductDatabase.products.get(i).showProduct();
                    }
                    break;
                }
                case 2: {
                    System.out.println("Nhập tên muốn tìm: ");
                    String name = sc.nextLine();
                    for (int i = 0; i < ProductDatabase.products.size(); i++) {
                        if (ProductDatabase.products.get(i).getName().contains(name)){
                            ProductDatabase.products.get(i).showProduct();
                        } else {
                            System.out.println("*** Sản phẩm không tồn tại ***");
                        } break;
                    }
                    break;
                }
                case 3: {
                    System.out.println("Nhập id sản phẩm muốn xoá: ");
                    int idInput = sc.nextInt();
                    for (int i = 0; i < ProductDatabase.products.size(); i++) {
                        if (idInput == ProductDatabase.products.get(i).getId()) {
                            ProductDatabase.products.remove(i);
                            System.out.println("Đã xoá thành công. Vui lòng vào mục 1 để kiểm tra");
                            break;
                        }
                    }
                    break;
                }
                case 4: {
                    System.out.println("Nhập id sản phẩm muốn sửa số lượng: ");
                    int idInput = sc.nextInt();
                    for (int i = 0; i < ProductDatabase.products.size(); i++) {
                        if (idInput == ProductDatabase.products.get(i).getId()){
                            System.out.println("Số lượng hiện tại của sản phẩm là: "+ ProductDatabase.products.get(i).getQuantity());
                            System.out.println("Cập nhật số lượng cho sản phẩm: ");
                            int updatedQuantity = sc.nextInt();
                            ProductDatabase.products.get(i).setQuantity(updatedQuantity);
                            System.out.println("Đã cập nhật thành công. Vui lòng vào mục 1 để kiểm tra");
                            break;
                        }
                    }
                    break;
                }
                case 5: {
                    for (int i = 0; i < ProductDatabase.products.size(); i++) {
                        if (ProductDatabase.products.get(i).getQuantity() < 5){
                            ProductDatabase.products.get(i).showProduct();
                        }
                    }
                    break;
                }
                case 6: {
                    int selection = 0;
                    boolean isBack = false;

                    while (!isBack) {
                        showPriceMenu();

                        System.out.print("Nhập lựa chọn : ");
                        selection = sc.nextInt();

                        switch (selection) {
                            case 1: {
                                for (int i = 0; i < ProductDatabase.products.size(); i++) {
                                    if (ProductDatabase.products.get(i).getPrice() <= 50.00){
                                        ProductDatabase.products.get(i).showProduct();
                                    }
                                }
                                break;
                            }
                            case 2: {
                                for (int i = 0; i < ProductDatabase.products.size(); i++) {
                                    if (ProductDatabase.products.get(i).getPrice() > 50.00 && ProductDatabase.products.get(i).getPrice() < 100.00){
                                        ProductDatabase.products.get(i).showProduct();
                                    }
                                }
                                break;
                            }
                            case 3: {
                                for (int i = 0; i < ProductDatabase.products.size(); i++) {
                                    if (ProductDatabase.products.get(i).getPrice() >= 100.00){
                                        ProductDatabase.products.get(i).showProduct();
                                    }
                                }
                                break;
                            }
                            case 4: {
                                isBack = true;
                                break;
                            }
                            default: {
                                System.out.println("Lựa chọn không hợp lệ");
                                break;
                            }
                        }
                    }

                    break;
                }
                case 7: {
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
        System.out.println("1 - Xem danh sách sản phẩm");
        System.out.println("2 - Tìm sản phẩm theo tên");
        System.out.println("3 - Xoá sản phẩm");
        System.out.println("4 - Cập nhật số lượng sản phẩm");
        System.out.println("5 - Tìm các sản phẩn có số lượng dưới 5");
        System.out.println("6 - Tìm sản phẩm theo mức giá");
        System.out.println("7 - Thoát\n");
    }

    public static void showPriceMenu() {
        System.out.println("\n$$$$$$$$ PRICE MENU $$$$$$$$");
        System.out.println("1 - Các sản phẩm dưới $50");
        System.out.println("2 - Các sản phẩm từ $50 đến $100");
        System.out.println("3 - Các sản phẩm trên $100");
        System.out.println("4 - Thoát\n");
    }

}
