package sech5hw2.simple;

import java.text.DecimalFormat;
import java.util.concurrent.atomic.AtomicInteger;

public class PieChart implements Display {

    Controller control;

    PieChart(Controller control){
        this.control = control;
    }

    @Override
    public void update() {
        DecimalFormat format = new DecimalFormat(".#");
        AtomicInteger tempValueTotal = new AtomicInteger();
        this.control.dataMap.forEach((key, value) -> {
            tempValueTotal.addAndGet(value);
        });
        this.control.dataMap.forEach((key, value) -> {
            System.out.println(key + " " + (format.format((float)value/(float)(tempValueTotal.intValue())*100)) + "%");
        });
    }
}
