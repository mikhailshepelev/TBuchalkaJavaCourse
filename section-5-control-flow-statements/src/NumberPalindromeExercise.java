public class NumberPalindromeExercise {
    public static boolean isPalindrome(int number) {
        String inputNumberAsString = Integer.toString(Math.abs(number));

        StringBuilder sb = new StringBuilder(inputNumberAsString);

        String reversedString = sb.reverse().toString();

        return inputNumberAsString.equals(reversedString);
    }
}
