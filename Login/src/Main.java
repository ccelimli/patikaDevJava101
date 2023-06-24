import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String username, password;
        Scanner input= new Scanner(System.in);

        System.out.println("Kullanıcı Adı: ");
        username=input.nextLine();
        System.out.println("Parola: ");
        password=input.nextLine();

        if (username.equals("patika") && password.equals("java123")){
            System.out.println("Giriş Başarılı!");
        }
        else{
            System.out.println("Hatalı Giriş");
        }
    }
}