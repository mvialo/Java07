
public class Boat extends Vehicle {
    // constructeur
    public Boat(String brand, int kilometers) {
        super(brand, kilometers);
    }

    // méthodes
    @Override
    public String doStuff() {
        return "Je suis " + this.getBrand() + " et je fais glou glou!";

    }

}