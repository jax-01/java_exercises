import java.util.Scanner;

public class MoveNCharacters {

    public void moveNCharacters() {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();

        System.out.println(n > str.length() ? str : str.substring(n) + str.substring(0, n));
        sc.close();
    }
}
