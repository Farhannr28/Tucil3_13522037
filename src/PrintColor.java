package src;

public class PrintColor {
    public final String DEFAULT = "\u001B[39m";
    public final String RED = "\u001B[31m";
    public final String GREEN = "\u001B[32m";
    public final String YELLOW = "\u001B[33m";
    public final String BRIGHTBLUE = "\u001B[94m";
    public final String PURPLE = "\u001B[35m";
    public final String CYAN = "\u001B[36m";

    public void PrintReset(){
        System.out.print(DEFAULT);
    }

    public void PrintYellow(){
        System.out.print(YELLOW);
    }

    public void PrintCyan(){
        System.out.print(CYAN);
    }

    public void PrintGreen(){
        System.out.print(GREEN);
    }

    public void PrintBlue(){
        System.out.print(BRIGHTBLUE);
    }

    public void PrintPurple(){
        System.out.print(PURPLE);
    }

    public void PrintRed(){
        System.out.print(RED);
    }
}
