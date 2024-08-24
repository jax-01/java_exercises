import java.util.Scanner;

public class DoubleCharacters {
    public void doubleCharacters() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String newStr = "";

        for (int i = 0; i < str.length(); i++) {
            newStr += Character.toString(str.charAt(i)) + Character.toString(str.charAt(i));
        }

        System.out.println(newStr);
    }
}
