import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Integer a, b, c;
        Scanner input = new Scanner(System.in);

        System.out.println("Birinci Sayı: ");
        a=input.nextInt();

        System.out.println("İkinci Sayı: ");
        b=input.nextInt();

        System.out.println("Üçüncü Sayı: ");
        c=input.nextInt();

        if (a<b && a<c){
            if (b<c){
                System.out.println("a<b<c");
            } else if (c<b) {
                System.out.println("a<c<b");
            }
        }
        if (b<a && b<c){
            if (a<c){
                System.out.println("b<a<c");
            } else if (c<a) {
                System.out.println("b<c<a");
            }
        }
        if (c<a && c<b){
            if (a<b){
                System.out.println("c<a<b");
            } else if (b<a) {
                System.out.println("c<b<a");
            }
        }
    }
}