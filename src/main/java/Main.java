import exceptions.CountryNotAllowedException;
import exceptions.OrderStatus;
import exceptions.UUIDException;

import java.util.ArrayList;
import java.util.List;

public class Main {
    int id;
    public static void main(String[] args) throws InterruptedException {

        Place place1 = new Place("Mumbai");
        Place place2 = new Place("Vilnius Cathedral");
        Place place3 = new Place("vilnius3");

        List<Place> places = new ArrayList<>();

        places.add(place1);
        places.add(place2);
        places.add(place3);

        setUUID(10);

        try {
            TripPlanner wizz = new Wizzair(places);
            wizz.info();
        } catch (CountryNotAllowedException e) {
            e.printStackTrace();
            System.out.println("FIXING");
        }



        Shop shop = new Shop();
        shop.buy(1000, OrderStatus.PROCESSING);


    }
    public static void setUUID(int id) throws UUIDException {
        if(id == 0){
            throw new UUIDException("NOT POSSIBLE TO CREATE ID");
        }else{
            new Main().id = id;
        }
    }





}
