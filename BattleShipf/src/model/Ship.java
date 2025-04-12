package model;
import java.util.ArrayList;


public class Ship {

    private String name;
    private ArrayList<Coordinate> coordinates;
    private int status;
    private ShipType type;

    public Ship(String name, ArrayList<Coordinate> coordinates, int status, ShipType type) {
        this.name = name;
        this.coordinates = coordinates;
        this.status = status;
        this.type = type;
    }

    public boolean setShip(){

        return false;
    }

    public boolean isSunk(){

        return false;
    }

    public boolean isHit(){

        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Coordinate> getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(ArrayList<Coordinate> coordinates) {
        this.coordinates = coordinates;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

}
