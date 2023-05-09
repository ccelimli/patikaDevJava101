import java.util.Dictionary;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Double pear = 2.14;
        Double apple=3.67;
        Double tomato=1.11;
        Double banana=0.95;
        Double aubergine=5.0;
        Double total=0.0;
        Double kg;

        Scanner input = new Scanner(System.in);

        System.out.println("Armut: ");
        kg=input.nextDouble();
        total+=kg*pear;

        System.out.println("Elma: ");
        kg=input.nextDouble();
        total+=kg*apple;

        System.out.println("Armut: ");
        kg=input.nextDouble();
        total+=kg*tomato;

        System.out.println("Armut: ");
        kg=input.nextDouble();
        total+=kg*banana;

        System.out.println("Armut: ");
        kg=input.nextDouble();
        total+=kg*aubergine;

        System.out.println("Toplam: "+total+" TL");
    }
}



