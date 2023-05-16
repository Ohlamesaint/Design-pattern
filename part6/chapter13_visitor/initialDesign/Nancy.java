package part6.chapter13_visitor.initialDesign;

public class Nancy implements Student{

    @Override
    public void buyFamilyCoffee() {
        System.out.println("Nancy buys coffee at FamilyMart");
    }

    @Override
    public void buyStarbucksCoffee() {
        System.out.println("Nancy buys coffee at Starbucks");
    }
}
