public class Main {

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

    }
}
