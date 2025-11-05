package Week09;

public class Main {

    public static void main(String[] args) {
        // Membuat instance dari Car
        Car myCar = new Car("Honda Civic");

        // Menampilkan informasi kendaraan
        myCar.showVehicleInfo();

        // Memulai kendaraan
        myCar.start();

        // Menghentikan kendaraan
        myCar.stop();
    }

}

