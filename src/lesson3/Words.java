package lesson3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Words {

    private final String[] srcArr;

    Words(String[] srcArr) {
        this.srcArr = srcArr;
    }

    public String[] getSourceArray() {
        return srcArr;
    }

    public int getSourceArrayLength() {
        return srcArr.length;
    }

    public Set<String> getUnique() {
        return new HashSet<>(Arrays.asList(srcArr));
    }

    public HashMap<String, Integer> getWordsCount() {
        HashMap<String, Integer> wordCount = new HashMap<>();
        for (String word : srcArr) {
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1 );
            } else {
                wordCount.put(word, 1);
            }
        }
        return wordCount;
    }
}
