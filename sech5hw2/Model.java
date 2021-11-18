package sech5hw2;

public class Model {

    // == Field ==
    private String data1;
    private int data2;
    private float data3;

    // == Constructor ==
    Model(String data1, int data2, float data3){
        this.data1 = data1;
        this.data2 = data2;
        this.data3 = data3;
    }

    // == Getter/Setter ==

    public String getData1() {
        return data1;
    }

    public void setData1(String data1) {
        this.data1 = data1;
    }

    public int getData2() {
        return data2;
    }

    public void setData2(int data2) {
        this.data2 = data2;
    }

    public float getData3() {
        return data3;
    }

    public void setData3(float data3) {
        this.data3 = data3;
    }
}
