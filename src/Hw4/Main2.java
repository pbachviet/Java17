package Hw4;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Mời bạn nhập n: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i=0; i< arr.length; i++){
            System.out.println("Nhập phần tử "+ i);
            arr[i] = sc.nextInt();
        }
        System.out.println("\n");
        System.out.print("Mảng bạn vừa nhập là:  ");
        for (int i=0; i< arr.length; i++){
            System.out.print(arr[i]+"  ");
        }

        int selection = 0;
        boolean isQuit = false;
        while (!isQuit){
            System.out.println("\n********* MENU *********");
            System.out.println("1 - Tăng các phần tử chẵn trong mảng lên 1 đơn vị");
            System.out.println("2 - Tăng các phần tử lẻ trong mảng lên 1 đơn vị");
            System.out.println("3 - Thoát\n");

            System.out.print("Nhập lựa chọn : ");
            selection = sc.nextInt();

            switch (selection) {
                case 1: {
                    System.out.print("Sau khi tăng số chẵn:  ");
                    for (int i=0; i< arr.length; i++){
                        if (arr[i] % 2 == 0){
                            arr[i]++;
                        }
                        System.out.print(arr[i]+"  ");
                    }
                    break;
                }
                case 2: {
                    System.out.print("Sau khi tăng số chẵn:  ");
                    for (int i=0; i< arr.length; i++){
                        if (arr[i] % 2 != 0){
                            arr[i]++;
                        }
                        System.out.print(arr[i]+"  ");
                    }
                    break;
                }
                case 3: {
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
}
