package coffee.order.Domain;

public class Coupon {
  private static final int TEN = 10;
  private int count;

  public Coupon(int count) {
    this.count = count;
  }

  public int getCount() {
    return count;
  }

  public void addCoupon(int orderCount){
    this.count += orderCount;
  }

  public boolean checkUseCoupon(){
    return this.count>=10;
  }

  public void minusCoupon(){
    if(checkUseCoupon()){
      this.count -= TEN;
    }
  }
}
