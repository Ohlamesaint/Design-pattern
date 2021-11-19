package sech5hw2.simple;

import java.text.DecimalFormat;
import java.util.concurrent.atomic.AtomicInteger;

public class PieChart implements Display {

    Data mainControl;

    PieChart(Data mainControl){
        this.mainControl = mainControl;
    }

    @Override
    public void update() {
        DecimalFormat format = new DecimalFormat(".#");
        AtomicInteger tempValueTotal = new AtomicInteger();
        this.mainControl.dataMap.forEach((key, value) -> {
            tempValueTotal.addAndGet(value);
        });
        this.mainControl.dataMap.forEach((key, value) -> {
            System.out.println(key + " " + (format.format((float)value/(float)(tempValueTotal.intValue())*100)) + "%");
        });
    }
}
