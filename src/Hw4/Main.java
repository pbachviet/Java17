package Hw4;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập tên: ");
        String name = sc.nextLine();
        String [] arrName = name.split(" ");
        for (int i=0; i<arrName.length; i++){
            String word = arrName[i];
            String firstLetter = word.substring(0,1).toUpperCase();
            String convertedName = firstLetter + word.substring(1);
            System.out.print(convertedName + " ");
        }
    }
}
