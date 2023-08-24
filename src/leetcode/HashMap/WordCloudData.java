package leetcode.HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


    public class WordCloudData {


        private final Map<String, Integer> wordsToCounts = new HashMap<>();

        private void populateWordsToCounts(String inputString) {

            // count the frequency of each word
            List<String> words = splitWords(inputString);

            for (String word : words) {
                if (wordsToCounts.containsKey(word)) {
                    int count = wordsToCounts.get(word);
                    wordsToCounts.replace(word, count + 1);
                } else if (wordsToCounts.containsKey(word.toLowerCase())) {
                    int count = wordsToCounts.get(word.toLowerCase());
                    wordsToCounts.replace(word.toLowerCase(), count + 1);
                } else {
                    String key = word.substring(0, 1).toUpperCase() + word.substring(1);
                    if (wordsToCounts.containsKey(key)) {
                        int count = wordsToCounts.get(key);
                        wordsToCounts.remove(key);
                        wordsToCounts.put(word.toLowerCase(), count + 1);
                    } else {
                        wordsToCounts.put(word, 1);
                    }
                }
            }
            System.out.println(wordsToCounts);
        }

        public List<String> splitWords(String inputString) {
            int i = 0, j = 0, k = 0;
            List<String> words = new ArrayList<>();
            StringBuilder builder = new StringBuilder();

            while (i < inputString.length() && j < inputString.length()) {
                if (Character.isLetter(inputString.charAt(i))) {
                    // when i reaches end of the word condition
                    if (i == inputString.length() - 1) {
                        builder.append(inputString, k, i + 1);
                        words.add(builder.toString());
                        builder.setLength(0);
                        return words;
                    }
                    i++;
                } else {
                    // assign j to count the number of non letter characters between i and j
                    if (j < i) {
                        j = i;
                    }

                    if (!Character.isLetter(inputString.charAt(j))) {
                        // When j reaches end of the string, need to check end character symbol
                        if (j == inputString.length() - 1) {
                            if (j - i >= 1) {
                                // First condition is when there is a chance of non letter words after the last word.
                                // example - "I like cake:::"
                                // In this case we substring till i because i is at position : after e
                                builder.append(inputString, k, i);
                            } else {
                                // If there are no special characters after the last word then we simply take substring using j
                                builder.append(inputString, k, j);
                            }
                            words.add(builder.toString());
                            builder.setLength(0);
                            return words;
                        }
                        j++;
                    } else {
                        // Check if the non letter characters between i and j are greater than one then split
                        // Check if the single character between i and j is space - then split

                        // java not recognizing space " " , I had to trim and check its emptiness
                        if (inputString.substring(i, j).trim().isEmpty() || j - i > 1) {
                            builder.append(inputString, k, i);
                            words.add(builder.toString());
                            builder.setLength(0);
                            k = j;
                        }

                        // If j encounters character then assign j to i and let i check for characters in first if case
                        i = j;
                    }
                }
            }
            return words;
        }

//        public WordCloudData(String inputString) {
//            populateWordsToCounts(inputString);
//        }
//
//        public Map<String, Integer> getWordsToCounts() {
//            return wordsToCounts;
//        }
    }

















//
//    // tests
//
//    // There are lots of valid solutions for this one. You
//    // might have to edit some of these tests if you made
//    // different design decisions in your solution.
//    @Test
//    public void longSentenceTest() {
//        final String text = "What do we want to do with 'After', 'Dana', and 'add'? In this example, your final hash map should include one 'Add' or 'add' with a value of 2. Make reasonable (not necessarily perfect) decisions about cases like 'After' and 'Dana'.";
//        final Map<String, Integer> expected = new HashMap<String, Integer>() { {
//            put("What", 1);
//            put("do", 2);
//            put("we", 1);
//            put("want", 1);
//            put("to", 1);
//            put("with", 2);
//            put("After", 2);
//            put("Dana", 2);
//            put("add", 3);
//            put("In", 1);
//            put("this", 1);
//            put("example", 1);
//            put("your", 1);
//            put("final", 1);
//            put("hash", 1);
//            put("map", 1);
//            put("should", 1);
//            put("include", 1);
//            put("one", 1);
//            put("or", 1);
//            put("a", 1);
//            put("value", 1);
//            put("of", 1);
//            put("Make", 1);
//            put("reasonable", 1);
//            put("not", 1);
//            put("necessarily", 1);
//            put("perfect", 1);
//            put("decisions", 1);
//            put("about", 1);
//            put("cases", 1);
//            put("like", 1);
//            put("and", 2);
//        }};
//        final WordCloudData actual = new WordCloudData(text);
//        assertEquals(expected, actual.getWordsToCounts());
//    }
//
//    @Test
//    public void simpleSentenceTest() {
//        final String text = "I like cake";
//        final Map<String, Integer> expected = new HashMap<String, Integer>() { {
//            put("I", 1);
//            put("like", 1);
//            put("cake", 1);
//        }};
//        final WordCloudData actual = new WordCloudData(text);
//        assertEquals(expected, actual.getWordsToCounts());
//    }
//
//    @Test
//    public void manySymbolsTest() {
//        final String text = "I9345!--#$^3like?? cake ::";
//        final Map<String, Integer> expected = new HashMap<String, Integer>() { {
//            put("I", 1);
//            put("like", 1);
//            put("cake", 1);
//        }};
//        final WordCloudData actual = new WordCloudData(text);
//        assertEquals(expected, actual.getWordsToCounts());
//    }
//
//    @Test
//    public void sentenceSymbolsTest() {
//        final String text = "To do this, you'll need data.";
//        final Map<String, Integer> expected = new HashMap<String, Integer>() { {
//            put("To", 1);
//            put("do", 1);
//            put("this", 1);
//            put("you'll", 1);
//            put("need", 1);
//            put("data", 1);
//        }};
//        final WordCloudData actual = new WordCloudData(text);
//        assertEquals(expected, actual.getWordsToCounts());
//    }
//
//    @Test
//    public void longerSentenceTest() {
//        final String text = "Chocolate cake for dinner and pound cake for dessert";
//        final Map<String, Integer> expected = new HashMap<String, Integer>() { {
//            put("and", 1);
//            put("pound", 1);
//            put("for", 2);
//            put("dessert", 1);
//            put("Chocolate", 1);
//            put("dinner", 1);
//            put("cake", 2);
//        }};
//        final WordCloudData actual = new WordCloudData(text);
//        assertEquals(expected, actual.getWordsToCounts());
//    }
//
//    @Test
//    public void punctuationTest() {
//        final String text = "Strawberry short cake? Yum!";
//        final Map<String, Integer> expected = new HashMap<String, Integer>() { {
//            put("cake", 1);
//            put("Strawberry", 1);
//            put("short", 1);
//            put("Yum", 1);
//        }};
//        final WordCloudData actual = new WordCloudData(text);
//        assertEquals(expected, actual.getWordsToCounts());
//    }
//
//    @Test
//    public void hyphenatedWordsTest() {
//        final String text = "Dessert - mille-feuille cake";
//        final Map<String, Integer> expected = new HashMap<String, Integer>() { {
//            put("cake", 1);
//            put("Dessert", 1);
//            put("mille-feuille", 1);
//        }};
//        final WordCloudData actual = new WordCloudData(text);
//        assertEquals(expected, actual.getWordsToCounts());
//    }
//
//    @Test
//    public void ellipsesBetweenWordsTest() {
//        final String text = "Mmm...mmm...decisions...decisions";
//        final Map<String, Integer> expected = new HashMap<String, Integer>() { {
//            put("mmm", 2);
//            put("decisions", 2);
//        }};
//        final WordCloudData actual = new WordCloudData(text);
//        assertEquals(expected, actual.getWordsToCounts());
//    }
//
//    @Test
//    public void apostrophesTest() {
//        final String text = "Allie's Bakery: Sasha's Cakes";
//        final Map<String, Integer> expected = new HashMap<String, Integer>() { {
//            put("Bakery", 1);
//            put("Cakes", 1);
//            put("Allie's", 1);
//            put("Sasha's", 1);
//        }};
//        final WordCloudData actual = new WordCloudData(text);
//        assertEquals(expected, actual.getWordsToCounts());
//    }
//
//    public static void main(String[] args) {
//        Result result = JUnitCore.runClasses(Solution.class);
//        for (Failure failure : result.getFailures()) {
//            System.out.println(failure.toString());
//        }
//        if (result.wasSuccessful()) {
//            System.out.println("All tests passed.");
//        }
//    }
