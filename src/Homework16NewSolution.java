import java.util.ArrayList;
import java.util.Arrays;

public class Homework16NewSolution {
    public static void main(String[] args) {
        System.out.println(countPos(new ArrayList<>(Arrays.asList(-45, 0, 0, 34, 5, 67))));
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
     2nd WAY
     */
    public static int countA1(String str){
        int countA = 0;
        for(char c : str.toCharArray()){
            if(c == 'A' || c == 'a') countA++;
        }
        return countA;
    }
    /**
     * Write a method countPos() that takes an ArrayList of Integer as an argument,
       and returns how many elements are positive
     */
    public static int countPos(ArrayList<Integer> numbers){
        int countPos=0;
        for (Integer number : numbers) {
             if(number>0)countPos++;
        }
        return countPos;
    }





}