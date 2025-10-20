import java.util.ArrayList;

public class Player {
    private Scene scene;
    private ArrayList<Item> inventory;

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    public Player(Scene startingScene) {
        this.scene = startingScene;
        inventory = new ArrayList<>();
    }

    public void takeItem(Item item){
        inventory.add(item);
    }

    public String getInventoryString(){
        if (inventory.isEmpty()){
            return "A leltárad üres";
        }
        // A StringBuilder objektumot olyan szituációkban használjuk, mint pl egy loop ahol sok
        // Stringet fűzünk össze (concate-nálunk).
        // Ez azért kell, mert a Java-ban a String immutable, és egyébként mindig újjat, ami költséges művelet, lassú lenne.
        StringBuilder returnString = new StringBuilder();
        for (Item item: inventory){
            returnString.append(" ").append(item.getName());
        }
        return returnString.toString();
    }
}