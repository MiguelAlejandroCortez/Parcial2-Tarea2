package oop.parcial2.neighborhood;

public class DiningRoom extends Room{
    private final int windows;
    private final boolean tv;
    private final int chairsCapicity;


    DiningRoom(int windows, boolean tv, int chairsCapicity, int width, int height, String color) {
        super(width, height, color);
        this.windows = windows;
        this.tv = tv;
        this.chairsCapicity = chairsCapicity;
    }

    public int getWindows() {
        return windows;
    }

    public boolean isTv() {
        return tv;
    }

    public int getChairsCapicity() {
        return chairsCapicity;
    }

    public static DiningRoomBuilder builder(){
        return new DiningRoomBuilder();
    }
}