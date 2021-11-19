package sech5hw2.simple;

public class SpreadSheet implements Display {

    Controller control;

    SpreadSheet(Controller control){
        this.control = control;
    }

    @Override
    public void update() {
        this.control.dataMap.forEach((key, value) -> {
            System.out.println(key + " " + value);
        });
    }
}