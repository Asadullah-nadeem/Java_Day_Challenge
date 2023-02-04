import java.io.File;
import java.util.Map;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeMap;
public class Day91 {
    public static void main(String[] args) {
        try{
            File f = new File("mainBook.me");
            Scanner s; 
            //s.useDelimiter("[^a-zA-Z']+");
            s = new Scanner(f);
            Map<String, Integer> wordCount = new TreeMap<String, Integer>();
            while(s.hasNext()){
                String word =  s.next();
                if (!wordCount.containsKey(word)) {
                    wordCount.put(word,1);
                }else{
                    wordCount.put(word, wordCount.get(word) + 1);
                }
            }
                // show results
                for(String word : wordCount.keySet())
                System.out.println(word + " " + wordCount.get(word));
            System.out.println(wordCount.size());
        }
        catch(IOException e) {
            System.out.println("Unable to read from file.");
        }
    }
}