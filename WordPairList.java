import java.util.ArrayList;
public class WordPairList {
    /** The list of word pairs, initialized by the constructor. */
    private ArrayList<WordPair> allPairs = new ArrayList<>();

    public WordPairList(String[] words) 
    {
        for(int i = 0; i < words.length-1; i++)
        {
            for(int j = i + 1; j < words.length; j++)
            {
                allPairs.add(new WordPair(words[i], words[j]));
            }
        }
    }

    public ArrayList<WordPair> pairList()
    {
        return allPairs;
    }

    public int numMatches() 
    {
        int count = 0;
        for(int i = 0; i < allPairs.size(); i++)
        {
            if(allPairs.get(i).getFirst().equals(allPairs.get(i).getSecond())) count ++;
        }
        return count;
    }
}