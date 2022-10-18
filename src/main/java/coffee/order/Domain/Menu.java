package coffee.order.Domain;

import java.util.Objects;

public class Menu {
  private String id;
  private String name;
  private int price;
  private Category category;

  public Menu(String id, String name, int price, Category category) {
    this.id = id;
    this.name = name;
    this.price = price;
    this.category = category;
  }

  public String getId() {
    return id;
  }

  public String getName() {return name;}

  public int getPrice() {
    return price;
  }
  public Category getCategory() {
    return category;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Menu menu = (Menu)o;
    return (this.id==menu.getId());
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }
}
