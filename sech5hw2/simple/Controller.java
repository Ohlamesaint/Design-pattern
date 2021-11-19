package sech5hw2.simple;

import java.util.*;

public class Controller {

    // == fields ==
    Model model;
    private List<Display> displays = new ArrayList<>();

    // == constructors ==
    Controller(Model model) {
        this.model = model;
    }

    // == public method ==
    public void dispatch(String input){
        String[] inputSplit = input.split(" ");
        if(inputSplit[0].equals("data")){
            model.addData(inputSplit[1], Integer.parseInt(inputSplit[2]));
        }
        else if(inputSplit[0].equals("addChart")){
            this.attach(inputSplit[1]);
        }
        else if(inputSplit[0].equals("change")){
            this.notifyDisplay(input);
        }
    }

    // == private helper ==

    private void attach(String input){
        if(input.equals("Spreadsheet")){
            displays.add(new SpreadSheet(this));
        } else if(input.equals(("BarChart"))){
            displays.add(new BarChart(this));
        } else if(input.equals("PieChart")){
            displays.add(new PieChart(this));
        }
    }

    private void notifyDisplay(String input){
        String[] inputSplit = input.split(" ");
        model.addData(inputSplit[2], Integer.parseInt(inputSplit[3]));
        System.out.println(input + ".");
        this.displays.forEach((display) -> {
            display.update(model);
        });
    }
}
