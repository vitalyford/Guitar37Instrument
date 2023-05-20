/******************************************************************************
 * Name: 
 * 
 * Description: This project plays guitar strings when the user presses 
 * certain keys on the keyboard. Karplus-Strong algorithm is used to 
 * synthesize the sound of a plucked guitar string. There are a total of 37
 * guitar strings.
 * 
 * Your goal is to create a Java class in a new file (I created it for you and 
 * called SuperCoolGuitar.java) that implements the Instrument interface. 
 * In the constructor of your newly created class, you will first initialize
 * Concert A frequency as 440.0 (type: double). Based on that, you will create 37 strings
 * of the "Guitar 37" musical instrument, every frequency of which will be defined as:
 * 
 * frequency = CONCERT_A * Math.pow(2.0, (i - 24) / 12.0)
 * 
 * where i is within [0, 37) range. For every one of the 37 strings, you will
 * allocate a "buffer" (LinkedList<Double>) the size of which is defined as:
 * 
 * size = 44100 / frequency
 * 
 * In other words, every guitar string will be represented as an individual
 * LinkedList<Double> and it will have a specific size depending on the sound frequency 
 * that it simulates.
 * 
 * For example, the first 6 strings' LinkedList<Double> lists will have the following sizes:
 * 400, 378, 357, 337, 318, 300
 * 
 * These numbers are calculated automatically based on the formula from Line 15 (see above).
 * 
 * The constructor will initialize all LinkedList<Double> (we call them "buffers") 
 * of all strings with zeros. In other words, based on the example from Line 27,
 * the first guitar string will have 400 zeros in its LinkedList<Double>,
 * the second guitar string - 378 zeros, the third - 357, and so on.
 * 
 * After you completed the constructor, take a look at Instrument.java interface
 * to learn about the specifics on how to implement the methods inside the
 * SuperCoolGuitar.java
 * 
 * You do NOT have to implement LinkedList, just use the one that exists in Java.
 * 
 * To run the whole program, you will need to run PlayInstrument.java (NOT SuperCoolGuitar.java).
 *
 ******************************************************************************/

import java.util.*;

public class SuperCoolGuitar implements Instrument {
    private LinkedList<LinkedList<Double>> guitarStrings;

    public SuperCoolGuitar() {
        guitarStrings = new LinkedList<>();
    }
        
    @Override
    public void pluck(char key) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void tick() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public double superposition() {
        // TODO Auto-generated method stub
        return 0;
    }
}
