import java.util.ArrayList;
import java.util.List;

public class RegexSearch {

    private List<String> listArray;
    private int smileCount = 0;

    public RegexSearch(List<String> listArray) {

        this.listArray = listArray;

    }

    public int searchSmiles() {

        boolean found;
        int smileCount = 0;

        if (listArray.isEmpty()) {
            return 0;
        }



        for (String smile : listArray) {
             found = smile.matches(":\\)|:D|;-D|:~\\)|;\\)|;D|:-\\)|;-\\)|;-\\)|:-D");

             if(found) {
                 smileCount++;
             }
        }

        return smileCount;
    }

    public int getSmileCount() {
        return this.smileCount;
    }
}
