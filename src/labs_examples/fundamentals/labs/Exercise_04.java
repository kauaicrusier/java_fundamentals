package labs_examples.fundamentals.labs;

/**
 * Fundamentals Exercise 4: Volume and Surface Area
 *
 *      Write the necessary code to calculate the volume and surface area of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {

        double volume;
        volume = 3.14 * Math.pow(3.14, 2) * 5;
        double surface;
        surface = 2 * 3.14 * 3.14 * 5;

        System.out.println(volume);
        System.out.println(surface);


    }
}
