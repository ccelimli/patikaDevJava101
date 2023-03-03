import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float sub = 0;
        float mathScore, physicsScore, chermistryScore, turkishScore, historyScore, musicScore;

        System.out.println("Matematik: ");
        mathScore = input.nextFloat();
        sub += mathScore;

        System.out.println("Fizik:");
        physicsScore = input.nextFloat();
        sub += physicsScore;

        System.out.println("Kimya: ");
        chermistryScore = input.nextFloat();
        sub += chermistryScore;


        System.out.println("Türkçe: ");
        turkishScore = input.nextFloat();
        sub += turkishScore;

        System.out.println("Tarih: ");
        historyScore = input.nextFloat();
        sub += historyScore;

        System.out.println("Music: ");
        musicScore = input.nextFloat();
        sub += musicScore;

        float average = Math.round(sub / 6);

        String result = average >= 60 ? "Successed" : "Failed";

        System.out.println("Average: " + average + " - " + result);

    }
}