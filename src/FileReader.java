package src;

import java.io.*;
import java.util.*;

public class FileReader {
    private Scanner sc;
    private String[] wordList;
    private int wordCount = 370105;

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
            sc = new Scanner(new File("res/words.txt"));
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

    // public static void main(String[] args) {
    //     int[] m = new int[32];
    //     for (int i=0; i<32; i++){
    //         m[i] = 0;
    //     }
    //     int len;
    //     FileReader fr = new FileReader();
    //     for (int i=0; i<fr.wordList.size(); i++){
    //         len = fr.wordList.get(i).length();
    //         m[len]++;
    //     }
    //     for (int i=0; i<32; i++){
    //         System.out.println(m[i]);
    //     }
    //     // 31 Letters
    //     // 53402 words with 9 letters
    // }
}
