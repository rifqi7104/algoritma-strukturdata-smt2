package JOBSHEET4.Latihan;
public class MainCars {
    public static void main (String[] args) {
        Car[] cars = {
            new Car("BMW", "M2 Coupe", 2016, 6861, 728),
            new Car("Ford", "Fiesta ST", 2014, 3721, 575),
            new Car("Nissan", "370Z", 2009, 4360, 657),
            new Car("Subaru", "BRZ", 2014, 4058, 609),
            new Car("Subaru", "Impreza WRX STI", 2013, 6255, 703),
            new Car("Toyota", "AE86 Trueno", 1986, 3700, 553),
            new Car("Toyota", "86/GT86", 2014, 4180, 609),
            new Car("Volkswagen", "Golf GTI", 2014, 4180, 631)
        };
        System.out.println("_______________________________________________________________________");
        System.out.println("|Merk        | Tipe            | Tahun | top_acceleration | top_power |");
        System.out.println("_______________________________________________________________________");
        System.out.println("|BMW         | M2 Coupe        | 2016  | 6816             | 728       |");
        System.out.println("|Ford        | Fiesta ST       | 2014  | 3921             | 575       |");
        System.out.println("|Nissan      | 370Z            | 2009  | 4360             | 657       |");
        System.out.println("|Subaru      | BRZ             | 2014  | 4058             | 609       |");
        System.out.println("|Subaru      | Impreza WRX STI | 2013  | 6255             | 703       |");
        System.out.println("|Toyota      | AE86 Trueno     | 1986  | 3700             | 553       |");
        System.out.println("|Toyota      | 86/GT86         | 2014  | 4180             | 609       |");
        System.out.println("|Volkswagen  | Golf GTI        | 2014  | 4180             | 631       |");
        System.out.println("=======================================================================");
        System.out.println();
    
        int maxAcceleration = Car.findMaxAcceleration(cars, 0, cars.length - 1);
        System.out.println("Top Acceleration Tertinggi: " + maxAcceleration);
        int minAcceleration = Car.findMinAcceleration(cars, 0, cars.length - 1);
        System.out.println("Top Acceleration Terendah: " + minAcceleration);
        double avgTopPower = Car.calculateAverageTopPower(cars);
        System.out.println("Rata-rata Top Power: " + avgTopPower);
    }
}

