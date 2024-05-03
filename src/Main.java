package src;

import java.io.IOException;

import src.Solver;

class Main {
    private static Solver solver;

    public static void main(String[] args){
        try {
            solver = new Solver();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}