import java.awt.*;
import java.util.*;
import java.lang.reflect.Array;
import java.lang.Math;


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
        /*
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
        int[] arr = {2, 5, 6, 10, 11, 3, 15};
        */

        /*
        double power = Math.pow(5, 3);
        System.out.println(power);

        double squareRoot = Math.sqrt(64);
        System.out.println(squareRoot);

        Random rand = new Random();
        int randomNumber = rand.nextInt();
        int randomNumberWithBound = rand.nextInt(10);
        System.out.println(randomNumber);
        System.out.println(randomNumberWithBound);
        */

        /*
        Coin c = new Coin(1);
        System.out.println("Initial: " + c.getFaceUp());
        for(int i=0; i<10; i++) {
            c.flip();
            System.out.println("After Flip: " + c.getFaceUp());
        }
        */


        /*
        // Create new Dice object
        Dice d = new Dice();
        // Roll six-sided di
        d.roll();
        */

        /*
        // Lambda function for Answerable interface
        // Saving function in variable, phone
        Answerable phone = () -> {return "Hello";};
        // Printing out result of function
        System.out.println(phone.answer());

        // Lambda function for Predicate interface
        // Saving function in variable, isOdd
        Predicate isOdd = n -> n % 2 != 0;
        // Printing out result of function
        System.out.println(isOdd.test(2));
        // Saving function in variable, isOdd
        Predicate isEven = n -> n % 2 == 0;
        // Printing out result of function
        System.out.println(isEven.test(2));
        */

        Map< String,Integer> hm =
                new HashMap< String,Integer>();
        hm.put("a", 100);
        hm.put("b", 200);
        hm.put("c", 300);
        hm.put("d", 400);

        // Returns Set view
        Set< Map.Entry< String,Integer> > st = hm.entrySet();

        //Elements can traverse in any order
        for(Map.Entry m:hm.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

    }

    /*
    // function in progress
    public static int mthSmallest(int[] arr, int m) {
        int start = 0;
        int end = arr.length-1;
        int index = 0;
        int[] newArray = new int[arr.length];
        for (int i=0; i<arr.length; i++) {
            if (arr[i] < arr[index]) {
                newArray[start] = arr[i];
                start++;
            } else if (arr[i] == arr[index]){
                newArray[start] = arr[i];
                start++;
            } else {
                newArray[end] = arr[i];
                end--;
            }
        }
        return start;
    }
    */

}
