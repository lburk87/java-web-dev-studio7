package org.launchcode.studio7;

public class BaseDisc {
    private String name;
    private double capacity;
    private String discType;
    private int spinRate;

    public int getSpins() {
        return spins;
    }

    public void setSpins(int spins) {
        this.spins = spins;
    }

    private int spins;


    public BaseDisc(String name, double capacity, String discType, int spinRate) {
        this.name = name;
        this.capacity = capacity;
        this.discType = discType;
        this.spinRate = spinRate;
        this.spins = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public String getDiscType() {
        return discType;
    }

    public void setDiscType(String discType) {
        this.discType = discType;
    }

    public int getSpinRate() {
        return spinRate;
    }

    public void setSpinRate(int spinRate) {
        this.spinRate = spinRate;
    }
}
