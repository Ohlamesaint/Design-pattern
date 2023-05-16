package others.dependency_injection.interfaces;


public class Main {

    public static void main(String[] args) {
        IClient client = Injector.getClient();
        client.functionInvokeService();
    }
}
