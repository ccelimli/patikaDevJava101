import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Integer n;
        Integer r;
        Integer nFaktoriyel=1;
        Integer rFaktoriyel=1;
        Integer grup=1;
        Integer kombinasyon;
        Scanner input= new Scanner(System.in);

        System.out.println("Faktoriyel sayısı: ");
        n=input.nextInt();

        System.out.println("Grup Sayısı: ");
        r=input.nextInt();

        for (int i=1; i<=n; i++){
            nFaktoriyel*=i;
        }
        for(int j=1; j<=r; j++){
            rFaktoriyel*=j;
        }

        for (int k=1; k<=n-r; k++){
            grup*=k;
        }
        kombinasyon=(nFaktoriyel)/(rFaktoriyel*(grup));

        System.out.println(kombinasyon);
    }
}