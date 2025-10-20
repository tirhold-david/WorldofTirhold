import java.util.Locale;
import java.util.Scanner;

public class Game {

    Player player;

    public Game() {
        Scene entrance = new Scene("A vár bejáratánál állsz. Északra egy nagy faajtó található.");
        Scene hall = new Scene("A nagyteremben vagy. Keletre és nyugatra is van egy-egy ajtó");
        Scene armory = new Scene("A fegyvertárban vagy. Látsz egy fényes kardot az állványon");

        entrance.setExit(Direction.ESZAK, hall);
        hall.setExit(Direction.DEL, entrance);
        hall.setExit(Direction.NYUGAT, armory);
        armory.setExit(Direction.KELET, hall);

        player = new Player(entrance);
    }

    private void play(){
        Scanner scanner = new Scanner(System.in);
        display("Üdv a várkalandban");
        display(player.getScene().getDescription());

        // Ez a játék ciklus
        while (true){
            String input = scanner.nextLine().toLowerCase(Locale.ROOT).trim();
            String command = input;

            switch (command){
                case "kilep":
                    display("Köszi a játékot!");
                    scanner.close();
                    return;
            }
        }
    }

    private void display(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.play();
    }
}