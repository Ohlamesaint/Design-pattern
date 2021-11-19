package sech5hw2.mvc;

import jdk.jfr.Event;

public abstract class View {

    protected Controller controller;

    View(Controller controller){
        this.controller = controller;
    }

    abstract void update(Model model);
    abstract void onChange(Event e);
}
