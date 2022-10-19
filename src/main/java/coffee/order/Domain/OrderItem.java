package coffee.order.Domain;

public class OrderItem {
  private final Menu menu;
  private final int count;

  private OrderItemStatus couponUsed;

  public OrderItem(
      Menu menu,
      int count,
      OrderItemStatus couponUsed
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

  public void freeOrderItem(){
    this.couponUsed = OrderItemStatus.COUPON;
  }

  public int getPrice(){
    if (couponUsed==OrderItemStatus.COUPON){
      return menu.getPrice()*(count-1);
    }
    return menu.getPrice();
  }

  public String toString(){
    return menu.getName() + " " + this.count + " " + menu.getPrice();
  }
}
