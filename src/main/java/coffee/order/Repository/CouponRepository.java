package coffee.order.Repository;

import java.util.HashMap;

import coffee.order.Domain.Coupon;

public class CouponRepository {
  private final HashMap<String, Coupon> couponBook;

  public CouponRepository(HashMap<String, Coupon> couponBook) {
    this.couponBook = couponBook;
  }

  public int addUserCoupon(String phoneNumber, int orderCount){
    if(!couponBook.containsKey(phoneNumber)){
      couponBook.put(phoneNumber, new Coupon(orderCount));
    }
    Coupon userCoupon = couponBook.get(phoneNumber);
    userCoupon.addCoupon(orderCount);
    return userCoupon.getCount();
  }

  public void minusUserCoupon(String phoneNumber){
    couponBook.get(phoneNumber).minusCoupon();
  }

}
