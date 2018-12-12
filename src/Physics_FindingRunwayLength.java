import java.util.Scanner;

public class Physics_FindingRunwayLength {
    public static void main(String[] args)   {
        Scanner input = new Scanner(System.in);

        /* solving the task in three steps
        1) prompting for input
        2) Calculating results
        3) Displaying results
        */

        // 1) Prompting for input
        System.out.print(
                "Please enter the planes takeoff speed 'v' in m/s: "
        );
        double v = input.nextDouble(); // We need the velocity of the plane at takeoff

        System.out.print(
                "Please enter the planes acceleration 'a' in m/s^2: "
        );
        double a = input.nextDouble(); // We need the acceleration of the plane at takeoff

        // 2) Calculating the results

        double length = Math.pow(v, 2)/(2*a); // Calculating the length of the runway

        // 3) Displaying the results
        System.out.println(
                "The length of the runway is: " + length
        );
    }
}
