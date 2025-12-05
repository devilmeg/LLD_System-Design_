
import java.util.*;

interface Pizza{
    String getDescription();
    double getCost();
}

//let's make base class
class PlainPizza implements Pizza{
    @Override
    public String getDescription(){
        return "PlainPizza";
    }

    @Override
    public double getCost(){
        return 150.00;
    }
}

class MargheritaPizza implements Pizza{
    @Override
    public String getDescription(){
        return "Margherita";
    }

    @Override
    public double getCost(){
        return 200.00;
    }
}

abstract class PizzaDecorator implements Pizza{
    protected Pizza instance;
    public PizzaDecorator(Pizza instance){
    this.instance=instance;
    }
}
class ExtraCheese extends PizzaDecorator{
    public ExtraCheese(Pizza instance){
        super(instance);
    }
    @Override
    public String getDescription(){
        return instance.getDescription()+ ", Extra Cheese  ";
    }

    @Override
    public double getCost(){
        return instance.getCost()+200.00;
    }

}
class Olives extends PizzaDecorator{
    public Olives(Pizza instance){
      super(instance);
    }
    @Override
    public String getDescription(){
        return instance.getDescription()+" , Olives  ";
    }

    @Override
    public double getCost(){
        return 140.00;
    }
}
class Stuffed extends PizzaDecorator{
    public Stuffed(Pizza instance){
        super(instance);
    }
    @Override
    public String getDescription(){
        return instance.getDescription()+" , Stuffed ";
    }

    @Override
    public double getCost(){
        return instance.getCost()+200.00;
    }
}

public class DecoPratice {
    public static void main(String[] args) {
        Pizza p=new PlainPizza();
        System.out.println(p.getDescription()+p.getCost());
        p=new ExtraCheese(p);
        System.out.println(p.getDescription()+p.getCost());
        
        p=new Stuffed(p);
        System.out.println(p.getDescription()+p.getCost());


        
    }
}
