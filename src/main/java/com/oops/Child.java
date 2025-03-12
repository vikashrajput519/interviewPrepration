package com.oops;

public class Child extends Parent{

    public void m1(){
        System.out.println("Child m1()");
    }

    public void m2(){
        System.out.println("Child m2()");
    }

    public static void main(String[] args) {
        Parent p = new Child();

        // Output - Child m1()
        p.m1();

        // Compile time error Using parent reference we can not call child specific methods
        //p.m2();

        // Parent m3()
        p.m3();
    }
}
