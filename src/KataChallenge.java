import java.lang.reflect.Array;

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
}
