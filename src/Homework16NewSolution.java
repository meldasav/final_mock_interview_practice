import java.util.ArrayList;
import java.util.Arrays;

public class Homework16NewSolution {
    public static void main(String[] args) {
        System.out.println(removeDuplicateElements(new ArrayList<>(Arrays.asList("java", "C#", "ruby", "JAVA", "ruby", "C#", "C++"))));
        System.out.println(removeExtraSpaces("     java    is   fun     "));
        System.out.println(Arrays.toString(add(new int[]{3, 0, 0, 7, 5, 10}, new int[]{10, -13, 15, 12, 70, 5, 8, 57})));
    }

    /**
     * Write a method countWords() that takes a String as an argument,
     * and returns how many words there are in the  given String
     */
    public static int countWords(String str) {
        String[] words = str.trim().split("\\s+");
        return words.length;
    }

    /**
     * WAY 2
     */
    public static int countWords1(String str) {
        str = str.trim();
        int countWords = 1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') countWords++;
        }
        return countWords;
    }

    /**
     * Write a method countA() that takes a String as an argument,
     * and returns how many A or a there are in the given String
     */

    public static int countA(String str) {
        int countA = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.toLowerCase().charAt(i) == 'a') countA++;
        }
        return countA;
    }

    /**
     * 2nd WAY
     */
    public static int countA1(String str) {
        int countA = 0;
        for (char c : str.toCharArray()) {
            if (c == 'A' || c == 'a') countA++;
        }
        return countA;
    }

    /**
     * Write a method countPos() that takes an ArrayList of Integer as an argument,
     * and returns how many elements are positive
     */
    public static int countPos(ArrayList<Integer> numbers) {
        int countPos = 0;
        for (Integer number : numbers) {
            if (number > 0) countPos++;
        }
        return countPos;
    }

    /**
     * Write a method removeDuplicateNumbers() that takes an ArrayList of Integer as an argument,
     * and returns it back with removed duplicates
     */

    public static ArrayList<Integer> removeDuplicateNumbers(ArrayList<Integer> numbers) {
        ArrayList<Integer> number = new ArrayList<>();
        for (Integer integer : numbers) {
            if (!number.contains(integer)) number.add(integer);
        }
        return number;
    }

    /**
     * Write a method removeDuplicateElements() that takes an ArrayList of String as an argument,
     * and returns it back with removed duplicates
     */

    public static ArrayList<String> removeDuplicateElements(ArrayList<String> str) {
        ArrayList<String> str1 = new ArrayList<>();
        String s1 = "";
        for (String s : str) {
            if (!str1.contains(s)) str1.add(s);
        }
        return str1;
    }

    /**
     * Write a method removeExtraSpaces() that takes a String as an argument,
     * and returns a String with removed extra spaces
     */
    public static String removeExtraSpaces(String str) {
        String[] s1 = str.trim().split(" ");
        String str1 = "";
        for (String s : s1) {
            if (!s.isEmpty()) str1 += s + " ";
        }
        return str1.substring(0, str1.length() - 1);
    }

    /**
     * Write a method add() that takes 2 int[] arrays as arguments and
     * returns a new array with sum of given arrays elements.
     */
    public static int[] add(int[] a, int[] b) {
        for (int i = 0; i < Math.min(a.length, b.length); i++) {
            if (a.length > b.length) a[i] += b[i];
            else b[i] += a[i];
        }
        return (a.length > b.length) ? a : b;
    }

    /**
     * Write a method findClosestTo10() that takes an int[] array as an argument,
     * and returns the closest element to 10 from given array
     */
    public static int findClosestTo10(int[] numbers) {
        Arrays.sort(numbers);
        int leftClosest = Integer.MIN_VALUE;
        int rightClosest = Integer.MAX_VALUE;

        for (int number : numbers) {
            if (number < 10 && number > leftClosest) leftClosest = number;
            else if (number > 10 && number < rightClosest) rightClosest = number;
        }
        if (10 - leftClosest <= rightClosest - 10) return leftClosest;
        return rightClosest;
    }
}
