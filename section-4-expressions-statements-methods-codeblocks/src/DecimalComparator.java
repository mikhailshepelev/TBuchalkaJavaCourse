public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double a, double b) {
        int first = (int) (a * 1000);
        int second = (int) (b * 1000);

        return first == second;
    }
}
