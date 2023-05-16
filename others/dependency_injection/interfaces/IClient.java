package others.dependency_injection.interfaces;

public class IClient implements Client{

    private Service service;


    @Override
    public void setDependency(Service iService) {
        this.service = iService;
    }

    public void functionInvokeService (){
        System.out.println(this.service.theService());
    }
}
