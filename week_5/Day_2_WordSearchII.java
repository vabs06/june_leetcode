//  Question Link: https://leetcode.com/explore/challenge/card/june-leetcoding-challenge/543/week-5-june-29th-june-30th/3376/

class Trie {
    Trie[] next = new Trie[26];
    String word;
}

class Day_2_WordSearchII {
    public Trie buildTrie(String[] words) {
        Trie root = new Trie();
        for (String str : words) {
            Trie t = root;
            for (char ch : str.toCharArray()) {
                int idx = ch - 'a';
                if (t.next[idx] == null)
                    t.next[idx] = new Trie();
                t = t.next[idx];
            }
            t.word = str;
        }
        return root;
    }

    public List<String> findWords(char[][] board, String[] words) {
        List<String> result = new ArrayList<>();
        Trie root = buildTrie(words);

        for (int i = 0; i < board.length; i++)
            for (int j = 0; j < board[0].length; j++)
                dfs(board, i, j, root, result);
        return result;
    }

    public void dfs(char[][] board, int i, int j, Trie t, List<String> result) {
        char ch = board[i][j];
        if (ch == '#' || t.next[ch - 'a'] == null)
            return;
        t = t.next[ch - 'a'];
        if (t.word != null) {
            result.add(t.word);
            t.word = null;
        }
        board[i][j] = '#';
        if (i > 0)
            dfs(board, i - 1, j, t, result);
        if (j > 0)
            dfs(board, i, j - 1, t, result);
        if (i < board.length - 1)
            dfs(board, i + 1, j, t, result);
        if (j < board[0].length - 1)
            dfs(board, i, j + 1, t, result);
        board[i][j] = ch;
    }

}