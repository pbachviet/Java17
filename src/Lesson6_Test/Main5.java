package Lesson6_Test;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập số dòng: ");
        int row1 = sc.nextInt();
        System.out.println("Mời bạn nhập số cột: ");
        int column1 = sc.nextInt();
        int row2 = row1;
        int column2 = column1;
        int [][] array1 = new int[row1][column1];
        int [][] array2 = new int[row2][column2];
        int sum = 0;
        for (int i=0; i<row1; i++){
            for (int j=0; j<column1; j++){
                System.out.println("Mời bạn nhập giá trị array1["+i+"]["+j+"]: ");
                array1[i][j] = sc.nextInt();
            }
        }
        for (int i=0; i<row2; i++){
            for (int j=0; j<column2; j++){
                System.out.println("Mời bạn nhập giá trị array2["+i+"]["+j+"]: ");
                array2[i][j] = sc.nextInt();
            }
        }
        System.out.println("Mảng 1: ");
        for (int i=0; i<row1; i++){
            for (int j=0; j<column1; j++){
                System.out.print(array1[i][j]+"\t");
            }
            System.out.println("\n");
        }
        System.out.println("Đường chéo mảng 1 là: ");
        for (int i=0; i<row1; i++){
            System.out.println(array1[i][i]);
        }
        System.out.println("Mảng 2: ");
        for (int i=0; i<row1; i++){
            for (int j=0; j<column1; j++){
                System.out.print(array2[i][j]+"\t");
                sum = sum + array1[i][j] + array2[i][j];
            }
            System.out.println("\n");
        }
        System.out.println("Đường chéo mảng 2 là: ");
        for (int i=0; i<row1; i++){
            System.out.println(array2[i][i]);
        }
        System.out.println("Tổng giá trị 2 mảng là: "+ sum);
    }
}
