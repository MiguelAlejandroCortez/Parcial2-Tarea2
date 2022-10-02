package oop.parcial2.neighborhood;

import java.util.List;

public class House {
    private final Kitchen kitchen;
    private final DiningRoom diningRoom;
    private final LivingRoom livingRoom;
    private List<RestRoom> restRooms;
    private List<BedRoom> bedRooms;
    private final Yard yard;



    House(Kitchen kitchen, DiningRoom diningRoom, LivingRoom livingRoom, List<RestRoom> restRooms, List<BedRoom> bedRooms, Yard yard) {
        this.kitchen = kitchen;
        this.diningRoom = diningRoom;
        this.livingRoom = livingRoom;
        this.restRooms = restRooms;
        this.bedRooms = bedRooms;
        this.yard = yard;
    }

    public Yard getYard() {
        return yard;
    }

    public Kitchen getKitchen() {
        return kitchen;
    }

    public DiningRoom getDiningRoom() {
        return diningRoom;
    }

    public LivingRoom getLivingRoom() {
        return livingRoom;
    }

    public List<RestRoom> getRestRooms() {
        return restRooms;
    }

    public List<BedRoom> getBedRooms() {
        return bedRooms;
    }

    public static HouseBuilder builder(){
        return new HouseBuilder();
    }
}
