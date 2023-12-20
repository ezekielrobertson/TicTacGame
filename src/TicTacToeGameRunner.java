import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class TicTacToeGameRunner {
    static char emptySpaceSymbol = ' ';
    static char playerOneSymbol = 'X';
    static char playerTwoSymbol = 'O';
    public static void main(String[] args) {

    }
    private static String displayGameFromState(char[][] state){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < state.length; i++) {
            for (int j = 0; j < state[i].length; j++) {
                sb.append(" ");
                sb.append(state[i][j]);
                if (j < state[i].length - 1){
                    sb.append(" |");
                }
            }
            sb.append('\n');
            if (i < state.length - 1){
                sb.append("-----------\n");
            }
        }
        String gameBoard = String.valueOf(sb);
        return gameBoard;
    }
    private static char[][] getInitialGameState(){
        return new char[][]{{emptySpaceSymbol, emptySpaceSymbol, emptySpaceSymbol},
                            {emptySpaceSymbol, emptySpaceSymbol, emptySpaceSymbol},
                            {emptySpaceSymbol, emptySpaceSymbol, emptySpaceSymbol}};
    }
    private static ArrayList<char[][]> runTwoPlayerGame(String[] playerNames){

    }
    private static ArrayList<char[][]> runOnePlayerGame(String[] playerNames){

    }
    private static char[][] runPlayerMove(String playerName, char playerSymbol, char[][] currentState){
        boolean cont = true;
        char[][] newState = new char[][]{};
        while (cont){
            int[] move = getInBoundsPlayerMove(playerName);
            if (checkValidMove(move, currentState)){
                newState = makeMove(move, playerSymbol, currentState);
                cont = false;
            } else{
                System.out.println("That space is already taken. Try again.");
            }
        }
        return newState;
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
        return state[move[0]][move[1]] != playerOneSymbol && state[move[0]][move[1]] != playerTwoSymbol;
    }
    private static char[][] makeMove(int[] move, char symbol, char[][] currentState){
        char[][] currentStateCopy = new char[3][3];
        for (int i = 0; i < 3; i++){
            // check if this still works, if not it's an easy fix
            System.arraycopy(currentState[i], 0, currentStateCopy[i], 0, 3);
        }
        if (checkValidMove(move, currentStateCopy)){
            currentStateCopy[move[0]][move[1]] = symbol;
        }
        return currentStateCopy;
    }
    private static boolean checkWin(char[][] state){
        // two separate diagonals, three rows and three columns
        win = false;
        if (state[0][0] != emptySpaceSymbol){
            //diagonal top left to bottom right
            if (state[0][0] == state[1][1] && state[1][1] == state[2][2]) {
                win = true;
            }
            //top row
            else if (state[0][0] == state[0][1] && state[0][1] == state[0][2]) {
                win = true;
            }
            //left column
            else if (state[0][0] == state[1][0] && state[1][0] == state[2][0]){
                win = true;
        }
        if (state[2][0] != emptySpaceSymbol){
            //diagonal bottom left to top right
            if (state[2][0] == state[1][1] && state[1][1] == state[0][2]){
                win = true;
            //bottom row
            if (state[2][0] == state[2][1] && state[2][1] == state[2][2]){
                win = true;
            }
        }
        if (state[1][1] != emptySpaceSymbol){
            //middle row
            if (state[1][0] == state[1][1] && state[1][1] == state[1][2]){
                win = true;
            }
            //middle column
            if (state[0][1] == state[1][1] && state[1][1] == state[2][1]){
                win = true;
            }
        }
        if (state[0][2] != emptySpaceSymbol){
            //right column
            if (state[0][2] == state[1][2] && state[1][2] == state[2][2]){
                win = true;
            }
        }
        return win;
    }
    private static boolean checkDraw(char[][] state){
        // need to check if there are valid moves,
        // if there are no valid moves, and it is not a win, then it is a draw.
        return getValidMoves(state) == null && checkWin(state) == false;
    }
    private static char[][] getCPUMove(char[][] gameState, char symbol){

    }
    private static ArrayList<int[]> getValidMoves(char[][] gameState){
        ArrayList<int[]> validMoves = new ArrayList<int[]>();
        for (int i = 0; i < gameState.length; i++) {
            for (int j = 0; j < gameState[i].length; j++) {
                int[] moves = new int[2];
                if (gameState[i][j] == emptySpaceSymbol) {
                    moves[0] = i; moves[1] = j;
                    validMoves.add(moves);
                }
            }
        }
        return validMoves;
    }
    private static void runGameHistory(String[] playerNames, ArrayList<char[][]> gameHistory){

    }

}