package oop.parcial2.neighborhood;

import java.util.ArrayList;
import java.util.List;

public class HouseBuilder {
    private Kitchen kitchen;
    private DiningRoom diningRoom;
    private LivingRoom livingRoom;
    private List<RestRoom> restRooms;
    private List<BedRoom> bedRooms;
    private Yard yard;

    public HouseBuilder kitchen( Kitchen kitchen) {
        this.kitchen = kitchen;
        return this;
    }

    public HouseBuilder diningRoom( DiningRoom diningRoom) {
        this.diningRoom = diningRoom;
        return this;
    }

    public HouseBuilder livingRoom( LivingRoom livingRoom) {
        this.livingRoom = livingRoom;
        return this;
    }

    public HouseBuilder restRooms( List<RestRoom> restRooms) {
        this.restRooms = restRooms;
        return this;
    }

    public HouseBuilder restRoom(RestRoom restRooms){
        if(this.restRooms ==null){
            this.restRooms = new ArrayList<>();
        }
        this.restRooms.add(restRooms);
        return this;
    }

    public HouseBuilder bedRooms(List<BedRoom> bedRooms){
        this.bedRooms = bedRooms;
        return this;
    }

    public HouseBuilder bedRoom(BedRoom bedRooms) {
        if(this.bedRooms == null){
            this.bedRooms = new ArrayList<>();
        }
        this.bedRooms.add(bedRooms);
        return this;
    }

    public HouseBuilder yard( Yard yard){
        this.yard = yard;
        return this;
    }

    public House build() {
        return new House(kitchen, diningRoom, livingRoom, restRooms, bedRooms, yard);
    }
}