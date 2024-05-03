package src;

import java.io.IOException;

import src.IO;
import src.FileReader;
import src.Trie;
import src.Adjacency;

public class Solver {
    private static IO io;
    private static FileReader fr;
    private static Trie tr;
    private static Adjacency adj;

    public Solver() throws InterruptedException, IOException{
        io = new IO();
        fr = new FileReader();
        fr.readFile();
        tr = new Trie();
        tr.createTrie(fr.getWordList());
        adj = new Adjacency();
        Thread loadingThread = new Thread(() -> {
            try {
                adj.createAdjacencyMap(fr.getWordList(), tr);
            } catch (Exception e) {
                System.err.println("Background function was interrupted.");
            }
        });
        loadingThread.start();
        io.loadingScreen(loadingThread);
        io.startProgram();
        // String[] temp = new String[100];
        // temp = adj.getAdjacency("dick");
        // for (String w : temp){
        //     System.out.println(w);
        // }
        // System.out.println();
        // temp = adj.getAdjacency("duck");
        // for (String w : temp){
        //     System.out.println(w);
        // }
    }
}