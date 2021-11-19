package sech5hw2.simple;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileInputStream(args[0]));
        Model model = new Model();
        Controller control = new Controller(model);

        while(scanner.hasNextLine()){
            control.dispatch(scanner.nextLine());
        }
    }
}
