package oop.parcial2.neighborhood;

public class LivingRoom extends Room {
    private final int windows;
    private final boolean tv;
    private final boolean homeTeather;


     LivingRoom(int windows, boolean tv, boolean homeTeather, int width, int height, String color) {
        super(width, height, color);
        this.windows = windows;
        this.tv = tv;
        this.homeTeather = homeTeather;
    }

    public int getWindows() {
        return windows;
    }

    public boolean isTv() {
        return tv;
    }

    public boolean isHomeTeather() {
        return homeTeather;
    }

    public static LivingRoomBuilder builder(){
        return new LivingRoomBuilder();
    }
}