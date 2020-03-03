import exceptions.OrderStatus;

public class Shop {

  Ticket t;

  public void buy(int amount, OrderStatus orderStatus) throws InterruptedException {
    if(orderStatus == OrderStatus.PROCESSING){
      System.out.println("PROCESSING..."+ amount+ " eur ");
      Thread.sleep(10000);
      System.out.println("COMPLETED!!!!");
    }else{
      System.out.println("ALREADY COMPLETED");
    }

  }

}
