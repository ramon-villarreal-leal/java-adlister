package models;

public interface McBurgers {
    //this interace lists the methods that any class who implements it,
    //must define it (or have these methods);

    McBurger findById(long id);

    // if we create a burger return id of the newly burger we created
    //so we can do stuff with it

    long createBurger(McBurger burger);

}
