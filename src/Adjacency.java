package src;

import java.util.*;

public class Adjacency {
    private HashMap<String, String[]> map;

    public Adjacency(){
        map = new HashMap<String, String[]>();
    }

    public String[] getAdjacency(String node){
        return map.get(node);
    }    

    public void createAdjacencyMap(String[] arr, Trie tr){
        String newWord;
        String[] tempArr = new String[53]; //Placeholder
        String[] putArr;
        int count;
        for (String word : arr){
            char[] charArray = word.toCharArray();
            count = 0;
            for (int i=0; i<charArray.length; i++){
                for (int j=0; j<25; j++){
                    charArray[i] = (charArray[i] == 'z') ? 'a' : (char)(charArray[i]+1);
                    newWord = String.valueOf(charArray);
                    if (tr.search(newWord)){
                        tempArr[count] = newWord;
                        count++;
                    }
                }
                charArray[i] = (charArray[i] == 'z') ? 'a' : (char)(charArray[i]+1);
            }
            putArr = new String[count];
            System.arraycopy(tempArr, 0, putArr, 0, count);
            map.put(word, putArr);
        }
    }
}
