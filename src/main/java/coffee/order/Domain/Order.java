package coffee.order.Domain;

import java.util.List;

import coffee.order.Repository.MenuRepository;

public class Order {
  private final List<OrderItem> orderItems;

  public Order(List<OrderItem> orderItems) {
    this.orderItems = orderItems;
  }

  public void addOrderItem(String id, int count){
    Menu menu = MenuRepository.findMenu(id);
    orderItems.add(new OrderItem(menu, count, 0));
  }
  
}
