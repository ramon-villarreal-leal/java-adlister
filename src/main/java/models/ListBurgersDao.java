package models;

import java.util.ArrayList;
import java.util.List;

public class ListBurgersDao implements McBurgers {

    private List<McBurger> burgers = new ArrayList<>();

    @Override
    public McBurger findById(long id) {

        //get the McBurger at the index 'id'
        //id start at 1 but array list are 0 indexed
        //DB Representation (actual Id's) ===> ['1' => bigMac, '2' quarterPounder ...]
        //The arrayList is 0 indexed ----> ['0' => bigMac, '1' => quarterPounder,  =>
        // need to subtract - 1 to get 0 indexed
        return burgers.get((int) id -1);
    }

    @Override
    public long createBurger(McBurger burger) {
        //we need to determine what the ID should be on new burger
        //
        burger.setId(burgers.size() + 1);
        //add burger to the list in this DAO
        burgers.add(burger);

        //we need to return ID of newly created burger
        return burger.getId();

    }
}
