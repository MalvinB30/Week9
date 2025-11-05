package Week09;

public class Vehicle {

    // Nested interface untuk tindakan pada kendaraan
    interface Action {
        void start();
        void stop();
    }

    private String name;

    public Vehicle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void displayInfo() {
        System.out.println("Vehicle: " + name);
    }
}

