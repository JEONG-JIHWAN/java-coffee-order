package coffee.order.Domain.menu;

import coffee.order.Domain.Category;
import coffee.order.Domain.Menu;

public class Coffee extends Menu {
  private Category category;

  public Coffee(String id, String name, int price, Category category) {
    super(id, name, price, category);
  }
}
