package sech5hw2.simple;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileInputStream(args[0]));
        String input;
        String[] inputSplit;


        Data mainControl = new Data();
        while(scanner.hasNextLine()){
            input = scanner.nextLine();
            inputSplit = input.split(" ");

            if(inputSplit[0].equals("data")){
                mainControl.dataMap.put(inputSplit[1], Integer.parseInt(inputSplit[2]));
            }
            else if(inputSplit[0].equals("addChart")){
                Display newDisplay;
                if(inputSplit[1].equals("Spreadsheet")){
                    newDisplay = new SpreadSheet(mainControl);
                    mainControl.displays.add(newDisplay);
                } else if(inputSplit[1].equals(("BarChart"))){
                    newDisplay = new BarChart(mainControl);
                    mainControl.displays.add(newDisplay);
                } else if(inputSplit[1].equals("PieChart")){
                    newDisplay = new PieChart(mainControl);
                    mainControl.displays.add(newDisplay);
                }
            }
            else if(inputSplit[0].equals("change")){
                mainControl.dataMap.put(inputSplit[2], Integer.parseInt(inputSplit[3]));
                System.out.println(input + ".");
                mainControl.displays.forEach((display) -> {
                    display.update();
                });
            }
        }
    }
}
