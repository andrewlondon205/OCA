package pond.inland;

import pond.shore.Bird; // different package than Bird

public class BirdWatcherFromFar {

    public void watchBird() {
        Bird bird = new Bird();
       // bird.floatInWater(); // DOES NOT COMPILE
        //System.out.println(bird.text); // DOES NOT COMPILE
    }
}
