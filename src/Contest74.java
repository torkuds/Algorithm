public class Contest74 {

    /**
     * Given string S and a dictionary of words words, find the number of words[i] that is a subsequence of S.
     * Example :
     * Input:
     * S = "abcde"
     * words = ["a", "bb", "acd", "ace"]
     * Output: 3
     * Explanation: There are three words in words that are a subsequence of S: "a", "acd", "ace".
     *
     * Note:
     * All words in words and S will only consists of lowercase letters.
     * The length of S will be in the range of [1, 50000].
     * The length of words will be in the range of [1, 5000].
     * The length of words[i] will be in the range of [1, 50].
     * @param S string S
     * @param words dictionary of words words
     * @return  number of words[i] that is a subsequence of S
     */
    public int numMatchingSubseq(String S, String[] words) {
        int count = 0;
        boolean flag = true;
        for (String word : words) {
            flag = true;
            for (int j = 0; j < word.length(); j++) {
                char c = word.charAt(j);
                for (int i = 0; i < S.length(); i++) {
                    char c1 = S.charAt(i);
                }
                String s = String.valueOf(c);
                if (!S.contains(s)) {
                    flag = false;
                    break;
                }
            }
            if (flag)
                count++;
        }
        return count;
    }
}
