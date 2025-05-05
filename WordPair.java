public class WordPair {
    
    private String wordone ="";
    private String wordtwo ="";

    public WordPair(String f, String s) {
        
        wordone = f;
        wordtwo = s;

     }

    /** Returns the first string of this WordPair object. */
    public String getFirst() {
    return wordone;    
    }

    /** Returns the second string of this WordPair object. */
    public String getSecond() {
        return wordtwo;
     }
}
