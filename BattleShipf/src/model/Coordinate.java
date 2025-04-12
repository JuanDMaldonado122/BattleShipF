package model;

public class Coordinate {
    
    private int x;
    private int y;
    private int value;


    public Coordinate(int x, int y, int value) {
        this.x = x;
        this.y = y;
        this.value = value;
    }

    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }

    public boolean isValid(int x, int y){
        return x >= 0 && x < 10 && y >= 0 && y < 10;
    }


}
