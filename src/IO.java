package src;

import java.util.Scanner;
import java.io.IOException;

public class IO {

    /* ATTRIBUTES */
    Scanner scanner = new Scanner(System.in);  
    private String origin;  
    private String target;
    private long randomNumber;  
    private Integer algorithmSelection;
    private int threadSleepTime = 500;
    
    /* CONSTRUCTOR METHOD*/
    public IO(){}

    /* clearScreen Method */
    public static void clearScreen() throws InterruptedException, IOException {
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("windows")) {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } else {
            new ProcessBuilder("clear").inheritIO().start().waitFor();
        }
    }

    /* PRINT METHODS */

    public void loadingScreen(Thread backgroundThread) throws InterruptedException, IOException{
        clearScreen();
        System.out.print("""
                Program Initializing...
                █▒▒▒▒▒▒▒▒▒ 10%
                    """);
        Thread.sleep(threadSleepTime);
        clearScreen();
        System.out.print("""
                Program Initializing...
                ██▒▒▒▒▒▒▒▒ 20%
                    """);
        Thread.sleep(threadSleepTime);
        clearScreen();
        System.out.print("""
                Program Initializing...
                ███▒▒▒▒▒▒▒ 30%
                    """);
        Thread.sleep(threadSleepTime);
        clearScreen();
        System.out.print("""
                Program Initializing...
                ████▒▒▒▒▒▒ 40%
                    """);
        Thread.sleep(threadSleepTime);
        clearScreen();
        System.out.print("""
                Program Initializing...
                █████▒▒▒▒▒ 50%
                    """);
        Thread.sleep(threadSleepTime);
        clearScreen();
        System.out.print("""
                Program Initializing...
                ██████▒▒▒▒ 60%
                    """);
        Thread.sleep(threadSleepTime);
        clearScreen();
        System.out.print("""
                Program Initializing...
                ███████▒▒▒ 70%
                    """);
        Thread.sleep(threadSleepTime);
        clearScreen();
        System.out.print("""
                Program Initializing...
                ████████▒▒ 80%
                    """);
        backgroundThread.join();
        clearScreen();
        System.out.print("""
                Program Initializing...
                █████████▒ 90%
                    """);
        Thread.sleep(300);
        clearScreen();
        System.out.print("""
                Program Initializing...
                ██████████ 100%
                    """);
        Thread.sleep(300);
        clearScreen();
    }

    public void startProgram(){
        this.showTitle();
        this.firstGreeting();
        randomNumber = (System.currentTimeMillis()/1000) % 4;
        this.askInputs();
        this.waitingAnimation();
    }

    public void showTitle(){
        System.out.println();
        System.out.println("░▒▓█▓▒░░▒▓█▓▒░░▒▓█▓▒░░▒▓██████▓▒░░▒▓███████▓▒░░▒▓███████▓▒░       ░▒▓█▓▒░       ░▒▓██████▓▒░░▒▓███████▓▒░░▒▓███████▓▒░░▒▓████████▓▒░▒▓███████▓▒░  ");
        System.out.println("░▒▓█▓▒░░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░ ");
        System.out.println("░▒▓█▓▒░░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░ ");
        System.out.println("░▒▓█▓▒░░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓███████▓▒░░▒▓█▓▒░░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓████████▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓██████▓▒░ ░▒▓███████▓▒░  ");
        System.out.println("░▒▓█▓▒░░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░ ");
        System.out.println("░▒▓█▓▒░░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░ ");
        System.out.println(" ░▒▓█████████████▓▒░ ░▒▓██████▓▒░░▒▓█▓▒░░▒▓█▓▒░▒▓███████▓▒░       ░▒▓████████▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓███████▓▒░░▒▓███████▓▒░░▒▓████████▓▒░▒▓█▓▒░░▒▓█▓▒░ ");
        System.out.println();
    }

    public void firstGreeting(){
        System.out.println("<:>:<:>:<:>:<:>:<:>:<:>:<:>:<:>:<:>:<:>:<:>:<:>:<:>:<:>:<:><:>:<:>:<:>:<:>:<:>:<:>:<:>:<:>:<:>:<:>:<:>:<:>:<:>:<:>:<:><:>:<:>:<:>:<:>:<:>:<:>:<:>:<:>:<:>");
        System.out.println();
        System.out.println(">>> Welcome to Word Ladder Solver");
        System.out.println(">>> This solver will find optimum path in a word ladder game for any 2 word in the English dictionary");
        System.out.println();
    }

    public void askInputs(){
        if (this.randomNumber == 0){
            System.out.println(">>> What would the starting word be: ");
        } else if (this.randomNumber == 1){
            System.out.println(">>> Please input the origin word: ");
        } else if (this.randomNumber == 2){
            System.out.println(">>> Where would we start the search from: ");
        } else {
            System.out.println(">>> Enter a word to begin our search: ");
        }
        System.out.print("??? ");
        this.origin = scanner.nextLine();
        System.out.println();
        if (this.randomNumber == 0){
            System.out.println(">>> Good!, " + this.origin + " is the starting word");
            System.out.println(">>> Now what would the ending word be: ");
        } else if (this.randomNumber == 1){
            System.out.println(">>> Sublime!, " + this.origin + " is the origin word");
            System.out.println(">>> Next, Please input the ending word: ");
        } else if (this.randomNumber == 2){
            System.out.println(">>> Our search will start from " + this.origin);
            System.out.println(">>> Where will we end our search: ");
        } else {
            System.out.println(">>> " + this.origin + " is entered, excellent!");
            System.out.println(">>> Now enter the word to end with: ");
        }
        System.out.print("??? ");
        this.target = scanner.nextLine();
        System.out.println();
        if (this.randomNumber == 0){
            System.out.println(">>> Great!, " + this.target + " is the end");
            System.out.println();
            System.out.println(">>> Now what algorithm would be used:");
        } else if (this.randomNumber == 1){
            System.out.println(">>> Superb!, " + this.target + " is the ending word");
            System.out.println();
            System.out.println(">>> Please choose an algorithm to be used:");
        } else if (this.randomNumber == 2){
            System.out.println(">>> Our search will end at " + this.target);
            System.out.println();
            System.out.println(">>> Before we begin our search, pick one of the following algoritm:");
        } else {
            System.out.println(">>> " + this.target + " is sucessfully entered");
            System.out.println();
            System.out.println(">> Next, an algorithm for the searching process:");
        }
        System.out.println("1. Uniform Cost Search");
        System.out.println("2. Greedy Best First Search");
        System.out.println("3. A*");
        System.out.println();
        if (this.randomNumber == 0){
            System.out.println(">>> What algorithm number would be used: ");
        } else if (this.randomNumber == 1){
            System.out.println(">>> Please input the chosen algorithm number: ");
        } else if (this.randomNumber == 2){
            System.out.println(">>> Pick a number according to the algorithm: ");
        } else {
            System.out.println(">>> Enter an algorithm number: ");
        }
        System.out.print("??? ");
        this.algorithmSelection = Integer.parseInt(scanner.nextLine());
        System.out.println();
        if (this.randomNumber == 0){
            System.out.println(">>> Fantastic!, we can finally start the search");
        } else if (this.randomNumber == 1){
            System.out.println(">>> Please be patient while the solver is starting");
        } else if (this.randomNumber == 2){
            System.out.println(">>> Marvelous!, let's start our search for a solution");
        } else {
            System.out.println(">>> We can finally begin!");
        }
        System.out.println();
    }

    public void waitingAnimation(){
        System.out.println("Building Your Ladder");
    }
}
