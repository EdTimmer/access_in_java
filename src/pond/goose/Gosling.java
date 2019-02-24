package pond.goose;
import pond.shore.Bird;

public class Gosling extends Bird {

    public void swim() {

        //Calling protected member from a subclass / from a different package - can do because it's a subclass

        floatInWater();
        System.out.println(text);
    }
}
