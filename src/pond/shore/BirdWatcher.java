package pond.shore;

public class BirdWatcher {

    public void watchBird() {

        Bird bird = new Bird();

        //Calling protected member from the same package

        bird.floatInWater();
        System.out.println(bird.text);
    }
}
