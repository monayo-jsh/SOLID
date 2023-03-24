package example2;

public class Main {

    private final Database database;
    private final Presenters presenters;
    private final View view;
    private final Controllers controllers;
    private final Interactors interactors;
    private final Authorizer authorizer;


    public Main(Database database, Presenters presenters, View view, Controllers controllers,
                Interactors interactors, Authorizer authorizer) {
        this.database = database;
        this.presenters = presenters;
        this.view = view;
        this.controllers = controllers;
        this.interactors = interactors;
        this.authorizer = authorizer;
    }
}
