import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int count, number, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç Adet Sayı Gireceksiniz : ");
        count = scanner.nextInt();

        for (int i = 1; i <= count; i++) {
            System.out.print("Sayi " + i + " : " );
            number = scanner.nextInt();

            if (number > max) {
                max = number;
            } else if (number < min) {
                min = number;
            }
        }

        System.out.println("Max : " + max);
        System.out.println("Min : " + min);
    }
}
