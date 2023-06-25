import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number, total = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        number = scanner.nextInt();

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total += i;
            }
        }

        if (total == number) {
            System.out.println(number + " Mükemmel Sayıdır.");
        } else {
            System.out.println(number + " Mükemmel Sayı Değildir.");
        }
    }
}