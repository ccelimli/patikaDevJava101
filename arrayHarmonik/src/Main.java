public class Main {
    public static void main(String[] args) {
        int[] array= new int[]{34, 55, 67, 44, 200, 55, 84};
        Double total=0.0;

        for (int item : array) {
            total += array.length/((double) 1 / item);

        }
        System.out.println("Total: "+ total);
    }
}

