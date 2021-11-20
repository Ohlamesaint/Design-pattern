package sech5hw2.mvc;

import java.util.LinkedHashMap;
import java.util.Map;

public class Model {

    // == Fields ==
    private Map<String, Integer> dataMap = new LinkedHashMap<>();

    // == Getters/Setters ==
    public void addData(String dataName, int dataAmount){
        this.dataMap.put(dataName, dataAmount);
    }

    public Map<String, Integer> getData(){
        return this.dataMap;
    }
}
