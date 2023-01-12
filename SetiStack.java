/*
 * This is the SetiStack
 *
 * By:      Seti Ngabo
 * Version: 1.0
 * Since:   2020-10-26
 */

import java.util.ArrayList;
/**
*  Make class MrCoxallStack.
*/

public class SetiStack {

    /**
    * An ArrayList that will hold the tack elements.
    */
    private ArrayList<Integer> theStack = new ArrayList<Integer>();

    /**
    * Getter.
    * The showStack method.
    *
    * @return regets stack and returns it
    */
    public ArrayList<Integer> getStack() {
        return theStack;
    }

    /**
    * The push() function.
    *
    * @param pushNumber The int to be added to the stack
    */
    public void push(final int pushNumber) {
        final int index = theStack.size();
        theStack.add(index, pushNumber);
    }
    /**
    * The pop() function.
    *
    * @return Remove the top element and return it
    */

    public int pop() {
        return theStack.remove(theStack.size() - 1);
    }
}
