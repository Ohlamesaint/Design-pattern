package sech5hw2.mvc;

import java.util.ArrayList;
import java.util.List;

public class Controller {


    // == Fields ==
    private List<View> views = new ArrayList<>();
    private Model model;


    // == Constructor ==
    Controller(Model model){
        this.model = model;
    }

    // == Public Method ==
    public void notifyView(){
        for (View ele: views){
            ele.update(model);
        }
    }

    public void detach(View targetView){
        this.views.remove(targetView);
    }

    public void attach(View newView){
        this.views.add(newView);
    }

    public void logic(){
        // do business logic
        // ...
        // ...
        // ...
        // ...
        // ...
        // ...
        notifyView();
    }

    // == Private Helper ==
    private void setData1(String newData){
        model.setData1(newData);
    }
    private void setData2(int newData){
        model.setData2(newData);
    }private void setData3(float newData){
        model.setData3(newData);
    }
}
