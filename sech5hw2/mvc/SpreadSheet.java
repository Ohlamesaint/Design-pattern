package sech5hw2.mvc;

public class SpreadSheet implements Display {

    @Override
    public void update(Model model) {
        model.getData().forEach((key, value) -> {
            System.out.println(key + " " + value);
        });
    }
}
