package org.tnsif.capgemini.c2tc.lambdaexpressions;

interface Sayable{  
    public String say();  
}  
public class LambdaExpressions2{  
public static void main(String[] args) {  
    Sayable s=()->{  
        return "I have nothing to say.";  
    };  
    System.out.println(s.say());  
}  
}  

