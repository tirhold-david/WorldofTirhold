import java.util.ArrayList;
import java.util.HashMap;

public class Scene {

    private String description;
    private ArrayList<Item> items;
    private HashMap<Direction,Scene> exits;

    public Scene(String description) {
        this.description = description;
        this.items = new ArrayList<>();
        this.exits = new HashMap<>();
    }

    public  void setExit(Direction direction, Scene neighbor) {
        //itt adunk hozzá kijártot a helysznhez, irán és zomszédhelyszín formájában
        //A HashMap "put" metódusa hasonló az Arraylist "add" metódusához,
        // új elemet adunk hozzá, csak ez key (direction) és value (szomszéd) párokat vár mindig.
        exits.put(direction, neighbor);
    }

    public void addItem(Item item){
        items.add(item);
    }

    public Scene getExit(Direction direction) {
        return exits.get(direction);
    }
}
