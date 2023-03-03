import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        float total;
        float price;
        System.out.println("Miktar: ");
        price=input.nextFloat();

        float valueAddedTax=price<=1000?18:8;

        total=price+((price/100)*valueAddedTax);
        System.out.println("KDV'siz: "+price+"\n"+"KDV dahil toplam: "+total+"\n"+"KDV tutarı: "+(price/100)*valueAddedTax);

    }
}