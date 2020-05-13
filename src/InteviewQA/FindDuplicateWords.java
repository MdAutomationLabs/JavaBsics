package InteviewQA;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicateWords {
    public static void main(String[] args) {
        findDuplicateWords("Hey java is java best language is java");
        findDuplicateWords("Hello java is not java best not language Hello is java");
    }

    public static void findDuplicateWords(String inputString){
        String words[]= inputString.split(" ");
        Map<String, Integer> wordCount= new HashMap<String, Integer>();
           // to check each word in given array
        for (String word: words){
            // if the word is present
            if(wordCount.containsKey(word)){
                wordCount.put(word.toLowerCase(),wordCount.get(word)+1);
            }else{
                wordCount.put(word,1);
            }
        }
        //extracting all the keys of map -wordCount
        Set<String> wordsInCount = wordCount.keySet();

        //loop through all the words in the wordCount
        for(String word: wordsInCount){
           if(wordCount.get(word)>1){
               System.out.println(word + ": "+ wordCount.get(word));

           }
        }
    }
}
