
public class PlayInstrument {
    public static void main(String[] args) {

        Instrument guitar = new SuperCoolGuitar();

        // This is an intenationally infite loop
        while (true) {

            // Check if the user has pressed a key, and, if so, process it
            if (StdDraw.hasNextKeyTyped()) {
                char key = StdDraw.nextKeyTyped();

                // Pluck the corresponding string
                guitar.pluck(key);
            }

            // Compute the superposition of the samples
            double sample = guitar.superposition();

            // Send the result to standard audio
            StdAudio.play(sample);

            // Advance the simulation of each guitar string by one step
            guitar.tick();
        }
    }
}
