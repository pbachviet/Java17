package Lesson6_Test;

public class Main4 {
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
        System.out.print("10 số nguyên tố đầu tiên là:  ");
        int count = 0;
        int j = 2;
        while (count < 10){
            if (isPrimeNumber(j)){
                count++;
                System.out.print(j+"  ");
            }
            j++;
        }

        System.out.println();
        System.out.print("Các số nguyên tố nhỏ hơn 10 là: ");
        for (int i=0; i<10; i++){
            if (isPrimeNumber(i)){
                System.out.print(i+"\t");
            }
        }
    }
}
