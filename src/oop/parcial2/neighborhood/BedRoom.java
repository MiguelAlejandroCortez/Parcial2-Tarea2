package oop.parcial2.neighborhood;

public class BedRoom extends Room {
    private final BedSize bedSize;
    private final boolean tv;

    BedRoom(BedSize bedSize, boolean tv, int width, int height, String color) {
        super(width, height, color);
        this.bedSize = bedSize; 
        this.tv = tv;
    }

    public BedSize getBedSize() {
        return bedSize;
    }

    public boolean isTv() {
        return tv;
    }

    public static BedRoomBuilder builder(){
        return new BedRoomBuilder();
    }
}
