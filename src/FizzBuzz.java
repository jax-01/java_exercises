public class FizzBuzz {
    public static boolean isDivByThree(int num) {
        return num % 3 == 0;
    }

    public static boolean isDivByFive(int num) {
        return num % 5 == 0;
    }

    public static boolean isDivByThreeAndFive(int num) {
        return num % 3 == 0 && num % 5 == 0;
    }
}
