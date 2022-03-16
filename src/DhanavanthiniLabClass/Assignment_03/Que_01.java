package DhanavanthiniLabClass.Assignment_03;
/*
Create  a  class  named  Billing  that  includes  three  overloaded  computeBill()  methods  for  a store.
When computeBill () receives a single parameter, it represents the price of one product ordered.
Add 8% tax, and return the total due.When computeBill ()  receives  two  parameters,
they  represent  the  price  of  a  product  and  the  quantity  ordered.
Multiply  the  two  values,  add  8%  tax,  and  return  the total due.
When  computeBill()  receives  three  parameters,  they  represent  the  price  of  a  product,
the  quantity  ordered,  and  a  coupon  value.  Multiply the  quantity  and  price,
reduce the result by the coupon value, and then add 8% tax and return the total due.
Write a main() method that tests all three overloaded methods. Save the application as Billing.java.
 */

class BillingQue1{
    public float computeBill(float price){
        return price+(price*0.08f);
    }

    public float computeBill(float price,int quanOrd){
        return (price*quanOrd)+(price*quanOrd*0.08f);
    }

    public float computeBill(float price, int quanOrd, float coupon){
        return (price*quanOrd-coupon)+(price*quanOrd-coupon)*0.08f;
    }
}
public class Que_01 {
    public static void main(String[] args) {
        BillingQue1 billingQue1=new BillingQue1();
        System.out.println("computeBill with One parameter ---> ");
        System.out.println(billingQue1.computeBill(7900));
        System.out.println();
        System.out.println("computeBill with two parameters ---> ");
        System.out.println(billingQue1.computeBill(6780,9));
        System.out.println();
        System.out.println("computeBill with three parameters ---> ");
        System.out.println(billingQue1.computeBill(8900,11,20000));
    }
}
