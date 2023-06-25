import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            int getValue, count = 0;
            Scanner scanner = new Scanner(System.in);

            System.out.print("Sınır Sayısı Giriniz : ");
            getValue = scanner.nextInt();

            System.out.println("Girilen Sayıya Kadar Olan 4'ün Kuvvetleri : ");
            for (int i = 1; i <= getValue; i *= 4) {
                System.out.println("4'ün " + count + " kuvveti : " + i);
                count++;
            }

            count = 0;

            System.out.println("Girilen Sayıya Kadar Olan 5'in Kuvvetleri : ");
            for (int i = 1; i <= getValue; i *= 5) {
                System.out.println("5'in " + count + " kuvveti : " + i);
                count++;
            }
        }
    }
