import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer select;
        Double kilometer;
        Integer age;

        Double pricePerKilometer = 0.10;
        Double otherPassengerTotal = 0.0;
        Double total = 0.0;

        System.out.println("Uçuş Mesafesi(km): ");
        kilometer = input.nextDouble();

        System.out.println("Yaşınız: ");
        age = input.nextInt();

        System.out.println("\t\tUçuş Tipi\n1- Tek Yön\n2- Gidiş-Dönüş");
        select = input.nextInt();
        switch (select) {
            case 1:
                if (age < 12) {
                    total += (kilometer * (pricePerKilometer * 0.5));
                } else if (12 <= age && age < 24) {
                    total += (kilometer * (pricePerKilometer * 0.9));
                } else if (age > 65) {
                    total += (kilometer * (pricePerKilometer * 0.7));
                } else {
                    total += kilometer * pricePerKilometer;
                }

                System.out.println(total);

            case 2:
                if (age < 12) {
                    total += ((kilometer * (pricePerKilometer * 0.5)) * 2) * 0.8;
                } else if (12 <= age && age < 24) {
                    total += ((kilometer * (pricePerKilometer * 0.9)) * 2) * 0.8;
                } else if (age > 65) {
                    total += ((kilometer * (pricePerKilometer * 0.7)) * 2) * 0.8;
                } else {
                    total += (kilometer * pricePerKilometer * 2) * 0.8;
                }

                System.out.println(total);
        }
    }
}