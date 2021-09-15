package leetcode.techniques.SlidingWindow;
import java.util.*;

public class SubstringwithConcatenationOfAllWords {

        public static List<Integer> findWordConcatenation(String str, String[] words) {
            Map<String, Integer> wordFrequencyMap = new HashMap<>();
            for (String word : words)
                wordFrequencyMap.put(word, wordFrequencyMap.getOrDefault(word, 0) + 1);

            List<Integer> resultIndices = new ArrayList<Integer>();
            int wordsCount = words.length, wordLength = words[0].length();

            for (int i = 0; i <= str.length() - wordsCount * wordLength; i++) {
                Map<String, Integer> wordsSeen = new HashMap<>();
                for (int j = 0; j < wordsCount; j++) {
                    int nextWordIndex = i + j * wordLength;
                    // get the next word from the string
                    String word = str.substring(nextWordIndex, nextWordIndex + wordLength);
                    if (!wordFrequencyMap.containsKey(word)) // break if we don't need this word
                        break;

                    wordsSeen.put(word, wordsSeen.getOrDefault(word, 0) + 1); // add the word to the 'wordsSeen' map

                    // no need to process further if the word has higher frequency than required
                    if (wordsSeen.get(word) > wordFrequencyMap.getOrDefault(word, 0))
                        break;

                    if (j + 1 == wordsCount) // store index if we have found all the words
                        resultIndices.add(i);
                }
            }

            return resultIndices;
        }



//    public static List<Integer> findWordConcatenation(String str, String[] words) {
//        List<Integer> resultIndices = new ArrayList<Integer>();
//        int start = 0;
//        int end = 0;
//        int matchCount = 0;
//        int checkCount = 0;
//
//        HashMap<String, Integer> wordFrequencyMap = new HashMap<>();
//        int wordCount = words.length;
//        int wordLength = words[0].length();
//
//        for(String word : words)
//        {
//            wordFrequencyMap.put(word, wordFrequencyMap.getOrDefault(word, 0) +  1);
//        }
//
//        while(end < (str.length() - wordLength))
//        {
//            String endWord = str.substring(end, end + wordLength);
//            if(wordFrequencyMap.containsKey(endWord))
//            {
//                if(wordFrequencyMap.get(endWord) > 0)
//                {
//                    matchCount++;
//                }
//                wordFrequencyMap.put(endWord, wordFrequencyMap.getOrDefault(endWord, 0) - 1);
//            }
//
//            checkCount++;
//
//            if(matchCount == wordCount)
//            {
//                resultIndices.add(start);
//            }
//
//            if(checkCount == wordCount)
//            {
//                // reduce the window
//                String startWord = str.substring(start, start + wordLength);
//                if(wordFrequencyMap.containsKey(startWord))
//                {
//                    if(wordFrequencyMap.get(startWord) >= 0)
//                    {
//                        matchCount--;
//                    }
//
//                    wordFrequencyMap.put(startWord, wordFrequencyMap.getOrDefault(startWord, 0) + 1);
//                }
//                checkCount--;
//                start++;
//            }
//
//            end++;
//
//        }
//
//
//        return resultIndices;
//    }

}
