package sech5hw2;

import jdk.jfr.Event;

public class BarChart extends View{

    BarChart(Controller controller) {
        super(controller);
    }

    @Override
    public void update(Model model) {
        model.getData1();
        model.getData2();
        model.getData3();
        // BarChart View
    }

    @Override
    public void onChange(Event e) {
        // Something change
    }
}
