package models;

import java.io.Serializable;
import java.util.List;

public class McBurger implements Serializable {
//==============CLASS PROPERTIES=========////
    //id
    private long id;
    //burger name
    private String title;
    //price in cents
    private int priceInCents;
    //description of burger
    private String description;
    //ingredients (list)
    private List<Ingredient> ingredients;

    // =========CONSTRUCTOR=========****/
    // zero arfument constructor, so Java can reserve space in memory
    // for this when we finally create and define it
    public McBurger(){ }

    //McNurger thisBurger = new McBurger();

    // =========GETTERS AND SETTERS=========****/


    public long getId() {
        return id;
    }

    public void setId(long id) { this.id = id; }

    public String getTitle() { return title; }

    public void setTitle(String title) { this.title = title; }

    public int getPriceInCents() { return priceInCents; }

    public void setPriceInCents(int priceInCents) { this.priceInCents = priceInCents; }

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }

    public List<Ingredient> getIngredients() { return ingredients; }

    public void setIngredients(List<Ingredient> ingredients) { this.ingredients = ingredients; }
}
