package pond;

import pond.goose.Gosling;
import pond.shore.BirdWatcher;

public class Main {
    static Gosling myGosling = new Gosling();
    static BirdWatcher myBirdWatcher = new BirdWatcher();

    public static void main(String[] args) {
        myGosling.swim();
        myBirdWatcher.watchBird();
    }
}
