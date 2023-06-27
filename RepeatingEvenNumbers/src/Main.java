public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 1, 2, 3, 2, 4, 5, 5, 4, 6, 7, 7, 6, 8, 9, 8, 10};
        boolean[] visited = new boolean[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            if (visited[i]) {
                continue;
            }

            int count = 1;

            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j] && numbers[j] % 2 == 0) {
                    visited[j] = true;
                    count++;
                }
            }

            if (count >= 2 && count % 2 == 0) {
                System.out.println(numbers[i]);
            }
        }
    }
}
