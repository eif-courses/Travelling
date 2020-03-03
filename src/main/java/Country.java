import java.util.ArrayList;
import java.util.List;

public class Country {
    private String name;
    List<Place> places;

    public Country(String name, List<Place> places) {
        this.name = name;
        this.places = places;
    }

    public String getName() {
        return name;
    }

    public List<Place> getPlaces() {
        return places;
    }

    public void addPlace(Place place){
        places.add(place);
    }
}
