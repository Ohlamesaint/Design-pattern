package others.dependency_injection.constructor;

public class Main {

    public static void main(String[] args) {
        Client client = Injector.getClient();
        client.functionInvokeService();
    }
}
