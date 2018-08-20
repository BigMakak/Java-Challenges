import java.lang.reflect.Array;
import java.util.Arrays;

public class KataChallenge {

    public static String camelCase(String str) {

        if(str.equals("")) {
            return "";
        }

        String camelResult = "";

        String[] stringArray = str.trim().split("\\s+");



        for (String word : stringArray) {
            camelResult += word.substring(0,1).toUpperCase() +  word.substring(1);
        }

        return camelResult;

    }

    public static int century(int number) {
        System.out.println(Math.ceil((double) number / 100));
        return (int)Math.ceil((double) number / 100);
    }

    public static boolean validate(String n){
        String[] creditcard = n.split("");
        int result = 0;


        //Module of true on the length to verify if the char[] as odd or even length
        if(creditcard.length % 2 == 0) {
            for (int i = 0; i < creditcard.length ; i++) {
                if(i % 2 == 0) {
                    int currNumber = Integer.parseInt(creditcard[i]) * 2;
                    if( currNumber > 9 ) {
                        creditcard[i] = Integer.toString (currNumber - 9);
                    } else {
                        creditcard[i] =  Integer.toString(currNumber);
                    }
                }

            }
            for (String number: creditcard) {
                result += Integer.parseInt(number);
            }

            return result % 10 == 0 ? true : false;
        } else {
            for (int i = 0; i < creditcard.length ; i++) {
                if (i % 2 != 0) {
                    int currNumber = Integer.parseInt(creditcard[i]) * 2;
                    if(currNumber > 9) {
                        creditcard[i] = Integer.toString(currNumber - 9);
                    } else {
                        creditcard[i] = Integer.toString(currNumber);
                    }
                }
            }
            for (String number: creditcard) {
                result += Integer.parseInt(number);

            }

            return result % 10 == 0 ? true : false;

        }
    }

    public static void main(String[] args) {
        System.out.println("The credit car is : " + validate("871") );
    }
}
