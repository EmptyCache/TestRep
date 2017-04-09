public class Player {
    private String name;

    Player() {
        name = "default";
    }

    public Player(String name) {
        this.name = name;
    }

    public void play() {
        System.out.println(name + " is playing...");
    }
}
