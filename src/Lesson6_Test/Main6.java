package Lesson6_Test;

import java.util.Scanner;

import java.util.regex.Pattern;

public class Main6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String EMAIL_PATTERN = "^(0?)(3[2-9]|5[6|8|9]|7[0|6-9]|8[0-6|8|9]|9[0-4|6-9])[0-9]{7}$";

        String PHONENUMBER_PATTERN = "^\\d{9,11}$";

        System.out.print("Nhập email: ");
        String email = sc.nextLine();
        if (Pattern.matches(EMAIL_PATTERN, email)){
            System.out.println("Thành công");
        } else {
            System.out.println("Email không đúng");
        }

        System.out.println("Nhập số điện thoại: ");
        String phoneNum = sc.nextLine();
        if (Pattern.matches(PHONENUMBER_PATTERN, phoneNum)){
            System.out.println("Thành công");
        } else {
            System.out.println("Số điện thoại không đúng");
        }
    }
}
