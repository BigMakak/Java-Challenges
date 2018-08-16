import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

         /** The Kata for smile Regex and Testing
          * List<String> smileList = Arrays.asList(":)",":-)",":D",";-D");
        RegexSearch regexSearch = new RegexSearch(smileList);

        regexSearch.searchSmiles();

        System.out.println("The number of files : " + regexSearch.getSmileCount());

          **/

        /** The kata for camel case the first letter
         *
         * System.out.println("The camel case word " + KataChallenge.camelCase(""));
         */

        MiniInterpreter miniInterpreter = new MiniInterpreter("000","[[]*>*>*>]");

        String result = miniInterpreter.interpertArray();

        System.out.println("The result is : " + result);


    }
}
