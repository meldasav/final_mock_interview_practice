package homePractice;

import java.util.ArrayList;
import java.util.Arrays;

public class PracticeFinalMockInterview {
    /*
   Write a method that takes 3 int arguments and returns the greatest number
   NOTE: 2 or 3 numbers being same is okay
   TEST DATA:
   3, 3, 5
   EXPECTED OUTPUT:
   5
    */
    public static int greatestNumber(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    //Second way
    public static int greatestNumber1(int a, int b, int c) {
        if (a >= b && a >= c) return a;
        else if (b >= a && b >= c) return b;
        else return c;
    }

    // way 3
    public static int greatestNumber2(int a, int b, int c) {
        int[] numbers = {a, b, c};
        Arrays.sort(numbers);
        return numbers[numbers.length - 1];
    }

    /*
    Write a method that takes 3 int arguments and returns the middle number
    NOTE: 2 or 3 numbers being same is okay
    TEST DATA:
    4, 4, 5
    EXPECTED OUTPUT:
    4
     */
    public static int middleNumber(int a, int b, int c) {
        int[] numbers = {a, b, c};
        Arrays.sort(numbers);
        return numbers[1];
    }

    //way 2
    public static int middleNumber1(int a, int b, int c) {
        if (a == b || a == c) return a;
        else if (b == c) return b;

        int max = Math.max(a, Math.max(b, c));
        int min = Math.min(a, Math.min(b, c));

        if (a != max && a != min) return a;
        else if (b != max && b != min) return b;
        else return c;
    }
     /*
    Write a method that takes a String and returns reversed String
    TEST DATA:
    Hello
    EXPECTED OUTPUT:
    olleH
     */

    public static String reversed(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }

    //2.way
    public static String reversed1(String str) {
        return new StringBuilder(str).reverse().toString();
    }
     /*
    Write a method that takes a String and return String back with all digits removed
    TEST DATA:
    a1b2c3
    EXPECTED OUTPUT:
    abc
     */

    //1.way
    public static String removeDigit(String str) {
        String str1 = "";
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                str1 += str.charAt(i);
            }
        }
        return str1;
    }

    //2.way
    public static String removeDigit1(String str) {
        return str.replaceAll("[0-9]", "");
    }

    /*
    Write a method that takes a String and return String back with all spaces removed
    TEST DATA:
    Java is fun
    EXPECTED OUTPUT:
    Javaisfun
     *///first way
    public static String removeExtraSpace1(String str) {
        String[] str1 = str.trim().split(" ");
        String s1 = "";
        for (String s : str1) {
            if (!s.isEmpty()) s1 += s + " ";
        }
        return s1.substring(0, s1.length() - 1);
    }

    //second way
    public static String removeExtraSpace2(String str) {
        String[] str1 = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String s : str1) {
            if (!s.isEmpty()) sb.append(s).append(" ");
        }
        return sb.substring(0, sb.length() - 1);
    }

    //FIRST WAY
    public static String removeAllSpace3(String str) {
        return str.replaceAll(" ", "");
    }

    //SECOND WAY
    public static String removeAllSpace4(String str) {
        String s = "";
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isSpaceChar(str.charAt(i))) {
                s += str.charAt(i);
            }
        }
        return s;
    }

    /*
    Write a method that takes a String and return String back with all letters removed
    TEST DATA:
    Time is 8 PM.
    EXPECTED OUTPUT:
    [  8 .]
     */
    //First way
    public static String removeLetters(String str) {
        return str.replaceAll("[A-Za-z]", "");
    }

    public static String removeLetters1(String str) {
        String s = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isDigit(c) || !Character.isLetter(c)) {
                s += c;
            }
        }
        return s;
    }
   /*
    Write a method that takes a String and return String back with all vowels removed
    TEST DATA:
    Hello World!
    EXPECTED OUTPUT:
    Hll Wrld!
     */

    public static String removeVowels(String str) {
        String str1 = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!(c == 'A' ||
                    c == 'E' ||
                    c == 'O' ||
                    c == 'U' ||
                    c == 'I' ||
                    c == 'a' ||
                    c == 'e' ||
                    c == 'o' ||
                    c == 'u' ||
                    c == 'i')) {
                str1 += str.charAt(i);
            }
        }
        return str1;
    }

    //way 2
    public static String removeVowels1(String str) {
        return str.replaceAll("[AEOUIaeiou]", "");
    }


    /*
   Write a method that takes a String and return String back with all consonants removed
   TEST DATA:
   Hello World!
   EXPECTED OUTPUT:
   eo o!
    */
    //way 1
    public static String removeConsonants(String str) {
        String str1 = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if ((c == 'A' ||
                    c == 'E' ||
                    c == 'O' ||
                    c == 'U' ||
                    c == 'I' ||
                    c == 'a' ||
                    c == 'e' ||
                    c == 'o' ||
                    c == 'u' ||
                    c == 'i')) {
                str1 += str.charAt(i);
            }
        }
        return str1;
    }

    //second way
    public static String removeConsonants1(String str) {
        return str.replaceAll("[^AEOUIaeoui\\d\\W]", "");
    }
      /*
    Write a method that takes a String and return String back with all uppercase letters removed
    TEST DATA:
    Hello World!
    EXPECTED OUTPUT:
    ello orld!
     */

    public static String removeUpperCase(String str) {
        StringBuilder str1 = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!Character.isUpperCase(c)) {
                str1.append(c);
            }
        }
        return str1.toString();
    }

    //second way
    public static String removeUpperCase1(String str) {
        return str.replaceAll("[A-Z]", "");
    }
     /*
    Write a method that takes a String and return String back with all lowercase letters removed
    TEST DATA:
    Hello World!
    EXPECTED OUTPUT:
    H W!
     */

    public static String removeLowerCase(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isLowerCase(str.charAt(i))) {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
     /*
    Write a method that takes an int array argument and returns the count of prime numbers
    NOTE: Prime number is a number that can be divided only by 1 and itself
    NOTE: Negative numbers cannot be prime
    NOTE: The smallest prime number is 2
    Examples: 2,3,5,7,11,13,17,19,23,29,31,37 etc.
    TEST DATA:
    [-3, 5, 4, 0, 11]
    EXPECTED OUTPUT:
    2
     */

    public static int countPrimeNumbers(int[] numbers) {
        int countPrime = 0;
        for (int number : numbers) {
            if (number == 2 || number == 3) countPrime++;
            else if (number > 3) {
                boolean isPrime = true;
                for (int i = 2; i <= numbers.length / 2; i++) {
                    if (number % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) countPrime++;
            }
        }
        return countPrime;
    }

    public static boolean isPalindrome(String str) {
        StringBuilder reversed = new StringBuilder();
        if (!str.isEmpty()) {
            for (int i = str.length() - 1; i >= 0; i--) {
                reversed.append(str.charAt(i));
                if (reversed.toString().equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isPalindrome1(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }

    /*
   Write a method that takes an Integer ArrayList argument and returns the list back with all duplicates removed
   NOTE: the order of elements returned is not an issue.
   TEST DATA:
   [0, 5, 4, 0, 0]
   EXPECTED OUTPUT:
   [0, 4, 5]
    */
    public static ArrayList<Integer> removeDupElements(ArrayList<Integer> list) {
        ArrayList<Integer> myList = new ArrayList<>();
        for (Integer integer : list) {
            if (!myList.contains(integer)) myList.add(integer);
        }
        return myList;
    }

     /*
    Write a method that takes a String ArrayList argument and returns the list back with all duplicates removed
    NOTE: the order of elements returned is not an issue.
    TEST DATA:
    ["foo", "bar", "foo", "123", "bar"]
    EXPECTED OUTPUT:
    [bar, 123, foo]
     */

    public static ArrayList<String> removeDupInList(ArrayList<String> str) {
        ArrayList<String> withoutDup = new ArrayList<>();
        for (String s : str) {
            if (withoutDup.contains(s)) {
                continue;
            }
            withoutDup.add(s);
        }
        return withoutDup;
    }
 /*
    Write a method that takes a String argument and returns a boolean. It will return true if given String is palindrome, and false otherwise
    Anagram: a word, phrase, or name formed by rearranging the letters of another, such as cinema, formed from iceman.
    Ex: listen-silent | cinema-iceman
    TEST DATA:
    Hello, World
    EXPECTED OUTPUT:
    false
    TEST DATA:
    cinema, iceman
    EXPECTED OUTPUT:
    true
     */

    public static boolean isAnagram(String str1, String str2) {
        char[] c1 = str1.toCharArray();
        char[] c2 = str2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);
        return Arrays.equals(c1, c2);
    }

    /**
     * n1     n2     n3
     * i 0   0      1      1
     * i 1   1      1      2
     * i 2   1      2      3
     * i 3   2      3      5
     */
    public static void fibonacci(int number) {
        int n1 = 0, n2 = 1, n3 = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < number; i++) {
            sb.append(n1).append("-");
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        System.out.println(sb.substring(0, sb.length() - 1));

    }

    /*
   Write a method that takes a String argument and returns the count of vowels as an int
   TEST DATA:
   I like Java
   EXPECTED OUTPUT:
   5
    */
    public static int countVowels(String str) {
        int countVowels = 0;
        for (char c : str.toCharArray()) {
            if (c == 'A' ||
                    c == 'E' ||
                    c == 'O' ||
                    c == 'U' ||
                    c == 'I' ||
                    c == 'a' ||
                    c == 'e' ||
                    c == 'i' ||
                    c == 'u' ||
                    c == 'o') countVowels++;

        }
        return countVowels;
    }

    public static int countWords(String str) {
        String[] words = str.trim().split(" ");
        return str.length();
    }

    public static int countWords1(String str) {
        int countWords1 = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') countWords1++;
        }
        return countWords1;

    }

    public  static int[] removeDupFinal(int[] numbers) {
        int lent = numbers.length;
        for (int i = 0; i < lent - 1; i++) {
            for (int j = i + 1; j < lent; j++) {
                if (numbers[i] == numbers[j]) {
                    numbers[j] = numbers[lent - 1];
                    lent--;
                }
            }
        }
        int[] newArr=new int[lent];
        for (int i = 0; i <lent ; i++) {
            newArr[i]=numbers[i];

        }
        return newArr;
    }


    public static void main(String[] args) {

      int[] numbers={5,12,9,9,2,1,5};
        System.out.println(Arrays.toString(removeDupFinal(numbers)));


    }


    public static String removeExtraSpace(String str) {
        String[] str1=str.trim().split(" ");
        String s="";
        for (String s1 : str1) {
            if(!s1.isEmpty())s+=s1+" ";
        }
        return s.substring(0,s.length()-1);

    }


}
