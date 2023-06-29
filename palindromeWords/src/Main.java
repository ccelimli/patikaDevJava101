import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String word;
        System.out.println("Kelime: ");
        word=input.nextLine();
        String reverseWord="";
        for (int i=word.length()-1;i>=0; i--){
            reverseWord+=(word.charAt(i));
        }
        if (word.equals(reverseWord)){
            System.out.println(word+" kelimesi bir palindromik kelimedir.");
        }
        else{
            System.out.println(word+" kelimesi bir palindromik kelime değildir.");
        }
    }
}