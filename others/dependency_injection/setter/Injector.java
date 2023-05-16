package others.dependency_injection.setter;

public class Injector {

    public static Client getClient(){
        Client client = new Client();
        client.setService(new Service());
        return client;
    }
}
