import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Integer sayi;
        Integer us;
        Integer sonuc=1;
        Scanner input= new Scanner(System.in);

        System.out.println("Sayi Gir: ");
        sayi=input.nextInt();
        System.out.println("Üs Gir: ");
        us=input.nextInt();

        for (int i=1; i<=us; i++){
            sonuc *= sayi;

        }
        System.out.println("Sonuç: "+sonuc);
    }
}