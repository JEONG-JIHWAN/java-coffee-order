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

  public Menu findMenu(String id, String name){
    return menus.stream()
                .filter(menu -> menu.getId().equals(id)&&menu.getName().equals(name))
                .findFirst()
                .orElseThrow(()-> new IllegalStateException("해당 메뉴를 찾을 수 없습니다."));
  }
}
