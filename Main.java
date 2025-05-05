public class Main
{
    public static void main(String[] args) {
        

        String[] moreWords = {"the", "red", "fox", "the", "red"};
        WordPairList exampleThree = new WordPairList(moreWords);

        System.out.println(exampleThree.numMatches());
    }
}
