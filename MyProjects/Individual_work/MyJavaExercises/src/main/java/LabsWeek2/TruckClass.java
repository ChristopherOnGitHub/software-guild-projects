package LabsWeek2;

/**
 *
 * @author apprentice
 */
public class TruckClass {

    private final int modelYear;
    private final String make;
    private final String model;
    public double MPG;
    public boolean isLifted;

    TruckClass(int modelYear, String make, String model, double MPG, boolean isLifted) {
        this.make = make;
        this.model = model;
        this.modelYear = modelYear;
        this.MPG = MPG;
        this.isLifted = isLifted;
    }

    public void setMPG(double MPG) {
        this.MPG = MPG;
    }

    public void setIsLifted(boolean isLifted) {
        this.isLifted = isLifted;
    }

    public String returnTruckMake() {
        return this.make;
    }

    public int returnTruckModelYear() {
        return this.modelYear;
    }

    public String returnTruckModel() {
        return this.model;
    }

    public double returnTruckMPG() {
        return this.MPG;
    }

    public boolean returnTruckIsLifted() {
        return this.isLifted;
    }

    public void vroom() {
        System.out.println("VROOM");
    }

    public boolean liftTruck() {
        return this.isLifted = true;
    }

    public boolean unLiftTruck() {
        return this.isLifted = false;
    }

}
