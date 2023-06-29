import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random= new Random();
        Scanner input= new Scanner(System.in);
        int[] predictions= new int[5];
        Integer guess;
        boolean isWin=false;
        boolean isWrong=false;
        int number=random.nextInt(100);
        int right=0;
        while(right<5){
            System.out.println("Tahmin: ");
            guess= input.nextInt();

            if (guess<0 || guess>99){
                System.out.println("Tahmininiz 0 ile 100 arasında olmalıdır!");
                if(isWrong){
                    right++;
                    System.out.println("Hatalı Giriş!\nKalan Hak:  "+(5-right));
                }else{
                    isWrong=true;
                    System.out.println("Hatalı giriş!");
                }
                continue;
            }

             if(guess==number){
                System.out.println("Tebrikler! Tahmininiz: "+guess+"\nSayı: "+number);
                isWin=true;
                break;
            }else{
                 System.out.println("Yanlış Tahmin!");
                 if (guess>number){
                     System.out.println("Tahmininiz sayıdan büyüktür!");
                 }
                 else {
                     System.out.println("Tahmininiz sayıdan küçüktür!");
                 }

                 predictions[right++]=guess;
                 System.out.println("Kalan Hak: "+(5-right));
             }
        }
        if (!isWin){
            System.out.println("Kaybettiniz!");
            if (!isWrong){
                System.out.println("Tahminler: " + Arrays.toString(predictions));
                System.out.println("Doğru Sayı: "+number);
            }
        }
    }
}