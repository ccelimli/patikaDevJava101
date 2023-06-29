import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Yıl: ");
        Integer year=input.nextInt();

        if (year % 4 == 0 && year % 100 != 0 ||  year % 400 == 0 ){
            System.out.println(year+" bir artık yıldır.");
        }
        else{
            System.out.println("Bir artık yıl değildir.");
        }
    }
}