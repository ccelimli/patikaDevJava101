import java.util.Random;
import java.util.Scanner;

public class MineSwepper {
    int rowCount;
    int columnCount;
    String[][] mineMap;
    String[][] gameMap;
    int mayinSayisi;
    int selectRow;
    int selectColumn;
    int count;
    boolean isTrue = true;


    public MineSwepper(int row, int col) {
        this.rowCount = row;
        this.columnCount = col;
        this.gameMap = new String[row][col];
        this.mineMap = new String[row][col];
        this.mayinSayisi = (row * col) / 4;

    }

    public void mineMap() {
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < columnCount; j++) {
                mineMap[i][j] = "-";
                gameMap[i][j] = "-";

            }
        }
    }

    public void randomNumber() {
        Random r = new Random();
        for (int i = 0; i < this.mayinSayisi; i++) {
            int rsayi = r.nextInt(this.rowCount);
            int rsayi2 = r.nextInt(this.columnCount);
            if (!this.mineMap[rsayi][rsayi2].equals("*")) {
                this.mineMap[rsayi][rsayi2] = "*";
            }
        }
    }

    public void printmineMap() {
        System.out.println("Mayınların Konumu");
        randomNumber();
        for (int i = 0; i < this.rowCount; i++) {
            for (int j = 0; j < this.columnCount; j++) {
                if (!this.mineMap[i][j].equals("*")) {
                    this.mineMap[i][j] = "-";
                }
                System.out.print(this.mineMap[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("-------------------------------");

    }

    public void printGameMap() {
        for (int i = 0; i < this.rowCount; i++) {
            for (int j = 0; j < this.columnCount; j++) {
                this.gameMap[i][j] = "-";
                System.out.print(this.gameMap[i][j] + " ");
            }
            System.out.println();

        }
    }

    public void selectLocation() {
        Scanner inp = new Scanner(System.in);
        System.out.println("Konum Seçiniz(Satırlar:0-"+(rowCount-1)+" Sütunlar:0-"+(columnCount-1)+" aralığında olmalıdır.):");
        isTrue = false;
        while (!isTrue) {
            System.out.print("Satır: ");
            selectRow = inp.nextInt();
            System.out.print("Sütun: ");
            selectColumn = inp.nextInt();
            if (selectRow > rowCount || selectColumn > columnCount) {
                System.out.println("Seçiminiz Map Sınırlarını Aşmaktadır!");
                continue;
            }
            if (mineMap[selectRow][selectColumn].equals("*")) {
                System.out.println("Oyun Bitti!");
                break;

            }
            control();
            if (finish()) {

                System.out.println("Tebrikler!");
                break;
            }
        }
    }

    public void control() {
        count = 0;
        for (int i = (selectRow - 1); i <= (selectRow + 1); i++) {
            for (int j = (selectColumn - 1); j <= (selectColumn + 1); j++) {
                if (i < 0 || j < 0 || i >= this.rowCount || j >= this.columnCount) {
                    continue;
                }
                if (this.mineMap[i][j].equals("*")) {
                    count++;
                }
            }
        }

        this.gameMap[selectRow][selectColumn] = String.valueOf(count);
        this.mineMap[selectRow][selectColumn] = String.valueOf(count);
        for (int i = 0; i < this.rowCount; i++) {
            for (int j = 0; j < this.columnCount; j++) {
                System.out.print(this.gameMap[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public boolean finish() {
        for (int i = 0; i < this.rowCount; i++) {
            for (int j = 0; j < this.columnCount; j++) {
                if (this.mineMap[i][j].equals("-")) {
                    return false;
                }
            }
        }
        return true;
    }
    public void run() {
        mineMap();
        printmineMap();
        selectLocation();
    }
}
