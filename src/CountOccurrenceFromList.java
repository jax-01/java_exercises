import java.util.List;

public class CountOccurrenceFromList {
    public static boolean checkOccurrence(int value, List<Integer> list1, List<Integer> list2) {
        int check = 0;

        for (Integer num : list1) {
            if (num == value) {
                check++;
            }
        }

        for (Integer num : list2) {
            if (num == value) {
                check--;
            }
        }

        return false;
    }
}
