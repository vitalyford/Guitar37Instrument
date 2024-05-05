/******************************************************************************
 * Author name: 
 * 
 * Description: This project plays guitar strings when the user presses 
 * certain keys on the keyboard. Karplus-Strong algorithm is used to 
 * synthesize the sound of a plucked guitar string. If you are curious,
 * read the detailed explanation at 
 * http://sites.music.columbia.edu/cmc/MusicAndComputers/chapter4/04_09.php
 * 
 * There are a total of 37 guitar strings in this program that we are going to simulate.
 * 
 * Your goal is to create a Java class in a new file (I created it for you and 
 * called SuperCoolGuitar.java) that implements the Instrument.java interface. 
 * In the constructor of your newly created class, you will first initialize
 * Concert A frequency as 440.0 (type: double). Based on that, you will create 37 strings
 * of the "Guitar 37" musical instrument, every frequency of which will be defined as:
 * 
 * frequency = CONCERT_A * Math.pow(2.0, (i - 24) / 12.0)
 * 
 * where i is within [0, 37) range. For every one of the 37 strings, you will
 * allocate a "buffer" (LinkedList<Double> or ArrayList<Double>)
 * the size of which is defined as:
 * 
 * size = 44100 / frequency 
 * 
 * Note that the size is an integer value.
 * 
 * In other words, every guitar string will be represented as an individual
 * list and it will have a specific size depending on the sound frequency 
 * that it simulates.
 * 
 * For example, the first 6 strings from your list of guitar strings will have the following sizes:
 * 400, 378, 357, 337, 318, 300 -> plug the i from [0, 6) into the frequency formula and then
 * calculate the size from the equations above.
 * 
 * These numbers are calculated automatically based on the formula from Lines 18 and 24 (see above).
 * 
 * The constructor will initialize all guitar strings lists (we call them "buffers") 
 * with zeros. In other words, based on the example from Lines 32-34,
 * the first guitar string will have 400 zeros in its list,
 * the second guitar string - 378 zeros, the third - 357, and so on.
 * 
 * After you completed the constructor of your SuperCoolGuitar.java,
 * take a look at Instrument.java interface to learn about the specifics
 * on how to implement the methods inside the SuperCoolGuitar.java
 * 
 * You do NOT have to implement LinkedList/ArrayList, just use the one that exists in Java.
 * 
 * To run the whole program, you will need to run PlayInstrument.java (NOT SuperCoolGuitar.java).
 *
 ******************************************************************************/

import java.util.*;

public class SuperCoolGuitar implements Instrument {
    /* LinkedList is similar to ArrayList in terms of available operations
     * like adding and removing items from the list.
     * This guitarStrings variable is defined as a 2-dimentional list,
     * and each of the internal lists represents one guitar string.
     * Therefore, the total size of the guitarStrings will be 37.
     * 
     * Each list of type LinkedList<Double> will have varied size,
     * depending on the size calculated from Lines 18 and 24.
     */
    private LinkedList<LinkedList<Double>> guitarStrings;

    // This is the constructor of your 37 guitar strings
    public SuperCoolGuitar() {
        guitarStrings = new LinkedList<>();
        // Add the guitar strings here (new LinkedList<Double>) to the guitarStrings list
        // and initialize each of them with zeros as mentioned on Lines 14-41.
        
    }
        
    @Override
    public void pluck(char key) {
        // Read the description of what you need to do in this method in Instrument.java
        
    }

    @Override
    public void tick() {
        // Read the description of what you need to do in this method in Instrument.java
        
    }

    @Override
    public double superposition() {
        // Read the description of what you need to do in this method in Instrument.java
        
        return 0;
    }
}
