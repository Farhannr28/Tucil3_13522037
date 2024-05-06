package src;

public class Trie {

    /* Attributes */
    private TrieNode root;

    /* Constructor */
    public Trie() {
        root = new TrieNode();
    }

    /* Methods */
    public void insert(String word) {
        TrieNode curr = root;
        char[] charArray = word.toCharArray();
        for (char ch : charArray) {
            int i = ch - 'a';
            if (curr.child[i] == null) {
                curr.child[i] = new TrieNode();
            }
            curr = curr.child[i];
        }
        curr.isEnd = true;
    }

    public boolean search(String word) {
        TrieNode curr = root;
        char[] charArray = word.toCharArray();
        for (char ch : charArray) {
            int i = ch - 'a';
            if (curr.child[i] == null) {
                return false;
            }
            curr = curr.child[i];
        }
        return curr.isEnd;
    }

    public void createTrie(String[] arr){
        for (int i=0; i<arr.length; i++){
            this.insert(arr[i]);
        }
    }
}
