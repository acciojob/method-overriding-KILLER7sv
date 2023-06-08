package com.driver;

public class B extends A{
    public String meth(){
        return "Method is overridden in Extended class B";
    }
    public static void main(String[] args) {
        B e = new B();
        System.out.println(e.meth());
    }
}
