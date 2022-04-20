package homePractice;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome( "  "));
        System.out.println("\nTASK2\n");

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a word");
        String word = scan.nextLine();
        String rWord = "";
        if (!word.isEmpty()) {
            for (int i = word.length() - 1; i >= 0; i--) rWord += word.charAt(i);
            if (rWord.equals(word)) System.out.println("this word is palindrome");
            else System.out.println("this word is not palindrome");
        } else {
            System.out.println("this word does not have 1 or more characters");
        }
    }


    public static boolean isPalindrome(String str) {
        String reversed="";
        if (str.isEmpty()) return false;
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed+=(str.charAt(i));
        }
        return str.trim().equals(reversed.trim().toString());
    }

    public static boolean isPalindrome1(String str) {
        if(str.isEmpty())return false;
        return str.trim().equals(new StringBuilder(str.trim()).reverse().toString());
    }


}