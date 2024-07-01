
public class Car extends Vehicle {

    // constructeur
    public Car(String brand, int kilometers) {
        super(brand, kilometers);
    }

    // méthodes
    @Override
    public String doStuff() {
        return "Je suis " + this.getBrand() + " et je fais vroum vroum!";

    }

}
