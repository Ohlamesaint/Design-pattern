package sech5hw2.simple;

public class BarChart implements Display {

    Controller control;

    BarChart(Controller control){
        this.control = control;
    }

    @Override
    public void update() {
        this.control.dataMap.forEach((key, value) -> {
            for(int i=0; i<value; i++){
                System.out.print("=");
            }
            System.out.println(" "+key);
        });
    }
}
