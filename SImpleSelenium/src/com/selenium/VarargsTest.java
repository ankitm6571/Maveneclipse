package com.selenium;

public class VarargsTest {
    public static void main(String[] args) {
              new VarargsTest().display(5,"Infosys");
              new VarargsTest().display(4,"Infosys","Limited");
    }

   public void display(int b, String... strings) {
              System.out.print(strings.length-1+" ");
}
}