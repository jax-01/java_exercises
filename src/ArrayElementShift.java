import java.util.Arrays;
import java.util.Scanner;

public class ArrayElementShift {
    /*
     *  input array: [1, 2, 3, 4, 5]
     *  number of steps: 3
     * output array: [3, 4, 5, 1, 2]
     */
    public void shiftRight() {
        Scanner in = new Scanner(System.in);
        int[] arr = Arrays.stream(in.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int steps = in.nextInt();

        for (int i = 0; i < steps; i++) {
            int temp = arr[arr.length - 1];
            for (int j = arr.length - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = temp;
        }
        System.out.print("Shifted array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public void shiftLeft() {
        Scanner in = new Scanner(System.in);
        int[] arr = Arrays.stream(in.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int steps = in.nextInt();

        for (int i = 0; i < steps; i++) {
            int temp = arr[0];
            for (int j = 0; j < arr.length - 2; j++) {
                arr[j] = arr[j + 1];
            }
            arr[0] = temp;
        }

        System.out.print("Shifted array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
