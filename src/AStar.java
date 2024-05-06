package src;

public class AStar extends Algorithm{

    AStar(String _start, String _end){
        super(_start, _end);
    }
    
    @Override
    public int calculateG(SearchNode n){
        return n.getParent().getG()+1;
    }

    @Override
    public int calculateH(SearchNode n){
        return hammingDistanceToEnd(n.getID());
    }
}