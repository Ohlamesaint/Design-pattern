package part6.chapter13_visitor.refactor;

public class FamilyMartCoffeeHouse implements CoffeeHouse {

    @Override
    public void juniorBuyCoffee(Junior junior) {
        System.out.println("Junior buys coffee at FamilyMart");
    }

    @Override
    public void seniorBuyCoffee(Senior senior) {
        System.out.println("Senior buys coffee at FamilyMart");
    }
}
