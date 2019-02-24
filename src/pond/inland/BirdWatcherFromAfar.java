package pond.inland;
import pond.shore.Bird;

public class BirdWatcherFromAfar {

    public void watchBird() {
        Bird bird = new Bird();

        //Calling protected member from a different package - prohibited

//        bird.floatInWater(); --> does not compile
//        System.out.println(bird.text);  --> does not compile
    }
}
