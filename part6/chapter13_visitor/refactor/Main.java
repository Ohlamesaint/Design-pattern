package part6.chapter13_visitor.refactor;

public class Main {

    private static Student student;
    private static CoffeeHouse coffeeHouse;

    public static void main(String[] args) {
        student = new Junior();
        coffeeHouse = new FamilyMartCoffeeHouse();
        student.buyCoffee(coffeeHouse);
    }

}
