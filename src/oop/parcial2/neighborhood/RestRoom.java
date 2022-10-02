package oop.parcial2.neighborhood;

public class RestRoom extends Room{
    private final boolean showerCabin;


    RestRoom(boolean showerCabin, int width, int height, String color) {
        super(width, height, color);
        this.showerCabin = showerCabin;
    }

    public boolean isShowerCabin() {
        return showerCabin;
    }

    public static RestRoomBuilder builder(){
        return new RestRoomBuilder();
    }
}