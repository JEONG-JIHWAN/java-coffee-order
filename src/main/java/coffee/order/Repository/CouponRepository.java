package coffee.order.Repository;

import java.util.HashMap;

import coffee.order.Domain.Coupon;

public class CouponRepository {
  private final HashMap<String, Coupon> couponBook;

  public CouponRepository(HashMap<String, Coupon> couponBook) {
    this.couponBook = couponBook;
  }

  public Coupon findUserCoupon(String phoneNumber){
    if(!couponBook.containsKey(phoneNumber)){
      couponBook.put(phoneNumber, new Coupon(0));
    }
    return couponBook.get(phoneNumber);
  }

}
