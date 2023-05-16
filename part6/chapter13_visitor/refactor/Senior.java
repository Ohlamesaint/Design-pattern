package part6.chapter13_visitor.refactor;

public class Senior implements Student{

    @Override
    public void buyCoffee(CoffeeHouse coffeeHouse) {
        coffeeHouse.seniorBuyCoffee(this);
    }
}
