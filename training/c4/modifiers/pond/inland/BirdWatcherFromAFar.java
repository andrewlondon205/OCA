package c4.modifiers.pond.inland;

import c4.modifiers.pond.shore.Bird; // different package than bird

public class BirdWatcherFromAFar {
    public void watchBird  () {
        Bird bird = new Bird();
        // bird.floatInWater(); // does not compile
        // System.out.println(bird.text); does not compile
    }
}
