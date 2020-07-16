package models;

public interface Ingredients {
    //this interace lists the methods that any class who implements it,
    //must define it (or have these methods);

    Ingredient findById(long id);

    // if we create an ingredient return id of the newly ingredient we created
    //so we can do stuff with it

    long createIngredient(Ingredient ingredient);
}
