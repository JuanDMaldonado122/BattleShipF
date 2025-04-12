package model;

public enum ShipType {
    
    LANCHA("Lancha", 1, 1), MEDICO("Medico", 2, 1), BARCOPROVISIONES("Barco de Provisiones", 3, 2), 
    BARCOMUNICION("Barco de Municion", 3, 1), BUQUE("Buque de guerra", 4, 2), PORTAAVIONES("Portaaviones", 5, 1);

    private final String name;
    private final int size;
    private final int orientation; //1. vertical  2. horizontal

    ShipType(String name, int size, int orientation) {
        this.name = name;
        this.size = size;
        this.orientation = orientation;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public int getOrientation(){
        return orientation;
    }
}
