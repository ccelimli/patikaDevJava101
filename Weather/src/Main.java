import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Integer degree;
        Scanner input = new Scanner(System.in);

        System.out.println("Sıcaklık: ");
        degree=input.nextInt();

        if (degree<5){
            System.out.println("Kayak");
        }
        else if (5<=degree&& degree<=15){
            System.out.println("Sinema");
        }
        else if (16<=degree&& degree<=25){
            System.out.println("Piknik");
        }
        else if (26<=degree){
            System.out.println("Yüzme");
        }

    }
}