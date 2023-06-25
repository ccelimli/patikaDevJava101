public class Main {
    public static void main(String[] args) {
        boolean asal;

        System.out.println("1-100 arasindaki asal sayilar: ");

        for(int i=2; i<=100; i++) {
            asal = true;
            for(int j=2; j<i; j++) {
                if(i%j == 0) {
                    asal = false;
                    break;
                }
            }
            if(asal) {
                System.out.print(i + " ");
            }
        }
    }
}