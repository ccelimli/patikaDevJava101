import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 1, 2, 3, 2, 4, 5, 5, 4, 6, 7, 7, 6, 8, 9, 8, 10};

        System.out.println("Dizi: " + Arrays.toString(numbers));
        Arrays.sort(numbers);

        int counter = 1;

        for (int i = 0; i < numbers.length; i++) {
            if (i == 0) {
                for (int j = 0; j < numbers.length; j++) {
                    if ((i != j) && (numbers[i] == numbers[j])) {
                        counter++;
                    }
                }
                System.out.println(numbers[i] + " sayısı " + counter + " kere tekrar edildi.");
            } else if (numbers[i] != numbers[i-1]) {
                for (int j = 0; j < numbers.length; j++) {
                    if ((i != j) && (numbers[i] == numbers[j])) {
                        counter++;
                    }
                }
                System.out.println(numbers[i] + " sayısı " + counter + " kere tekrar edildi.");
            }
            counter = 1;
        }


    }
}