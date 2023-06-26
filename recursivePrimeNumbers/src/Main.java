import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Sayı Gir: ");
        int number = input.nextInt();

        if (isPrime(number)) {
            System.out.println(number + " bir asal sayıdır.");
        } else {
            System.out.println(number + " bir asal sayı değildir.");
        }
    }

    public static boolean isPrime(int number) {
        return isPrimeRecursive(number, number / 2);
    }

    public static boolean isPrimeRecursive(int number, int divisor) {
        if (divisor == 1) {
            return true;
        } else if (number % divisor == 0) {
            return false;
        } else {
            return isPrimeRecursive(number, divisor - 1);
        }
    }
}



