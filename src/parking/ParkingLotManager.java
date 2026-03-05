package parking;

import java.util.*;

public class ParkingLotManager {

    private HashMap<String,Integer> parking = new HashMap<>();

    public void parkVehicle(String plate,int spot){

        parking.put(plate,spot);

    }

    public void exitVehicle(String plate){

        parking.remove(plate);

    }

}
