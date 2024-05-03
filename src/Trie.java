package src;

import java.util.*;
import src.TrieNode;

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

    // public static void main(String[] args) {
    //     FileReader fr = new FileReader();
    //     long maxMemory = Runtime.getRuntime().maxMemory();
    //     long beforeUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
    //     Trie t = new Trie();
    //     for (int i=0; i<fr.getWordList().length; i++){
    //         t.insert(fr.getWordList()[i]);
    //     }
    //     System.out.println(t.search("farhan"));
    //     System.out.println(t.search("zubeneschamali"));
    //     System.out.println(t.search("organisationally"));
    //     System.out.println(t.search("jksadhiwhoa"));
    //     System.out.println(t.search("iaodhawdioa"));
    //     System.out.println(t.search("livelihoods"));
    //     System.out.println(t.search("rontgenographically"));
    //     System.out.println(t.search("bahasa"));
    //     System.out.println(t.numNode);
    //     long afterUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
    //     long actualMemUsed=afterUsedMem-beforeUsedMem;
    //     System.out.println(actualMemUsed);
    //     System.out.println(maxMemory);
    // }
}
