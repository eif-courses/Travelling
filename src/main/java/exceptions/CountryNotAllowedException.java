package exceptions;

public class CountryNotAllowedException extends Exception{
  public CountryNotAllowedException(String message) {
    super(message);
  }
}
