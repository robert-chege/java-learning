public class LessonObjects {
    public static void main(String[] args) {
        Aircraft cessna172 = new Aircraft(14, 145, 100, 70);
        Aircraft piperSaratoga = new Aircraft(17, 190, 300, 57);

        cessna172.setPassengers(10);

        System.out.println("Cessna 172");
        cessna172.calculateEndurance();

        Aircraft.wings = 2;
        System.out.println(Aircraft.wings);
    }
}

class Aircraft {
    private float passengers; // number
    float cruiseSpeed; // miles per hour
    float fuelCapacity; // gallons per hour
    float fuelBurnRate; // gallons per hour

    static int wings;

    Aircraft(float passengers, float cruiseSpeed, float fuelCapacity, float fuelBurnRate) {
        this.passengers = passengers;
        this.cruiseSpeed = cruiseSpeed;
        this.fuelCapacity = fuelCapacity;
        this.fuelBurnRate = fuelBurnRate;
    }

    void calculateEndurance() {
        float endurance = fuelCapacity / fuelBurnRate;

        System.out.println("The endurance is " + endurance + "hours");
    }

    void setPassengers(int p) {
        if (p > 0 && p <= 10) {
            passengers = p;
            System.out.println("revised passenger number: " + passengers );
        } else{
            System.out.println("The number you have entered is out of range");
        }
    }
}
