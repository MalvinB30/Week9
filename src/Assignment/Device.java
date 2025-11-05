package Assignment;

public class Device {

    public interface Connectivity {
        void connectToWiFi(String networkName);
        void disconnectFromWiFi();
    }

    private final String brand;
    private final String model;

    public Device(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() { return brand; }
    public String getModel() { return model; }

    public void displayInfo() {
        System.out.println("Device Info: Brand: " + brand + ", Model: " + model);
    }
}

