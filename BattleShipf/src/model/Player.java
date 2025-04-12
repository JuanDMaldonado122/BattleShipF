package model;

public class Player {
    
    private String name;
    private int playerWon;
    private Board board;

    public Player(String name, int playerWon, Board board) {
        this.name = name;
        this.playerWon = playerWon;
        this.board = board;
    }

    public void makeMove(Coordinate coordinates){


    }

    public void generateMove(){


    }

    public String checkStatus(){

        return "";
    }

    public String organizePlayerBoard(){

        String board = "\t";

        return "";
    }

    public String organizeComputerBoard(){

        return "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPlayerWon() {
        return playerWon;
    }

    public void setPlayerWon(int playerWon) {
        this.playerWon = playerWon;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }
   
}
