package org.example;

public class Main {

  public static void main(String[] args) {
    System.out.println("Hello world!");
  }

  public static String hello(String name){
    return String.format("Hello, %s", name);
  }
}