import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Place place1 = new Place("Mumbai");
        Place place2 = new Place("Vilnius Cathedral");
        Place place3 = new Place();
        place3.setName("Kryžių kalnas");
        List<Place> places = new ArrayList<>();

        places.add(place1);
        places.add(place2);
        places.add(place3);
        places.add(new Place("Gedimas Castle"));

        Country country = new Country("Lithuania", places);

        country.addPlace(new Place("Barbakanas"));

        for(Place p: country.getPlaces()){
            System.out.println(p.getName());
        }


        //int a = 10/ 0;

           int array [] ={10, 50, 60};


        try {
            for (int i = 0; i < 10; i++) {
                array[i] = i;
            }
        }catch (IndexOutOfBoundsException e){
            System.out.println("PROBLEM FIXING");
        }





    }
}
