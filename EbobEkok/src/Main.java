import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int firstNumber, secondNumber, i = 1, ebob = 1, ekok = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Küçük Sayı: ");
        firstNumber = input.nextInt();
        System.out.print("Büyük Sayı: ");
        secondNumber = input.nextInt();

        while (i <= firstNumber) {
            if (firstNumber % i == 0 && secondNumber % i == 0) {
                ebob = i;
            }
            i++;
        }
        System.out.println("Ebob: " + ebob);

        while (i <= firstNumber * secondNumber) {
            if (i % firstNumber == 0 && i % secondNumber == 0) {
                ekok = i;
                break;
            }
            i++;
        }
        System.out.print("Ekok: " + ekok);
    }
}

