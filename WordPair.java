public class WordPair {
    private String string1;
    private String string2;
    public WordPair(String first, String second) 
    {
        string1 = first;
        string2 = second;
    }

    /** Returns the first string of this WordPair object. */
    public String getFirst() {
       return string1; }

    /** Returns the second string of this WordPair object. */
    public String getSecond() {
        return string2; }
    
    public String toString()
    {
        return "(" + string1 + ", " + string2 + ")";
    }
}