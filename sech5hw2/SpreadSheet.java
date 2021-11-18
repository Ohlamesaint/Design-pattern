package sech5hw2;

import jdk.jfr.Event;

public class SpreadSheet extends View{

    SpreadSheet(Controller controller) {
        super(controller);
    }

    @Override
    public void update(Model model) {
        model.getData1();
        model.getData2();
        model.getData3();
        // SpreadSheet View
    }

    @Override
    public void onChange(Event e) {
        // pass event
    }
}
