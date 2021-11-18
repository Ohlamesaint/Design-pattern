package template_method;

public interface AbstractDisplay {

    void open();
    void print();
    void close();

    // default keyword could use to define the abstract method in interface
    default void display(){
        open();
        for(int i=0; i<5; i++){
            print();
        }
        close();
    }
}
