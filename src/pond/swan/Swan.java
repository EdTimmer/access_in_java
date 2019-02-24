package pond.swan;
import pond.shore.Bird;

public class Swan extends Bird {

    public void swim() {
        //Package access to superclass
        floatInWater();
        System.out.println(text);
    }

    public void helpOtherSwanSwim() {
        //Package access to superclass
        Swan other = new Swan();
        other.floatInWater();
        System.out.println(other.text);
    }

    public void helpOtherBirdSwim() {
        Bird other = new Bird();
//        other.floatInWater();             DOES NOT COMPILE
//        System.out.println(other.text);   DOES NOT COMPILE
    }
}
