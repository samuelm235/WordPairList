import java.util.ArrayList;
public class Main
{
    public static void main(String[] args) 
    {
        String[] words1 = {"one", "two", "three"};
        WordPairList wordpairs1 = new WordPairList(words1);
        System.out.println(wordpairs1.pairList());
        String[] words2 = {"the", "more", "the", "merrier"};
        WordPairList wordpairs2 = new WordPairList(words2);
        System.out.println(wordpairs2.pairList());
        String[] words3 = {"the", "red", "fox", "the", "red"};
        WordPairList wordpairs3 = new WordPairList(words3);
        System.out.println(wordpairs3.pairList());
        System.out.println(wordpairs3.numMatches());
        
    }
}