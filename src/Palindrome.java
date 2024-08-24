import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        checkPalindrome();
    }

    public static void checkPalindrome() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean isPalindrome = true;

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                isPalindrome = false;
            }
        }

        System.out.println(isPalindrome ? "yes" : "no");
        sc.close();
    }
}
