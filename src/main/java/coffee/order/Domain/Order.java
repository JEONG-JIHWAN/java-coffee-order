package coffee.order.Domain;

import java.util.List;
import java.util.stream.Collectors;

import coffee.order.Repository.MenuRepository;

public class Order {
  private final List<OrderItem> orderItems;

  public Order(List<OrderItem> orderItems) {
    this.orderItems = orderItems;
  }

  public void addOrderItem(String id, int count){
    Menu menu = MenuRepository.findMenu(id);
    orderItems.add(new OrderItem(menu, count, OrderItemStatus.STANDARD));
  }
  public OrderItem findOrderItem(String id, String name){
    Menu menu = MenuRepository.findMenu(id);
    return orderItems.stream().filter(orderItem -> orderItem.getMenu().equals(menu))
                     .findFirst()
                     .orElseThrow(()->new IllegalStateException("해당 주문 내역이 없습니다"));
  }

  public void useCoupon(String id, String name){
    OrderItem orderItem = findOrderItem(id, name);
    orderItem.freeOrderItem();
  }

  public List<OrderItem> findAllOrderItem(){
    return orderItems;
  }

  public int findOrderCount(){
    return orderItems.stream().map(orderItem -> orderItem.getCount())
        .reduce(0, Integer::sum);
  }

  public int getTotalPrice(){
    return orderItems.stream().map(orderItem -> orderItem.getPrice())
                     .reduce(0, Integer::sum);
  }

}
