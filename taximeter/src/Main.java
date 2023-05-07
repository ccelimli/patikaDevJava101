import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Double openingFee = 10.0;
        Double minimumFee = 20.0;
        Double feePerKm = 2.2;
        Double totalFee = 0.0;
        Double km = 0.0;

        Scanner input = new Scanner(System.in);
        System.out.println("Km: ");
        km = input.nextDouble();

        totalFee = (km * feePerKm) + openingFee;

        if (totalFee<20) {
            System.out.println("Ödenecek Tutar: "+minimumFee);
        }
        else {
            System.out.println("Ödenecek Tutar: " + new DecimalFormat("##.##").format(totalFee));
        }
    }
}