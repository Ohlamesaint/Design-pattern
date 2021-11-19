package part2.chapter3_template_method;

public class StringDisplay implements AbstractDisplay{
    private String str;
    private int width;

    public StringDisplay(String string){
        this.str = string;
        this.width = this.str.getBytes().length;
    }
    @Override
    public void open() {
        printLine();
    }

    @Override
    public void print() {
        System.out.println("|" + str + "|");
    }

    @Override
    public void close() {
        printLine();
    }

    private void printLine(){
        System.out.println("+");
        for(int i=0; i<width; i++){
            System.out.println("-");
        }
        System.out.println("+");
    }
}
