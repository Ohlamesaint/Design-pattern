package sech5hw2.simple;

public class BarChart implements Display {

    Data mainControl;

    BarChart(Data mainControl){
        this.mainControl = mainControl;
    }

    @Override
    public void update() {
        this.mainControl.dataMap.forEach((key, value) -> {
            for(int i=0; i<value; i++){
                System.out.print("=");
            }
            System.out.println(" "+key);
        });
    }
}
