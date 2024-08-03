package com.springcore.constructorinjection;

public class AmbiguityResolution {
    private int a,b;

    // Agar String waale Constructor na present ho to ye call kar dega.Upar se niche aata hai Spring and ye upar hai
    public AmbiguityResolution (double x, double y){
        a = (int)x;
        b = (int)y;
        System.out.println("double");
    }

    // Ye present to ye Spring ye Constructor call kr dega
    public AmbiguityResolution (String x, String y){
        a = Integer.parseInt(x);
        b = Integer.parseInt(y);
        System.out.println("String");
    }


//    Isko call hone ke liye type tag me int mention karna hoga
    public AmbiguityResolution (int x, int y){
        a = x;
        b = y;
        System.out.println("int");
    }

    public void sum(){
        System.out.println("a + b = " + (a+b));
    }
}
