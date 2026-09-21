import java.util.Arrays;
import java.util.Scanner;

public class HackathonScoreCurveBooster {

    static void curveScores(int[] scores, int bonus) {
        for (int i = 0; i < scores.length; i++) {
            scores[i] += bonus;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] scores = {70, 85, 60};
        int bonus = 10;

        curveScores(scores, bonus);

        System.out.println(Arrays.toString(scores));

        sc.close();
    }
}