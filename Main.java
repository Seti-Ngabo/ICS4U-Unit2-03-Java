/*
 * This program uses SetiStack
 * 
 * By:      Seti Ngabo
 * Version: 1.0
 * Since:   2020-10-26
 */

import java.util.Scanner;
/**
 * Class Main.
 */

final class Main {
    /**
    * Prevent instantiation
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The stack program.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        final Scanner myObj = new Scanner(System.in);
        // use SetiStack class
        final SetiStack aStack = new SetiStack();
        final int tempElement;

        System.out.print("Enter a number (! to pop): ");
        while (myObj.hasNext()) {
            final String myNewLine = myObj.nextLine();
            if ("!".equals(myNewLine)) {
                break;
            }

            try {
                final int userNumber = Integer.parseInt(myNewLine);
                aStack.push(userNumber);
            } catch (NumberFormatException ex) {
                System.out.println(myNewLine + " is NaN");
            }
            System.out.print("Enter a number (! to pop):");
        }

        System.out.println(aStack.getStack());

        System.out.println("Pop element.");
        tempElement = aStack.pop();
        System.out.println(aStack.getStack());

        System.out.println("\nDone.");
    }
}
