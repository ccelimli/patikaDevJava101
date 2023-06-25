import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Yükseklik:  ");
        int n = input.nextInt();

        for (int i = n  - 1; i >= 0; i--) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i * 2 ; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}