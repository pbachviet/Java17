package Lesson6_Test;

import java.util.Scanner;

public class Main3 {
    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời bạn nhập số bất kỳ: ");
        int n = sc.nextInt();
        if (isPrimeNumber(n)){
            System.out.println(n+" là số nguyên tố");
        } else {
            System.out.println(n+" không là số nguyên tố");
        }
    }
}
