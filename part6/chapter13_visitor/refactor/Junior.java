package part6.chapter13_visitor.refactor;

public class Junior implements Student{
    @Override
    public void buyCoffee(CoffeeHouse coffeeHouse) {
        coffeeHouse.juniorBuyCoffee(this);
    }
}
