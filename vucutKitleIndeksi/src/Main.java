import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        Double height=0.0;
        Integer weight=0;
        Double bodyMassIndex=0.0;

        System.out.println("Boy(m): ");
        height=input.nextDouble();
        System.out.println("Kilo(kg): ");
        weight=input.nextInt();

        bodyMassIndex= (weight)/(height*height);

        System.out.println("Vücut Kitle İndeksi: "+bodyMassIndex);

    }
}