import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer radius = 0;
        Integer measureofCenterAngle = 0;
        Double pi = 3.14;
        Double area = 0.0;
        Double environment = 0.0;
        Double partOfFlat=0.0;

        System.out.println("Yarıçap: ");
        radius=input.nextInt();

        area=pi*radius*radius;
        environment=2*pi*radius;

        System.out.println("Çevre: "+new DecimalFormat("##,##").format(environment));
        System.out.println("Alan: "+new DecimalFormat("##,##").format(area));

        System.out.println("Merkez Açısının Ölçüsü: ");
        measureofCenterAngle=input.nextInt();

        partOfFlat=(pi*(radius*radius)*measureofCenterAngle)/360;

        System.out.println("Daire Diliminin Alanı: "+new DecimalFormat("##,##").format(partOfFlat));
    }
}