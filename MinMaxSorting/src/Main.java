import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numbers[] = {15, 12, 788, 1, -1, -778, 2, 0};
        int getValue;
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayı Giriniz : ");
        getValue = scanner.nextInt();

        for (int number : numbers){
            if (number < getValue && number > min) {
                min = number;
            } else if (number > getValue && number < max) {
                max = number;
            }
        }

        System.out.println("Girilen sayıdan küçük en yakın sayı: " + min);
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + max);
    }
}
