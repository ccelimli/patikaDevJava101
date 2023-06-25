import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Integer number,total=0,average;
    Integer sayac=0;
    Scanner input= new Scanner(System.in);

    System.out.println("Sayı Gir: ");
    number=input.nextInt();

    for(int i=0; i<=number; i++){
        if (i%3==0 && i%4==0 && i!=0){
            total+=i;
            sayac++;
        }
    }
    average=total/sayac;
    System.out.println("Ortalama: "+average);
    }
}