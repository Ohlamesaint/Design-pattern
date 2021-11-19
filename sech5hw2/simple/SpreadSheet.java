package sech5hw2.simple;

public class SpreadSheet implements Display {

    Data mainControl;

    SpreadSheet(Data mainControl){
        this.mainControl = mainControl;
    }

    @Override
    public void update() {
        this.mainControl.dataMap.forEach((key, value) -> {
            System.out.println(key + " " + value);
        });
    }
}
