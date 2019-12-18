
/*public class nov25task {
 /*   static String[] words;
    /**
     * This method loads the words from a given file
     *
     * @param fileName
     *            input file name
     */
    // DO NOT CHANGE
 /*   public static void loadWords(String fileName){
        File file = new File(fileName);
        BufferedReader br;
        String strWords="";
        try {
            br = new BufferedReader(new FileReader(file));
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            int index=0;
            while (line != null) {
                strWords+=line+" ";
                line = br.readLine();
            }
            words = strWords.trim().split(" ");
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /**
     * @param integer
     *            input index of word
     * @return return word if given index has value, otherwise return null
     */
   /* public String getWord(int index) {
        // TODO
        if(index<words.length && index >= 0){
            return words[index];
        }
        return null;
    }
    /**
     *
     * @param word:
     *            input word
     * @return true if the given word exists in the words array. False otherwise
     */
   /* public boolean contains(String word) {
        int count = 0;
        for(int i = 0; i < words.length; i++) {
            if(words[i].equalsIgnoreCase(word)) {
                count++;
            }
        }
        if(count >= 1) return true;
        else return false;
    }
    /**
     *
     * @param word:
     *            input word
     * @param array:
     *            input array
     * @return add word to the beginning of the array and return array
     */
  /*  public String[] addWordArray(String word, String[] array) {
        String [] arr = new String[array.length + 1];
        arr[0] = word;
        for(int i = 1, j = 0; j < array.length; i++, j++ ) {
            arr[i] = array[j];
        }
        return arr;
    }
    /**
     *
     * @param sentence:
     *            input sentence
     * @return true if every word in the sentence exists in your words array. False
     *         otherwise.
     */
    // apple is sweet
 /*   public boolean containsSentence(String sentence) {
        sentence = sentence.toLowerCase();
        String [] arr = sentence.split(" ");
        int count = 0;
        int secondCount = 0;
        for(int i = 0; i < arr.length; i++) {
            count = 0;
            for(int j = 0; j < words.length; j++) {
                if(arr[i].trim() == words[j]) {
                    count++;
                }
            }
            if(count > 0) secondCount++;
        }
        if(secondCount == arr.length) return true;
        return false;
    }
    /**
     * reverse a sentence
     *
     * @param sentence:
     *            input sentence
     * @return reversed sentence. For example: input: "i love java" return: "java love
     *         i" (hint: trim leading and trailing spaces")
     */
 /*   public String reverseSentence(String sentence) {
        String [] arr = sentence.split(" ");
        String str = "";
        for (int i = arr.length - 1; i >= 0 ; i--) {
            str += arr[i];
            if(i == 0) break;
            str += " ";
        }
        return str;
    }
    /**
     *
     * @param word:
     *            input word
     * @return the number of occurrences of the words array . If the word does not
     *         exist, return 0
     */
   /* public int count(String word) {
        int count = 0;
        for(int i = 0; i < words.length; i++){
            if(words[i].equals(word)){
                count++;
            }
        }
        if(count > 0){
            return count;
        }
        return 0;
    }
    /**
     *
     *
     * @param word:
     *            input word
     * @param fileName:
     *            input String of array
     *
     * @return return array of anagram words
     *
     */
    /*public String [] findAnagram(String word, String [] array) {
        // silent => word;  array { listen, book, linest, adf,}
        // array => {listen, linest}
        // TODO
        return null;
    }
    /**
     *
     * extra credit
     * @param array: integer of array
     * @return return array of sorted integer
     * DO NOT USE ARRAYS.SORT
     */
    /*public int[] sort(int[] array){
        return null;
    }
}*/