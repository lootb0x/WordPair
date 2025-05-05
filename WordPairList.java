import java.util.ArrayList;

public class WordPairList {
    /** The list of word pairs, initialized by the constructor. */
    private ArrayList<WordPair> allPairs = new ArrayList<>();

    /**
     * Constructs a WordPairList object as described in part (a).
     * Precondition: words.length >= 2
     */
    public WordPairList(String[] words) 
    {
       for(int x = 0; x<words.length-1; x++)
       {
        for(int y = x; y<words.length-1; y++)
       {
        allPairs.add(new WordPair(words[x],words[y+1]));
       }
    }
    }

    /**
     * Returns the number of matches as described in part (b).
     */
    public int numMatches()
    {
        int count =0;

        for(int x= 0; x<allPairs.size(); x++)
        {
            if(allPairs.get(x).getFirst().equals(allPairs.get(x).getSecond())) count++;
        }
        return count;

    }
}
