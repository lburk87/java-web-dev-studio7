package org.launchcode.studio7;

public class BaseDisc {
    private String name;
    private double capacity;
    private String discType;
    private int spinRate;

    public BaseDisc(String name, double capacity, String discType, int spinRate) {
        this.name = name;
        this.capacity = capacity;
        this.discType = discType;
        this.spinRate = spinRate;
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

        public void displayInfo() {
            System.out.println("Format: "+this.discType+" | Title: "+this.name+" | GB: "+this.capacity+" | RPM: "+this.spinRate);    }
    }
