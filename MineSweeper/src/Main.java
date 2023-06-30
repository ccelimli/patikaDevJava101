import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Map Sınırlarını Belirleyiniz.");

        System.out.println("Satır sayısını giriniz: ");
        Integer row=input.nextInt();
        System.out.println("Sütun sayısını giriniz: ");
        Integer column=input.nextInt();
        MineSwepper mineSwepper = new MineSwepper(row,column);
        mineSwepper.run();
    }
}