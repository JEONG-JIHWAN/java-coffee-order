package coffee.order.Repository;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import coffee.order.Domain.Menu;

public class MenuRepository {
  private final Set<Menu> menus = new HashSet<>();

  public void save(Menu menu){
    menus.add(menu);
  }

}
