import java.util.Scanner;

public class FindFirstThe {
    public static void main(String[] args) {
        findFirstOccurence();
    }

    public static void findFirstOccurence() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();

        if (!str.contains("the")) {
            System.out.println(-1);
            return;
        }
        System.out.println(str.indexOf("the"));
        sc.close();
    }
}
