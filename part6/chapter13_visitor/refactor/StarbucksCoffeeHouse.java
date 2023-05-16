package part6.chapter13_visitor.refactor;

public class StarbucksCoffeeHouse implements CoffeeHouse {

    @Override
    public void juniorBuyCoffee(Junior junior) {
        System.out.println("Junior buys coffee at Starbucks");
    }

    @Override
    public void seniorBuyCoffee(Senior senior) {
        System.out.println("Senior buys coffee at Starbucks");
    }
}
