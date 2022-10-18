package coffee.order.Domain;

import java.util.Objects;

public class Category {
  private String id;
  private String name;

  public Category(
      String id,
      String name
  ) {
    this.id = id;
    this.name = name;
  }

  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Category c = (Category)o;
    return (this.getId() == c.getId());
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }
}
