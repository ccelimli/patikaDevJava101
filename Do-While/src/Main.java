import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Integer number;
        Integer total = 0;
        Scanner input= new Scanner(System.in);
        do{
            System.out.println("Sayı Gir: ");
            number=input.nextInt();
            if (number%4==0){
                total+=number;
            }
        }while(number%2==0);

        System.out.println("Toplam: "+ total);
    }
}

//Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.