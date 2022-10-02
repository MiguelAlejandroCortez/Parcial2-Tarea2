package oop.parcial2.neighborhood;

public class Kitchen extends Room {
    private final boolean stove;
    private final boolean sink;
    private final int windows;
    private final boolean refrigerator;
    private final boolean oven;


    Kitchen(boolean stove, boolean sink, int windows, boolean refrigerator, boolean oven, int width, int height, String color){
        super(width, height, color);     //invocar al constructor de la superclase, osea al constructor de Room
        this.stove = stove;             //super debe de ser la primera sentencia en el constructor
        this.sink = sink;
        this.windows = windows;
        this.refrigerator = refrigerator;
        this.oven = oven;
    }

    public boolean isStove() {
        return stove;
    }

    public boolean isSink() {
        return sink;
    }

    public int getWindows() {
        return windows;
    }

    public boolean isRefrigerator() {
        return refrigerator;
    }

    public boolean isOven() {
        return oven;
    }

    public static KitchenBuilder builder(){
        return new KitchenBuilder();
    }
}
