package src;

import java.util.*;

import src.SearchNode;

abstract class Algorithm {
    private PriorityQueue<SearchNode> pq;
    private Map<String, Integer> m;
    private ArrayList<String> solutionPath;
    private String start;
    private String end;


    public Algorithm(String _start, String _end){
        pq = new PriorityQueue<SearchNode>();
        m = new HashMap<String, Integer>(); // <id, f>
        solutionPath = new ArrayList<>();
        start = _start;
        end = _end;
    }

    public ArrayList<String> getSolutionPath(){
        return solutionPath;
    }

    public int hammingDistanceToEnd(String x){
        int res = 0;
        for (int i=0; i<x.length(); i++){
            if (x.charAt(i) != end.charAt(i)){
                res++;
            }
        }
        return res;
    }

    public abstract int calculateG(SearchNode n);

    public abstract int calculateH(SearchNode n);

    public void doAlgorithm(Adjacency adj){
        SearchNode startNode = new SearchNode(start, null);
        startNode.setG(0);
        startNode.setH(calculateH(startNode));
        pq.add(startNode);
        m.put(start, startNode.getF());

        String[] arr = new String[53];
        SearchNode curr = new SearchNode();
        SearchNode neighborNode = new SearchNode();
        Integer tempInteger;
        boolean found = false;

        while (!pq.isEmpty() && !found){
            curr = pq.poll();
            // System.out.println(curr.getID() + " " + curr.getG() + " " + curr.getH());
            arr = adj.getAdjacency(curr.getID());
            for (String neighbor : arr){
                neighborNode = new SearchNode(neighbor, curr);
                neighborNode.setG(calculateG(neighborNode));
                neighborNode.setH(calculateH(neighborNode));
                // System.out.println(neighborNode.getID() + " " + neighborNode.getG() + " " + neighborNode.getH());
                if (neighbor.equals(end)){
                    solutionPath = constructSolution(neighborNode);
                    found = true;
                    break;
                }
                if (m.containsKey(neighbor)){
                    tempInteger = Integer.valueOf(neighborNode.getF());
                    if (m.get(neighbor) > tempInteger){
                        m.put(neighbor, tempInteger);
                        pq.add(neighborNode);
                        // System.out.println(neighborNode.getID() + neighborNode.getF());
                    }
                } else {
                    m.put(neighbor, neighborNode.getF());
                    pq.add(neighborNode);
                    // System.out.println(neighborNode.getID() + neighborNode.getF());
                }
            }
        }
    }

    public ArrayList<String> constructSolution(SearchNode end){
        ArrayList<String> sol = new ArrayList<String>();
        SearchNode curr = end;
        while (curr != null){
            sol.add(curr.getID().toUpperCase());
            curr = curr.getParent();
        }
        Collections.reverse(sol);
        return sol;
    }
}
