import java.util.Scanner;

/**
* This program receives the mass from the user.
* From information given, it calculates how much energy,
* a specific mass would produce.
*
* @author  Sarah Andrew
* @version 1.0
*
* @since   2023-02-16
*/

public final class Einstein {

    /**
     * This is a private constructor used to satisfy the
     * style checker.
     *
     * @exception IllegalStateException Utility class.
     * @see IllegalStateException
     */
    private Einstein() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * This is the main method.
     *
     * @param args Unused.
     */
    public static void main(String[] args) {
        // declare constant
        final double speedOfLight = 2.998 * (Math.pow(10, 8));

        // Create a new scanner
        final Scanner scanner = new Scanner(System.in);

        // Gets user input
        System.out.println("Enter the mass of the object (kg): ");
        final String massStr = scanner.nextLine();

        // Usage of try catch to detect string input.
        try {
            // Convert string to double
            final double massDoub = Double.parseDouble(massStr);

            if (massDoub >= 0) {
                // Calculate the amount of energy with given mass.
                final double energy = massDoub * (Math.pow(speedOfLight, 2));

                // display results to user
                System.out.print("The mass of " + massDoub + " (kg)");
                System.out.print(" would produce ");
                System.out.format("%.3e", energy);
                System.out.println(" J amount of energy.");

            } else {
                // Executes when a negative number as input
                System.out.println("Please enter a positive input.");
            }
        } catch (NumberFormatException error) {
            // Displays error to user.
            System.out.print("Please enter valid input."
                + error.getMessage());
        }
        // Closes scanner
        scanner.close();
    }
}
