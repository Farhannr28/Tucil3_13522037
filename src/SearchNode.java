package src;

public class SearchNode implements Comparable<SearchNode>{
    private int g;
    private int h;
    private String id;
    private SearchNode parent;

    public SearchNode(){}

    public SearchNode(String _id, SearchNode _parent){
        this.id = _id;
        this.parent = _parent;
        this.g = 0;
        this.h = 0;
    }

    public int getG(){
        return g;
    }

    public int getH(){
        return h;
    }

    public void setG(int _g){
        this.g = _g;
    }

    public void setH(int _h){
        this.h = _h;
    }

    public int getF(){
        return g+h;
    }

    public String getID(){
        return id;
    }

    public SearchNode getParent(){
        return parent;
    }

    @Override
    public int compareTo(SearchNode other){
        return Integer.compare(this.getF(), other.getF());
    }
}