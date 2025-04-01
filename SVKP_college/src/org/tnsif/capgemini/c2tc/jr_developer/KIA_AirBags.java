package org.tnsif.capgemini.c2tc.jr_developer;

public class KIA_AirBags {
    public void disp_AirBags() {
        System.out.println("All KIA have airbags");
    }

    public static void main(String[] args) {
        KIA_AirBags airbags = new KIA_AirBags();
        airbags.disp_AirBags(); 

        KIA_Speed_Limit obj = new KIA_Speed_Limit(); 
        obj.disp_Speed_limit();
    }
}