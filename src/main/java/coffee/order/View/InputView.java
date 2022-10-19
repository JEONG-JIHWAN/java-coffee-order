package coffee.order.View;

import java.util.Scanner;

public class InputView {
  private final Scanner sc;
  public InputView(Scanner sc) {
    this.sc = sc;
  }

  public String selectMenu(){
    String menuInput = sc.next();
    return menuInput;
  }

  public String addPhoneNumber(){
    String phoneNumber = sc.next();
    return phoneNumber;
  }

  public String selectOrderMenu(){
    String orderMenuId = sc.next();
    return orderMenuId;
  }

  public String selectNumber(){
    String number = sc.next();
    return number;
  }
}
