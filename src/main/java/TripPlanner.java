import exceptions.CountryNotAllowedException;

import java.util.List;

public abstract class TripPlanner {

  List<Place> places;

  public TripPlanner(List<Place> places) throws CountryNotAllowedException {
    for (Place place : places) {
      if(place.getName() .equals("vilnius")){
        throw new CountryNotAllowedException(place.getName()+" ,this country not allowed");
      }
    }
    this.places = places;
  }
  abstract void info();



  public List<Place> getPlaces() {
    return places;
  }
}
