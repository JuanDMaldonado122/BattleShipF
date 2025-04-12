package model;

public class Game {
    private Player humanPlayer;
    private Player computerPlayer;
    private Board playerBoard;
    private Board computeBoard;


    public Game(Player humanPlayer, Player computerPlayer, Board playerBoard, Board computeBoard) {
        this.humanPlayer = humanPlayer;
        this.computerPlayer = computerPlayer;
        this.playerBoard = playerBoard;
        this.computeBoard = computeBoard;
    }

    public String setCustomMatch(){

        return "";
    }

    public String setStandarMatch(){

        return "";
    }

    public String checkWins(){

        return "";
    }

    public void startGame(){

    }

    public void addShip(){
        
    }

    
    
}
