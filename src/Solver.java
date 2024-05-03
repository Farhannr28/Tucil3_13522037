package src;

import java.io.IOException;
import java.util.ArrayList;

import src.IO;
import src.FileReader;
import src.Trie;
import src.Adjacency;
import src.Algorithm;
import src.UCS;
import src.GreedyBestFirstSearch;
import src.AStar;

public class Solver {
    private static IO io;
    private static FileReader fr;
    private static Trie tr;
    private static Adjacency adj;
    private ArrayList<String> solution;

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
        solution = new ArrayList<String>();
        if (io.getSelection() == 1){
            Algorithm ucs = new UCS(io.getOrigin(), io.getTarget());
            ucs.doAlgorithm(adj);
            solution = ucs.getSolutionPath();
        } else if (io.getSelection() == 2){
            Algorithm gbfs = new GreedyBestFirstSearch(io.getOrigin(), io.getTarget());
            gbfs.doAlgorithm(adj);
            solution = gbfs.getSolutionPath();
        } else {
            Algorithm A = new AStar(io.getOrigin(), io.getTarget());
            A.doAlgorithm(adj);
            solution = A.getSolutionPath();
        }
        io.printSolution(solution);
    }
}