import java.util.ArrayList;
import java.util.HashMap;

public class Scene {
    private String description;
    private ArrayList<Item> items;
    private HashMap<Direction, Scene> exits;

    public Scene(String description) {
        this.description = description;
        this.items = new ArrayList<>();
        this.exits = new HashMap<>();
    }

    public void setExit(Direction direction, Scene neighbor){
        // itt adunk hozzá kijáratot a helyszínhez, irány és szomszéd helyszín formájában.
        // A HashMap put metódusa az hasonló az arrayList add() metódusához, új elemet adunk hozzá.
        // csak ez key (direction) és value(szomszéd) párokat vár mindig. A direction egy ENUM.
        exits.put(direction, neighbor);
    }

    public void addItem(Item item){
        items.add(item);
    }

    // az adott irányban milyen szomszédos helyszín van.
    public Scene getExit(Direction direction){
        return exits.get(direction);
    }

    public String getDescription() {
        return description;
    }
}