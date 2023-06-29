public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 1, 2, 3, 2, 4, 5, 5, 4, 6, 7, 7, 6, 8, 9, 8, 10};
        boolean[] visited = new boolean[numbers.length];
        Integer temp;
        Integer count=0;
        temp=numbers[0];
        for (int i=1; i<numbers.length;i++){
            if (visited[i]) {
                continue;
            }
            for(int j=0; j<numbers.length; j++){
                if (temp==numbers[j]){
                    visited[j] = true;
                    count++;
                }
                temp=numbers[i];
            }
            temp=numbers[i];
            System.out.println(temp+" sayısı "+count+" kere tekrar edildi.");
            count=0;
        }

    }
}