package others.dependency_injection.constructor;

public class Client {

    private final Service service;

    public Client(Service iService){
        this.service = iService;
    }

    public void functionInvokeService (){
        System.out.println(this.service.theService());
    }

}
