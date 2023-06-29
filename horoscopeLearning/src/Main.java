import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String horoscope = "";
        boolean isSuccess=true;

        System.out.println("Ay: ");
        Integer month = input.nextInt();

        System.out.println("Gün: ");
        Integer day = input.nextInt();

        if (month == 1 && 1 <= day && day <= 31) {
            if (1 <= day && day < 21) {
                horoscope = "Oğlak";
            } else {
                horoscope = "Kova";
            }
        }

        else if (month == 2 && 1 <= day && day <= 29) {
            if (1 <= day && day <= 19) {
                horoscope = "Kova";
            } else {
                horoscope = "Balık";
            }
        }

        else if (month == 3 && 1 <= day && day <= 31) {
            if (1 < day && day <= 20) {
                horoscope = "Balık";
            } else {
                horoscope = "Koç";
            }
        }

        else if (month == 4 && 1 <= day && day <= 31) {
            if (1 < day && day <= 20) {
                horoscope = "Koç";
            } else {
                horoscope = "Boğa";
            }
        }

        else if (month == 5 && 1 <= day && day <= 31) {
            if (1 < day && day <= 21) {
                horoscope = "Boğa";
            } else {
                horoscope = "İkizler";
            }
        }

        else if (month == 6 && 1 <= day && day <= 31) {
            if (1 < day && day <= 22) {
                horoscope = "İkizler";
            } else {
                horoscope = "Yengeç";
            }
        }

        else if (month == 7 && 1 <= day && day <= 31) {
            if (1 < day && day <= 22) {
                horoscope = "Yengeç";
            } else {
                horoscope = "Aslan";
            }
        }

        else if (month == 8 && 1 <= day && day <= 31) {
            if (1 < day && day <= 22) {
                horoscope = "Aslan";
            } else {
                horoscope = "Başak";
            }
        }

        else if (month == 9 && 1 <= day && day <= 31) {
            if (1 < day && day <= 22) {
                horoscope = "Başak";
            } else {
                horoscope = "Terazi";
            }
        }

        else if (month == 10 && 1 <= day && day <= 31) {
            if (1 < day && day <= 22) {
                horoscope = "Terazi";
            } else {
                horoscope = "Akrep";
            }
        }

        else if (month == 11 && 1 <= day && day <= 31) {
            if (1 < day && day <= 21) {
                horoscope = "Akrep";
            } else {
                horoscope = "Yay";
            }
        }

        else if (month == 12 && 1 <= day && day <= 31) {
            if (1 < day && day <= 21) {
                horoscope = "Yay";
            } else {
                horoscope = "Oğlak";
            }
        }
        else{
            isSuccess=false;
            System.out.println("Geçersiz!");
        }

        if (isSuccess==true){
            System.out.println("\nBurç: "+horoscope);
        }

    }
}