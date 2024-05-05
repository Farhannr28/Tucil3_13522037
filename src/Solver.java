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
    private long calculationDuration;
    private int numVisited;

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
        io.showTitle();
        io.firstGreeting();
        this.startProgram();
    }

    public void startProgram(){
        boolean restart = true;
        while (restart){
            io.askInputs(tr);
            solution = new ArrayList<String>();
            long startTime, endTime;
            if (io.getSelection() == 1){
                Algorithm algorithm = new UCS(io.getOrigin(), io.getTarget());
                startTime = System.currentTimeMillis();
                algorithm.doAlgorithm(adj);
                endTime = System.currentTimeMillis();
                solution = algorithm.getSolutionPath();
                numVisited = algorithm.getNodeVisited();
                algorithm = null;
            } else if (io.getSelection() == 2){
                Algorithm algorithm = new GreedyBestFirstSearch(io.getOrigin(), io.getTarget());
                startTime = System.currentTimeMillis();
                algorithm.doAlgorithm(adj);
                endTime = System.currentTimeMillis();
                solution = algorithm.getSolutionPath();
                numVisited = algorithm.getNodeVisited();
                algorithm = null;
            } else {
                Algorithm algorithm = new AStar(io.getOrigin(), io.getTarget());
                startTime = System.currentTimeMillis();
                algorithm.doAlgorithm(adj);
                endTime = System.currentTimeMillis();
                solution = algorithm.getSolutionPath();
                numVisited = algorithm.getNodeVisited();
                algorithm = null;
            }
            calculationDuration = endTime - startTime;
            io.printSolution(solution);
            io.printSearchData(numVisited, calculationDuration, solution.size());
            if (io.askToRestart()){
                io.nextGreeting();
            } else {
                io.closeProgram();
                restart = false;
            }
        }
    }
}