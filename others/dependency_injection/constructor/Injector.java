package others.dependency_injection.constructor;

public class Injector {

    public static Client getClient() {
        return new Client(new Service());
    }
}
