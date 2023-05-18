
import java.util.*;
public class Task1API {

    public static void main(String[] args) {
        String text1 =  "Россия идет вперед всей планеты. Планета — это не Россия."; 

        Map<String, Integer> wordToCount = new TreeMap<>();

        for (String word : text1.split(" "))
        {
            wordToCount.put(word, wordToCount.getOrDefault(word, 0) + 1);
        }
        System.out.println(wordToCount);
    }
}