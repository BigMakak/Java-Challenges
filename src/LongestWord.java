import java.math.BigInteger;
import java.util.*;
import java.io.*;

public class LongestWord {


    public static void CheckLongestWord() {

        int wordLength = 0;
        String longestWord = "";

        System.out.println("Write some words : ");
        Scanner s = new Scanner(System.in);

        for (String word : s.nextLine().split(" ")) {
            if (word.length() > wordLength) {
                longestWord = word;
                wordLength = word.length();
            }
        }

        System.out.print("The longest word is  : " + longestWord);

    }

    public static int FirstFactorial(int num) {

        int result = num;

        for (int i = num - 1; i > 0; i++) {
            result *= i;
        }


        return result;

    }

    public static String FirstReverse(String str) {

        String reversed = "";

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(str);

        reversed = stringBuilder.reverse().toString();


        return reversed;

    }

    public static int mxdiflg(String[] a1, String[] a2) {

        int arrayStringX = 0;
        int arrayStringY = 0;

        for (String x : a1) {
            arrayStringX += x.length();
        }

        for (String y : a2) {
            arrayStringY += y.length();
        }


        int result = Math.abs(arrayStringX - arrayStringY);

        return result;
    }


    static int squareSums = 0;
    public static BigInteger perimeter(BigInteger n) {

        if( n.intValue() < 2) {
            //squareSums += n.intValue();
            System.out.println("The square sum is : " + squareSums);
            return n;
        } else {
            squareSums += n.intValue();
            System.out.println("The square sum is : " + squareSums);
            return perimeter(BigInteger.valueOf(n.intValue() - 1)).add(perimeter(BigInteger.valueOf(n.intValue() - 2)));

        }
    }


}

