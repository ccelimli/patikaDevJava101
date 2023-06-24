import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Double fizik,kimya,matematik,muzik,turkce;
        Double ortalama;
        Scanner input= new Scanner(System.in);

        System.out.println("Fizik");
        fizik= input.nextDouble();

        System.out.println("Kimya");
        kimya= input.nextDouble();

        System.out.println("Matematik");
        matematik= input.nextDouble();

        System.out.println("Müzik");
        muzik= input.nextDouble();

        System.out.println("Türkçe");
        turkce= input.nextDouble();
        
        ortalama=((fizik+kimya+matematik+muzik+turkce)/5);

        if (ortalama>=55){
            System.out.println("Geçti: "+ortalama);
        }
        else{
            System.out.println("Kaldı: "+ortalama);
        }

    }
}