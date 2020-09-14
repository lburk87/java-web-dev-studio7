package org.launchcode.studio7;

public interface OpticalDisc {

    public static void spinDisc(BaseDisc disc) {
    System.out.println("The "+disc.getName()+" "+disc.getDiscType()+" spins at a rate of "+disc.getSpinRate()+ " rpm.");    }
}
