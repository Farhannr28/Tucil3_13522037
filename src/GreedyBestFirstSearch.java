package src;

public class GreedyBestFirstSearch extends Algorithm{

    GreedyBestFirstSearch(String _start, String _end){
        super(_start, _end);
    }
    
    @Override
    public int calculateG(SearchNode n){
        return 0;
    }

    @Override
    public int calculateH(SearchNode n){
        return hammingDistanceToEnd(n.getID());
    }
}