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
  public OrderItem findOrderItem(String id, String name){
    Menu menu = MenuRepository.findMenu(id);
    return orderItems.stream().filter(orderItem -> orderItem.getMenu().equals(menu))
                     .findFirst()
                     .orElseThrow(()->new IllegalStateException("해당 주문 내역이 없습니다"));
  }
  
}
