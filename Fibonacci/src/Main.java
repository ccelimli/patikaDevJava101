import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int count,total=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Seri:");
        count = input.nextInt();
        int s1=0;
        int s2=1;
        for(int i=1;i<=count;i++){
            System.out.print(s1 + " ");
            total = s1+s2;
            s1=s2;
            s2=total;
        }
    }
}