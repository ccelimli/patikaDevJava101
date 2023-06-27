import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int count, number;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç adet Sayı Gireceksiniz : ");
        count = scanner.nextInt();

        int numbers[] = new int[count];

        for (int i = 0; i < count; i++) {
            System.out.print(i +1 + ". Sayıyı Giriniz : ");
            number = scanner.nextInt();
            numbers[i] = number;
        }

        Arrays.sort(numbers);

        for (int item : numbers) {
            System.out.print(item + " ");
        }

    }
}