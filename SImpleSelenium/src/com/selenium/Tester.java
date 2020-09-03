package com.selenium;

public class Tester {
    public static void main(String[] args) {
          Base obj = new Derived();
          obj.method(25);
    }
}

class Base {
    public static void method(int a) {
          System.out.println("Base Method");
    }
}

//class Derived extends Base {
    //public static void method(int a) {
          //.out.println("Derived Method");
    //}
//}