package oop.parcial2.neighborhood;

public class Yard extends Room{
    private final boolean grass;


    Yard(boolean grass, int width, int height, String color) {
        super(width, height, color);
        this.grass = grass;
    }

    public boolean isGrass() {
        return grass;
    }

    public static YardBuilder builder(){
        return new YardBuilder();
    }
}