import java.util.Scanner;

public class GuanineCytosineContent {

    public static void calculatePercentGC() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().toLowerCase();
        int count = 0;

        for (char ch : input.toCharArray()) {
            if (ch == 'c' || ch == 'g') {
                count++;
            }
        }
        double res = (double) count / input.length();
        System.out.println(res * 100);
        sc.close();
    }
}
