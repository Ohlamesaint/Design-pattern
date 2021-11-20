package sech5hw2.mvc;

public class BarChart implements Display {

    @Override
    public void update(Model model) {
        model.getData().forEach((key, value) -> {
            for(int i=0; i<value; i++){
                System.out.print("=");
            }
            System.out.println(" "+key);
        });
    }
}
