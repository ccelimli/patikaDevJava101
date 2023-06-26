import java.util.Scanner;

public class Main {
    static int exponential(int number, int exponential){
           if (exponential==0){
               return 1;
           }
           else {
                return number * exponential(number, exponential - 1);
           }
    }

    public static void main(String[] args) {
        Integer number;
        Integer exponential;
        Scanner input= new Scanner(System.in);

        System.out.println("Taban: ");
        number=input.nextInt();
        System.out.println("Üs: ");
        exponential=input.nextInt();

        System.out.println(exponential(number,exponential));
    }
}