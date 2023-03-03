import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sideOne, sideTwo, sideThree,u,area;
        System.out.println("Birinci kenar: ");
        sideOne = input.nextInt();

        System.out.println("İkinci kenar: ");
        sideTwo = input.nextInt();

        System.out.println("Üçüncü kenar: ");
        sideThree = input.nextInt();


        u=(sideOne+sideTwo+sideThree)/2;

        area=Math.sqrt(u*(u-sideOne)*(u-sideTwo)*(u-sideThree));
        System.out.println("Alan: "+area);

    }
}