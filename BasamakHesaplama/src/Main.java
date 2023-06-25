import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int sayi, kalan=1, basamak, sonuc=0, temp;

        System.out.println("Sayı Gir: ");
        sayi=input.nextInt();

        while(sayi > 0){
            basamak = sayi % 10;
            sonuc += basamak;
            sayi /= 10;
        }

        System.out.println("Sonuç : " + sonuc);
    }
}