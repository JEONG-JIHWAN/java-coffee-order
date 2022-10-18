package coffee.order.Domain;

public class Price {
  private static final int ZERO = 0;
  private int price;

  public Price(int price) {
    validatePrice(price);
    this.price = price;
  }

  private void validatePrice(int price) {
    if(price<ZERO){
      throw new IllegalArgumentException("가격은 음수가 나올 수 없습니다.");
    }
  }

}
