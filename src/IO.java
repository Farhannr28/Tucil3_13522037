package src;

import java.util.*;
import java.io.IOException;

public class IO {

    /* ATTRIBUTES */
    private Scanner scanner = new Scanner(System.in);  
    private PrintColor pc;
    private String origin;  
    private String target;
    private long randomNumber;  
    private Integer algorithmSelection;
    private int threadSleepTime = 150;
    
    /* CONSTRUCTOR METHOD*/
    public IO(){
        pc = new PrintColor();
    }

    /* clearScreen Method */
    public static void clearScreen() throws InterruptedException, IOException {
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("windows")) {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } else {
            new ProcessBuilder("clear").inheritIO().start().waitFor();
        }
    }

    /* Getter */
    public String getOrigin(){
        return origin.toLowerCase();
    }

    public String getTarget(){
        return target.toLowerCase();
    }

    public int getSelection(){
        return algorithmSelection;
    }

    /* PRINT METHODS */
    public void loadingScreen(Thread backgroundThread) throws InterruptedException, IOException{
        pc.PrintBlue();
        clearScreen();
        System.out.print("Program Initializing...\n" +
                 "██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒ 10%\n");
        Thread.sleep(threadSleepTime);
        clearScreen();
        System.out.print("Program Initializing...\n" +
                 "████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒ 20%\n");
        Thread.sleep(threadSleepTime);
        clearScreen();
        System.out.print("Program Initializing...\n" +
                 "██████▒▒▒▒▒▒▒▒▒▒▒▒▒▒ 30%\n");
        Thread.sleep(threadSleepTime);
        clearScreen();
        System.out.print("Program Initializing...\n" +
                 "████████▒▒▒▒▒▒▒▒▒▒▒▒ 40%\n");
        Thread.sleep(threadSleepTime);
        clearScreen();
        System.out.print("Program Initializing...\n" +
                 "██████████▒▒▒▒▒▒▒▒▒▒ 50%\n");
        Thread.sleep(threadSleepTime);
        clearScreen();
        System.out.print("Program Initializing...\n" +
                 "████████████▒▒▒▒▒▒▒▒ 60%\n");
        Thread.sleep(threadSleepTime);
        clearScreen();
        System.out.print("Program Initializing...\n" +
                 "██████████████▒▒▒▒▒▒ 70%\n");
        Thread.sleep(threadSleepTime);
        clearScreen();
        System.out.print("Program Initializing...\n" +
                 "████████████████▒▒▒▒ 80%\n");
        backgroundThread.join();
        clearScreen();
        System.out.print("Program Initializing...\n" +
                 "██████████████████▒▒ 90%\n");
        Thread.sleep(threadSleepTime);
        clearScreen();
        System.out.print("Program Initializing...\n" +
                 "████████████████████ 100%\n");
        Thread.sleep(threadSleepTime);
        clearScreen();
        pc.PrintReset();
    }

    public void showTitle(){
        pc.PrintCyan();
        System.out.println();
        System.out.println("░▒▓█▓▒░░▒▓█▓▒░░▒▓█▓▒░░▒▓██████▓▒░░▒▓███████▓▒░░▒▓███████▓▒░       ░▒▓█▓▒░       ░▒▓██████▓▒░░▒▓███████▓▒░░▒▓███████▓▒░░▒▓████████▓▒░▒▓███████▓▒░  ");
        System.out.println("░▒▓█▓▒░░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░ ");
        System.out.println("░▒▓█▓▒░░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░ ");
        System.out.println("░▒▓█▓▒░░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓███████▓▒░░▒▓█▓▒░░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓████████▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓██████▓▒░ ░▒▓███████▓▒░  ");
        System.out.println("░▒▓█▓▒░░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░ ");
        System.out.println("░▒▓█▓▒░░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░      ░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓█▓▒░      ░▒▓█▓▒░░▒▓█▓▒░ ");
        System.out.println(" ░▒▓█████████████▓▒░ ░▒▓██████▓▒░░▒▓█▓▒░░▒▓█▓▒░▒▓███████▓▒░       ░▒▓████████▓▒░▒▓█▓▒░░▒▓█▓▒░▒▓███████▓▒░░▒▓███████▓▒░░▒▓████████▓▒░▒▓█▓▒░░▒▓█▓▒░ ");
        System.out.println();
        pc.PrintReset();
    }

    public void firstGreeting(){
        pc.PrintYellow();
        System.out.println("<:>:<:>:<:>:<:>:<:>:<:>:<:>:<:>:<:>:<:>:<:>:<:>:<:>:<:>:<:><:>:<:>:<:>:<:>:<:>:<:>:<:>:<:>:<:>:<:>:<:>:<:>:<:>:<:>:<:><:>:<:>:<:>:<:>:<:>:<:>:<:>");
        pc.PrintReset();
        System.out.println();
        System.out.println(">>> Welcome to Word Ladder Solver");
        System.out.println(">>> This solver will find optimum path in a word ladder game for any 2 word in the English dictionary");
        System.out.println();
    }

    public void askInputs(Trie tr){
        randomNumber = (System.currentTimeMillis()/1000) % 4;
        askOrigin();
        while (!tr.search(this.getOrigin())){
            System.out.println(pc.RED + "!!! " +  this.origin+ " doesn't exists in Dictionary, pick another word!" + pc.DEFAULT);
            pc.PrintGreen();
            System.out.print("??? ");
            this.origin = scanner.nextLine();
            pc.PrintReset();
            this.origin = this.origin.toUpperCase();
            System.out.println();
        }
        askTarget();
        boolean isValid;
        if (!tr.search(this.getTarget())){
            System.out.println(pc.RED + "!!! " + this.target +  " doesn't exists in Dictionary, pick another word!" + pc.DEFAULT);
            isValid = false;
        } else if (this.origin.length() != this.target.length()){
            System.out.println(pc.RED + "!!! Word length doesn't match, pick another ending word!" + pc.DEFAULT);
            isValid = false;
        } else {
            isValid = true;
        }
        while (!isValid){
            pc.PrintGreen();
            System.out.print("??? ");
            this.target = scanner.nextLine();
            pc.PrintReset();
            this.target = this.target.toUpperCase();
            System.out.println();
            if (!tr.search(this.getTarget())){
                System.out.println(pc.RED + "!!! " + this.target + " doesn't exists in Dictionary, pick another word!" + pc.DEFAULT);
                isValid = false;
            } else if (this.origin.length() != this.target.length()){
                System.out.println(pc.RED + "!!! Word length doesn't match, pick another ending word!" + pc.DEFAULT);
                isValid = false;
            } else {
                isValid = true;
            }
        }
        askSelection();
    }

    public void askOrigin(){
        if (this.randomNumber == 0){
            System.out.println(">>> What would the starting word be: ");
        } else if (this.randomNumber == 1){
            System.out.println(">>> Please input the origin word: ");
        } else if (this.randomNumber == 2){
            System.out.println(">>> Where would we start the search from: ");
        } else {
            System.out.println(">>> Enter a word to begin our search: ");
        }
        pc.PrintGreen();
        System.out.print("??? ");
        this.origin = scanner.nextLine();
        pc.PrintReset();
        this.origin = this.origin.toUpperCase();
        System.out.println();
    }

    public void askTarget(){
        if (this.randomNumber == 0){
            System.out.println(">>> Good!, " + pc.GREEN +  this.origin + pc.DEFAULT + " is the starting word");
            System.out.println(">>> Now what would the ending word be: ");
        } else if (this.randomNumber == 1){
            System.out.println(">>> Sublime!, " + pc.GREEN +  this.origin + pc.DEFAULT + " is the origin word");
            System.out.println(">>> Next, Please input the ending word: ");
        } else if (this.randomNumber == 2){
            System.out.println(">>> Our search will start from " + pc.GREEN +  this.origin + pc.DEFAULT);
            System.out.println(">>> Where will we end our search: ");
        } else {
            System.out.println(">>> " + pc.GREEN +  this.origin + pc.DEFAULT + " is entered, excellent!");
            System.out.println(">>> Now enter the word to end with: ");
        }
        pc.PrintGreen();
        System.out.print("??? ");
        this.target = scanner.nextLine();
        pc.PrintReset();
        this.target = this.target.toUpperCase();
        System.out.println();
    }
    
    public void askSelection(){
        if (this.randomNumber == 0){
            System.out.println(">>> Great!, " + pc.GREEN +  this.target + pc.DEFAULT + " is the end");
            System.out.println();
            System.out.println(">>> Now what algorithm would be used:");
        } else if (this.randomNumber == 1){
            System.out.println(">>> Superb!, " + pc.GREEN +  this.target + pc.DEFAULT + " is the ending word");
            System.out.println();
            System.out.println(">>> Please choose an algorithm to be used:");
        } else if (this.randomNumber == 2){
            System.out.println(">>> Our search will end at " + pc.GREEN +  this.target + pc.DEFAULT);
            System.out.println();
            System.out.println(">>> Before we begin our search, pick one of the following algoritm:");
        } else {
            System.out.println(">>> " + pc.GREEN +  this.target + pc.DEFAULT + " is sucessfully entered");
            System.out.println();
            System.out.println(">> Next, an algorithm for the searching process:");
        }
        pc.PrintPurple();
        System.out.println("1. Uniform Cost Search");
        System.out.println("2. Greedy Best First Search");
        System.out.println("3. A*");
        pc.PrintReset();
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
        pc.PrintGreen();
        System.out.print("??? ");
        this.algorithmSelection = Integer.parseInt(scanner.nextLine());
        pc.PrintReset();
        System.out.println();
        while (this.algorithmSelection < 0 || this.algorithmSelection > 3){
            System.out.println(pc.RED + "!!! Algorithms selection is Invalid, Pick a number between 1 and 3" + pc.DEFAULT);
            pc.PrintGreen();
            System.out.print("??? ");
            this.algorithmSelection = Integer.parseInt(scanner.nextLine());
            pc.PrintReset();
            System.out.println();
        }
        String[] algoList = {"Uniform Cost Search", "Greedy Best First Search", "A*"};
        if (this.randomNumber == 0){
            System.out.println(">>> " + pc.PURPLE + algoList[this.algorithmSelection-1] + pc.DEFAULT + " would be used");
            System.out.println(">>> Fantastic!, we can finally start the search");
        } else if (this.randomNumber == 1){
            System.out.println(">>> " + pc.PURPLE + algoList[this.algorithmSelection-1] + pc.DEFAULT + " is the choosen Algorithm");
            System.out.println(">>> Please be patient while the solver is starting");
        } else if (this.randomNumber == 2){
            System.out.println(">>> You selected " + pc.PURPLE + algoList[this.algorithmSelection-1] + pc.DEFAULT);
            System.out.println(">>> Marvelous!, let's start our search for a solution");
        } else {
            System.out.println(">>> " + pc.PURPLE + algoList[this.algorithmSelection-1] + pc.DEFAULT + " has been entered as the search Algorithm");
            System.out.println(">>> We can finally begin!");
        }
        System.out.println();
    }

    public void printSolution(ArrayList<String> sol){
        if (sol.isEmpty()){
            pc.PrintYellow();
            System.out.println(">>> There is no solution found for this word ladder!");
            pc.PrintReset();
        } else {
            System.out.println(">>> Building your Ladder!");
            System.out.println();
            for (String word : sol){
                pc.PrintYellow();
                System.out.print("╬═╬  ");
                pc.PrintReset();
                for (int i=0; i<word.length(); i++){
                    if (word.charAt(i) == target.charAt(i)){
                        pc.PrintGreen();
                        System.out.print(word.charAt(i) + " ");
                        pc.PrintReset();
                    } else {
                        System.out.print(word.charAt(i) + " ");
                    }
                }
                System.out.println();
            }
        }
        System.out.println();
    }

    public void printSearchData(int numVisited, long calculationDuration, int pathlength){
        System.out.println(">>> Number of nodes visited are " + pc.RED + numVisited + " Nodes" + pc.DEFAULT);
        System.out.println(">>> The path found is " + pc.RED + pathlength + " words long" + pc.DEFAULT);
        System.out.println(">>> Time taken to find solution is " + pc.RED + calculationDuration + " miliseconds" + pc.DEFAULT);
        System.out.println();
    }

    public void nextGreeting(){
        pc.PrintYellow();
        System.out.println("<:>:<:>:<:>:<:>:<:>:<:>:<:>:<:>:<:>:<:>:<:>:<:>:<:>:<:>:<:><:>:<:>:<:>:<:>:<:>:<:>:<:>:<:>:<:>:<:>:<:>:<:>:<:>:<:>:<:><:>:<:>:<:>:<:>:<:>:<:>:<:>");
        pc.PrintReset();
        System.out.println();
        System.out.println(">>> Welcome back!, what Word Ladder game would you try this time");
        System.out.println();
    }

    public boolean askToRestart(){
        String input;
        System.out.println(">>> Do you want to try another word ladder " + pc.BRIGHTBLUE + "(Yes/No) " + pc.DEFAULT);
        pc.PrintGreen();
        System.out.print("??? ");
        input = scanner.nextLine();
        pc.PrintReset();
        System.out.println();
        if (input.equals("YES") || input.equals("Yes") || input.equals("yes") || input.equals("Y") || input.equals("y")){
            return true;
        } else {
            return false;
        }
    }

    public void closeProgram(){
        pc.PrintBlue();
        System.out.println("Thank you for using Word Ladder Solver, see you next time!");
        System.out.println("Closing Program...");
        pc.PrintReset();
    }
}
