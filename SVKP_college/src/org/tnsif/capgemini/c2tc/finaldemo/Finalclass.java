package org.tnsif.capgemini.c2tc.finaldemo;

class calc {  // Removed "final"
    public void show() {
        System.out.println("AI integration done by hema");
    }
}

class adav extends calc {  // Now, this is allowed
    public void show() {
        System.out.println("AI integration done by yasar");
    }
}

public class Finalclass {
    public static void main(String[] args) {
        adav obj = new adav();
        obj.show();
    }
}
