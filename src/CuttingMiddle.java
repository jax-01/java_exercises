import java.util.Scanner;

public class CuttingMiddle {

    public static void cutMiddle() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String strOutput = "";

        // even
        if (str.length() % 2 == 0) {
            strOutput += str.substring(0, str.length() / 2 - 1) + str.substring(str.length() / 2 + 1);
        } else {
            strOutput += str.substring(0, str.length() / 2) + str.substring(str.length() / 2 + 1);
        }
        System.out.println(strOutput);
        sc.close();
    }
}
