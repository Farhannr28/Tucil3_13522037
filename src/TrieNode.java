package src;

import java.util.*;

public class TrieNode {
    TrieNode[] child;
    boolean isEnd;

    public TrieNode() {
        child = new TrieNode[26];
        isEnd = false;
    }
}
