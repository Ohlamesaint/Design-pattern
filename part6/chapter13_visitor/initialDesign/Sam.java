package part6.chapter13_visitor.initialDesign;

public class Sam implements Student{
    @Override
    public void buyFamilyCoffee() {
        System.out.println("Sam buys coffee at FamilyMart");
    }

    @Override
    public void buyStarbucksCoffee() {
        System.out.println("Sam buys coffee at Starbucks");
    }
}
