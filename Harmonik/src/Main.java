import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer sayi;
        Double total=0.0;

        System.out.println("Sayi Gir: ");
        sayi=input.nextInt();

        for (int i = 1; i<=sayi; i++){
            total+=(double) 1 / i;
        }

        System.out.println(total);
    }
}