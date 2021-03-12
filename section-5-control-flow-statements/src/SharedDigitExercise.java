import java.util.HashSet;
import java.util.Set;

public class SharedDigitExercise {
    public static boolean hasSharedDigit(int first, int second) {
        if (first < 10 || second < 10 || first > 99 || second > 99) return false;

        Set<Integer> set = new HashSet<>();
        set.add(first / 10);
        set.add(first % 10);
        set.add(second / 10);
        set.add(second % 10);

        return set.size() < 4;
    }
}
