package Lesson6_Test;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào chuỗi bất kỳ: ");
        String text = sc.nextLine();

        StringTokenizer stringTokenizer = new StringTokenizer(text);
        int countWord = stringTokenizer.countTokens();
        System.out.println("Số từ trong chuỗi là: "+ countWord);

        char letter = 'o';
        int countLetter = 0;
        System.out.print("Index của các ký tự o là: ");
        for (int i=0; i<text.length(); i++){
            if (text.charAt(i) == letter){
                System.out.print((i+1)+ ",");
                countLetter++;
            }
        }
        System.out.println("\nSố lần ký tự o xuất hiện là: "+ countLetter);
    }
}
