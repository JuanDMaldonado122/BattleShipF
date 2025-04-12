package model;
import java.util.ArrayList;

public class Board{

    private int[][] grid;
    private ArrayList<Ship> ships;


    public Board(int[][] grid, ArrayList<Ship> ships) {
        this.grid = new int[10][10];
        this.ships = ships;
    }

    public boolean placeShip(){

        return false;
    }

    public void initializer(){

    }

    public boolean remainingShips(){

        return false;
    }

    public int[][] getGrid() {
        return grid;
    }

    public void setGrid(int[][] grid) {
        this.grid = grid;
    }

    public ArrayList<Ship> getShips() {
        return ships;
    }

    public void setShips(ArrayList<Ship> ships) {
        this.ships = ships;
    }

}