package src;

import java.io.*;
import java.util.*;

public class FileReader {
    private Scanner sc;
    private String[] wordList;
    private int wordCount = 80368;

    public FileReader(){
        wordList = new String[wordCount];
        readFile();
    }

    public String[] getWordList(){
        return wordList;
    }

    public void readFile(){
        int i = 0;
        String word;
        try{
            sc = new Scanner(new File("../res/words.txt"));
            while (sc.hasNextLine()){
                word = sc.nextLine();
                wordList[i] = word;
                i++;
            }
            sc.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
