import exceptions.CountryNotAllowedException;

import java.util.List;

public class Wizzair extends TripPlanner{
  public Wizzair(List<Place> places) throws CountryNotAllowedException {
    super(places);
  }

  @Override
  void info() {
    System.out.println("WIzzair company best in the world!");
  }
}
