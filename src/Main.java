package src;

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