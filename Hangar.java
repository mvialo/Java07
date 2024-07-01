public class Hangar {
    public static void main(String[] args) {
        Car car1 = new Car("Clio", 100000);
        Boat boat2 = new Boat("Titanic", 200000);
        System.out.println(car1.doStuff());
        System.out.println(boat2.doStuff());
    }

}
