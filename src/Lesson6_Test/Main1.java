package Lesson6_Test;

public class Main1 {
    public static void main(String[] args) {
        System.out.println("hình vuông: ");
        for (int i=1; i<5; i++){
            for (int j = 0; j < 4; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("hình tam giác 1: ");
        for (int i=1; i<5; i++){
            for (int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("hình tam giác 2: ");
        for (int i=1; i<5; i++){
            for (int j=2*(5-i); j>=0; j--){
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
