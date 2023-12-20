import java.util.Scanner;

public class TicTacToeGameRunner {
    static char emptySpaceSymbol = ' ';
    static char playerOneSymbol = 'X';
    static char playerTwoSymbol = 'O';
    public static void main(String[] args) {

    }
    private static String displayGameFromState(char[][] state){

    }
    private static char[][] getInitialGameState(){
        return new char[][]{{emptySpaceSybol, emptySpaceSybol, emptySpaceSybol},
                            {emptySpaceSybol, emptySpaceSybol, emptySpaceSybol},
                            {emptySpaceSybol, emptySpaceSybol, emptySpaceSybol}};
    }
    private static ArrayList<char[][]> runTwoPlayerGame(String[] playerNames){

    }
    private static ArrayList<char[][]> runOnePlayerGame(String[] playerNames){

    }
    private static char[][] runPlayerMove(String playerName, char playerSymbol, char[][] currentState){

    }
    private static int[] getInBoundsPlayerMove(String playerName){
        Scanner sc = new Scanner(System.in);
        boolean pass = true;
        int[] move = new int[2];
        while(pass){
            System.out.print(playerName + " enter a row: ");
            int row = sc.nextInt();
            move[0] = row;
            System.out.print(playerName + " enter a column: ");
            int column = sc.nextInt();
            move[1] = column;
            if (move[0] == 0 || move[0] == 1 || move[0] ==2){
                if (move[1] == 0 || move[1] == 1 || move[1] == 2){
                    pass = false;
                }
                else{
                    System.out.println("That column is out of bounds, please try again.");
                }
            }
            else{
                System.out.println("That row is out of bounds, please try again.");
            }
        }
        return move;
    }
    private static boolean checkValidMove(int[] move, char[][] state){

    }
    private static char[][] makeMove(int[] move, char symbol, char[][] currentState){

    }
    private static boolean checkWin(char[][] state){

    }
    private static boolean checkDraw(char[][] state){

    }
    private static char[][] getCPUMove(char[][] gameState, char symbol){

    }
    private static ArrayList<int[]> getValidMoves(char[][] gameState){

    }
    private static void runGameHistory(String[] playerNames, ArrayList<char[][]> gameHistory){

    }

}