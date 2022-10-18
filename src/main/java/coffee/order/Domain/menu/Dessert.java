package coffee.order.Domain.menu;

import coffee.order.Domain.Category;
import coffee.order.Domain.Menu;

public class Dessert extends Menu {
  private Category category;
  public Dessert(String id, String name, int price, Category category) {
    super(id, name, price, category);
  }
}
