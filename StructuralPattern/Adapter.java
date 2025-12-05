import java.util.*;

//target Interface:
//standard interface
interface paymentGateway{
    void pay(String orderId,double amount);
}

class PayUGateway implements paymentGateway{
    @Override
    public void pay(String orderId,double amount){
        System.out.println("Paid Rs "+amount+" , Using PayU for the order "+orderId);
    }
}

class RazorApi{
    public void makePay(String orderId,double amount){
         System.out.println("Paid Rs "+amount+" , Using Razor APi  for the order "+orderId);
    }
}

class FastAdapter implements paymentGateway{
    private RazorApi r;

    public FastAdapter(){
        this.r=new RazorApi();
    }
    @Override
    public void pay(String orderId,double amount){
        r.makePay(orderId,amount);
    }
}
class CheckoutService{
    private paymentGateway instance;

    public CheckoutService(paymentGateway instance){
        this.instance=instance;
    }

    public void checkOut(String orderId,double amount){
        instance.pay(orderId,amount);
    }
}


public class Adapter {
   public static void main(String[] args) {
     CheckoutService check=new CheckoutService(new FastAdapter());
    check.checkOut("123",150);
   }
    
}
