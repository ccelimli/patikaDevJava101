import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int number, temp;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Gir: ");
        number = input.nextInt();
        temp = number;
        firstDeisgn(number, temp);
    }

    public static void firstDeisgn(int number, int temp) {
        if (number > 0) {
            System.out.print(number + " ");
            firstDeisgn(number - 5, temp);
        } else if (number <= 0) {
            secondDeisgn(number, temp);
        }
    }

    public static void secondDeisgn(int number, int temp) {
        if (temp >= number) {
            System.out.print(number + " ");
            secondDeisgn(number + 5, temp);
        }
    }
}
