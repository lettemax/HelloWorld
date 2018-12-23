import java.awt.*;
import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {

    /*
    public static void main(String[] args) {


         31, 45, 22, 98, 10
        int[] numbers = new int[5];

        numbers[0] = 31;
        numbers[1] = 45;
        numbers[2] = 22;
        numbers[3] = 98;
        numbers[4] = 10;

        int[] numbers2 = {31, 45, 22, 98, 10};

        String[] myFavoriteCandyBars = {"Twix", "Hershey's", "Crunch"};

        System.out.println("Index 1: " + myFavoriteCandyBars[1]);

        myFavoriteCandyBars[2] = "Vegan bar";
        System.out.println("Index 2: " + myFavoriteCandyBars[2]);

        System.out.println("Length of myFavoriteCandyBars[]: " + myFavoriteCandyBars.length);

        System.out.println(0 < 'a');


        System.out.println("Enter a word: ");

        Scanner sc = new Scanner(System.in);
        int userNumber = sc.nextInt();
        System.out.println(userNumber);
        double userNumber2 = sc.nextDouble();
        System.out.println(userNumber2);

        String userInput = sc.next();

        String uppercased = userInput.toUpperCase();
        System.out.println(userInput);
        System.out.println(uppercased);

        char firstCharacter = userInput.charAt(0);
        System.out.println(firstCharacter);

        System.out.println("Contains: " + userInput.contains(("Enter").toLowerCase()));

    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Max");

        Car myCar = new Car(
                25.5,
        "1BC32E", java.awt.Color.BLUE, true );

        Car sallyCar = new Car(31.3,
        "14DR56", java.awt.Color.BLACK,false);

        System.out.println("My car's License Plate: " + myCar.licensePlate);
        System.out.println("Sally's License Plate: " + sallyCar.licensePlate);

        System.out.println(myCar.paintColor);
        myCar.changePaintColor(java.awt.Color.GREEN);
        System.out.println(myCar.paintColor);

        double myCarSpeed = 50;
        myCarSpeed = myCar.speedingUp(myCarSpeed);
        System.out.println(myCarSpeed);

    }
    }


    public static void main(String[] args) {
        String s = "dog";
        String replacedF = s.replace("d", "f");
        System.out.println(s);
        System.out.println(replacedF);
    }


    public static void main(String[] args) {
        // Create instance of dog, Bode
        Dog bode = new Dog(100.4, "Bode", Color.YELLOW);

        // Simulate Bode eating
        bode.eat(2.5);

        // Simulate Bode barking
        bode.bark();

        // Get Bode's weight in kg
        System.out.println(bode.getWeight());
    }
    */

    public static void main(String[] args) {
        // To calculate chance that two people in room of 30 would have same birthday
        // o holds number of non-duplicate birthdays left
        double o = 364.0;
        // z holds number of total number of possible birthdays
        double z = 365.0;
        // p holds probability that two people in room of {i} people have same birthday
        double p = 1.0;
        // calculate p for room of 30 people
        for (double i=0.0; i<30.0; i++) {
            // print i to keep track of iteration number
            System.out.print(i + " ");
            // subtract 1 from o each loop as number of non-duplicate birthdays decreases each iteration
            o -= i;
            // calculate p as (last p) * ((number of non-duplicate birthdays left) / (total number of possible birthdays))
            p = p*(o/z);
            // print new p
            System.out.println(p);
        }
    }

}
