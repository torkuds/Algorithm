public class Main {

    public static void main(String[] args) {
        Contest74 contest74 = new Contest74();
        String S = "abcde";
        String[] words = new String[]{"a", "bb", "acd", "ace"};
        int num = contest74.numMatchingSubseq(S, words);
        System.out.println(num);
    }
}
