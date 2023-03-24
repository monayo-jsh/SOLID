package example2;

public class Database {

    private Interactors interactors;
    private Entities entities;

    public Database(Interactors interactors, Entities entities) {
        this.interactors = interactors;
        this.entities = entities;
    }
}
