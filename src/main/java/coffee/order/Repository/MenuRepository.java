package coffee.order.Repository;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import coffee.order.Domain.Menu;

public class MenuRepository {
  private static final Set<Menu> menus = new HashSet<>();

  public MenuRepository() {
  }

  public void save(Menu menu){
    menus.add(menu);
  }

  public static Menu findMenu(String id){
    return menus.stream()
                .filter(menu -> menu.getId().equals(id))
                .findFirst()
                .orElseThrow(()-> new IllegalStateException("해당 메뉴를 찾을 수 없습니다."));
  }

  public List<Menu> showMenu(){
    return sortMenu().stream().collect(Collectors.toList());
  }

  private List<Menu> sortMenu() {
    List<Menu> menuList = new ArrayList<>(menus);
    menuList.sort(Comparator.comparing((menu -> menu.getId())));
    return menuList.stream().collect(Collectors.toList());
  }

}
