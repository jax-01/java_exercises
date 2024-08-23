import java.util.Scanner;

public class Compression {

    public static void compress() {
        Scanner in = new Scanner(System.in);
        String dnaInput = in.nextLine();

        if (dnaInput.length() == 0) {
            System.out.println("");
            return;
        }

        String dnaOutput = "";
        char currentChar = dnaInput.charAt(0);
        int count = 1;

        for (int i = 1; i < dnaInput.length(); i++) {
            if (dnaInput.charAt(i) == currentChar) {
                count++;
            } else {
                dnaOutput += Character.toString(currentChar) + count;
                currentChar = dnaInput.charAt(i);
                count = 1;
            }
        }
        dnaOutput += Character.toString(currentChar) + count;
        System.out.println(dnaOutput);
        in.close();
    }
}
