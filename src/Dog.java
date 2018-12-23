import java.awt.*;

public class Dog {

    double weightInKilograms;
    String name;
    Color furColor;


    public Dog(double iWeightInKilograms, String iName, Color iFurColor) {
        this.weightInKilograms = iWeightInKilograms;
        this.name = iName;
        this.furColor = iFurColor;
    }

    public void eat(double weightOfFood){
        this.weightInKilograms += weightOfFood;
    }

    public void bark() {
        System.out.println("Bark!");
    }

    public double getWeight() {
        return this.weightInKilograms;
    }

}
