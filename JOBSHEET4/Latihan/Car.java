package JOBSHEET4.Latihan;
public class Car {
    String merk, tipe;
    int tahun, top_acceleration, top_power;

    public Car(String merk, String tipe, int tahun, int acc, int power){
        this.merk = merk;
        this.tipe = tipe;
        this.tahun = tahun;
        top_acceleration = acc;
        top_power = power;
    }

    static int findMaxAcceleration(Car[] cars, int start, int end) {
        if (start == end) {
            return cars[start].top_acceleration;
        }
        int mid = (start + end) / 2;
        int leftMax = findMaxAcceleration(cars, start, mid);
        int rightMax = findMaxAcceleration(cars, mid + 1, end);
        return Math.max(leftMax, rightMax);
    }

    static int findMinAcceleration(Car[] cars, int start, int end) {
        if (start == end) {
            return cars[start].top_acceleration;
        }
        int mid = (start + end) / 2;
        int leftMin = findMinAcceleration(cars, start, mid);
        int rightMin = findMinAcceleration(cars, mid + 1, end);

        return Math.min(leftMin, rightMin);
    }

    static double calculateAverageTopPower(Car[] cars) {
        int totalPower = 0;
        for (Car car : cars) {
            totalPower += car.top_power;
        }
        return (double) totalPower / cars.length;
    }
}