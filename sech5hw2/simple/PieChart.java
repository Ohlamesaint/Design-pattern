package sech5hw2.simple;

import java.text.DecimalFormat;
import java.util.concurrent.atomic.AtomicInteger;

public class PieChart implements Display {

    @Override
    public void update(Model model) {
        DecimalFormat format = new DecimalFormat(".#");
        AtomicInteger tempValueTotal = new AtomicInteger();
        model.getData().forEach((key, value) -> {
            tempValueTotal.addAndGet(value);
        });
        model.getData().forEach((key, value) -> {
            System.out.println(key + " " + (format.format((float)value/(float)(tempValueTotal.intValue())*100)) + "%");
        });
    }
}
