package com.driver;

public class B extends A{
    public static String meth(){
        return "Method is overridden in Extendend class B";
    }
    public static void main(String[] args) {
        B e = new B();
        System.out.println(e.meth());
    }
}
