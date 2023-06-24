import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Integer firstNumber;
        Integer secondNumber;
        Integer select;
        Integer total=0;

        Scanner input= new Scanner(System.in);
        System.out.println("Birinci Sayı: ");
        firstNumber=input.nextInt();

        System.out.println("İkinci Sayı: ");
        secondNumber=input.nextInt();

        System.out.println("1-Sonuça\n2-Çıkarma\n3-Çarpma\n4-Bölme\n5-Mod");
        System.out.println("Seçim: ");
        select= input.nextInt();;

        switch (select) {
            case 1:
                total=firstNumber+secondNumber;
                System.out.println("Sonuç: "+total);
                break;
            case 2:
                total=firstNumber-secondNumber;
                System.out.println("Sonuç: "+total);
                break;
            case 3:
                total=firstNumber*secondNumber;
                System.out.println("Sonuç: "+total);
                break;
            case 4:
                total=firstNumber/secondNumber;
                System.out.println("Sonuç: "+total);
                break;
            case 5:
                total=firstNumber%secondNumber;
                System.out.println("Sonuç: "+total);
                break;
            default:
                System.out.println("Geçerli bir seçim yapınız!");
        }
    }
}