package coffee.order.Repository;

import java.util.HashMap;
import java.util.Set;

import coffee.order.Domain.Coupon;

public class CouponRepository {
  private final HashMap<String, Coupon> couponBook;

  public CouponRepository(HashMap<String, Coupon> couponBook) {
    this.couponBook = couponBook;
  }

  public Coupon findUserCoupon(String phoneNumber){
    if(!couponBook.containsKey(phoneNumber)){
      throw new IllegalArgumentException("해당 쿠폰이 없습니다");
    }
    return couponBook.get(phoneNumber);
  }
}
