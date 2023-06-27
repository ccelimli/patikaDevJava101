public class Main {
    public static void main(String[] args) {
        String[][] letterB = new String[9][4];

        for (int i = 0; i < letterB.length; i++) {
            for (int j = 0; j < letterB[i].length; j++) {
                if (j == 0) {
                    letterB[i][j] = " * ";
                } else if (j == 1 && (i == 0 || i == 4 || i == 8)){
                    letterB[i][j] = " * ";
                } else if (j == 2 && (i == 0 || i == 4 || i == 8)){
                    letterB[i][j] = " * ";
                } else if (j == 3 && (i != 0 && i != 4 && i != 8)){
                    letterB[i][j] = " * ";
                } else {
                    letterB[i][j] = "  ";
                }
            }
        }

        for (String[] row : letterB) {
            for (String col : row) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
