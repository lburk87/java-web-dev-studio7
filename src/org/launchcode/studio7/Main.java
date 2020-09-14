package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.
        CD hamiltonCd = new CD("Hamilton", 0.7, "CD", 4000);
        DVD hamiltonDvd = new DVD("Hamilton", 4.7, "DVD", 32000);


        // TODO: Call each CD and DVD method to verify that they work as expected.
        OpticalDisc.spinDisc(hamiltonCd);
        OpticalDisc.spinDisc(hamiltonDvd);

    }
}
