package src;

import src.Algorithm;
import src.SearchNode;

public class UCS extends Algorithm{
    
    UCS(String _start, String _end){
        super(_start, _end);
    }

    @Override
    public int calculateG(SearchNode n){
        return n.getParent().getG()+1;
    }

    @Override
    public int calculateH(SearchNode n){
        return 0;
    }
}