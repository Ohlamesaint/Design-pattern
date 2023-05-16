package others.dependency_injection.interfaces;

public class Injector {

    public static IClient getClient(){
        Service iService = new Service();
        IClient iClient = new IClient();
        iClient.setDependency(iService);
        return iClient;
    }
}
