package coffee.order.Domain;

public class OrderItem {
  private final Menu menu;
  private final int count;

  private final int couponUsed;

  public OrderItem(
      Menu menu,
      int count,
      int couponUsed //상태로 해결가능..!
  ) {
    this.menu = menu;
    this.count = count;
    this.couponUsed = couponUsed;
  }

  public Menu getMenu() {
    return menu;
  }

  public int getCount() {
    return count;
  }

  public int getPrice(){
    if (couponUsed==1){
      return menu.getPrice()*(count-1);
    }
    return menu.getPrice();
  }

  public String toString(){
    return menu.getName() + " " + this.count + " " + menu.getPrice();
  }
}
