package br.com.wally.rest;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ParkingSpot {

    private static ParkingSpot INSTANCE = new ParkingSpot();

    private ParkingSpot() {
        spots.put("1", new Spot("1A", "NMD231", "Fiat", "Uno vivace", "Yellow","Messi","A","1A"));
        spots.put("2", new Spot("2A", "GTA123", "Nissan", "Kicks", "Silver","Robin","A","2A"));
        spots.put("3", new Spot("3A", "SAP657", "Hyundai", "HB20", "Brow","Jeffrey","A","3A"));
        spots.put("4", new Spot("4A", "OPA123", "Hyundai", "S10", "Red","Manson","A","4A"));
    }
    public static ParkingSpot GetParkingSpot() {
        return INSTANCE;
    }
    private Map<String, Spot> spots = new HashMap<>();

    public Collection<Spot> viewAllSpots() {
        return spots.values();
    }

    public Spot takeSpot(String spotId){
        return spots.remove(spotId);
    }

    public void registerSpot(Spot newSpot) {
        spots.put(newSpot.getId(), newSpot);
    }

    public void updateSpot(String spotId, Spot updateSpot) {
        spots.put(spotId,updateSpot);
    }
}
