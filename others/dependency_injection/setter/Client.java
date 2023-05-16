package others.dependency_injection.setter;

public class Client {

    private Service service;

    public Client() {
    }

    public void setService(Service iService) {
        this.service = iService;
    }

    public void functionInvokeService (){
        System.out.println(this.service.theService());
    }
}
