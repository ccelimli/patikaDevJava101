import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String username,password;
        Scanner input = new Scanner(System.in);
        int right=3;
        int balance= 15000;
        int select;

        while (right>0){
            System.out.println("Username: ");
            username=input.nextLine();
            System.out.println("Password: ");
            password=input.nextLine();
            if (username.equals("patika")&& password.equals("dev123")){
                System.out.println("Giriş Başarılı!");
                do {
                    System.out.println("1-Para Yatırma\n2-Para Çekme\n3-Bakiye Sorgulama\n4-Çıkış Yap");
                    System.out.println("İşlem Seç: ");
                    select=input.nextInt();
                    switch (select){
                        case 1:
                            System.out.println("Para Miktarı: ");
                            int priceIn=input.nextInt();
                            balance+=priceIn;
                            System.out.println("Bakiye= "+balance+"\n\n");
                            break;
                        case 2:
                            System.out.println("Para Miktarı: ");
                            int priceOut=input.nextInt();
                            balance-=priceOut;
                            System.out.println("Bakiye: "+balance+"\n\n");
                            break;
                        case 3:
                            System.out.println("Bakiye: "+balance+"\n\n");
                    }
                }while (select!=4);
                System.out.println("Görüşmek Üzere");
                break;
            }else {
                right--;
                System.out.println("Hatalı Giriş");
                if (right==0){
                    System.out.println("Bloke");
                }else{
                    System.out.println("Kalan Hak: "+right);
                }
            }
        }
    }
}