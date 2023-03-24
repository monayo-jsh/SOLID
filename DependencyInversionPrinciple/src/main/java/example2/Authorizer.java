package example2;

public class Authorizer {

    private final Interactors interactors;
    private final Permissions permissions;

    public Authorizer(Interactors interactors, Permissions permissions) {
        this.interactors = interactors;
        this.permissions = permissions;
    }
}
