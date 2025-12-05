import java.util.*;

//Burger Meal
class BurgerMeal {
    // Require
    private final String bunType;
    private final String patty;

    // optional
    private final boolean hasCheese;
    private final List<String> toppings;
    private final String side;
    private final String drink;

    // private Constructor
    private BurgerMeal(BurgerBuilder builder) {
        this.bunType = builder.bunType;
        this.patty = builder.patty;
        this.hasCheese = builder.hasCheese;
        this.toppings = builder.toppings;
        this.side = builder.side;
        this.drink = builder.drink;

    }

    public static class BurgerBuilder {
        // required
        private final String bunType;
        private final String patty;
        // optional
        private boolean hasCheese;
        private List<String> toppings;
        private String side;
        private String drink;

        public BurgerBuilder(String bunType, String patty) {
            this.bunType = bunType;
            this.patty = patty;

        }

        public BurgerBuilder withCheese(boolean hasCheese) {
            this.hasCheese = hasCheese;
            return this;
        }

        public BurgerBuilder withtoppings(List<String> toppings) {
            this.toppings = toppings;
            return this;
        }

        public BurgerBuilder withSides(String side) {
            this.side = side;
            return this;
        }

        public BurgerBuilder withDrink(String drink) {
            this.drink = drink;
            return this;
        }

        public BurgerMeal build() {
            return new BurgerMeal(this);
        }
    }

    public void show() {
        System.out.println("BurgerMeal { " +
                "bunType='" + bunType + '\'' +
                ", patty='" + patty + '\'' +
                ", hasCheese=" + hasCheese +
                ", toppings=" + toppings +
                ", side='" + side + '\'' +
                ", drink='" + drink + '\'' +
                " }");
    }

}

public class Builder {
    public static void main(String[] args) {
        // Creating burger with only required fields
        BurgerMeal plainBurger = new BurgerMeal.BurgerBuilder("wheat", "veg")
                .build();

                plainBurger.show();
                BurgerMeal plainBurger1 = new BurgerMeal.BurgerBuilder("wheat", "veg").withCheese(true).withDrink("Coke")
                .build();
                plainBurger1.show();


    }
}
