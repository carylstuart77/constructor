package edu.cnm.deepdive.book;

public class Dog {
  String name;
  String breed;
//another constructor withOUT passing strings.
//  Dog(){
//
//  }
  //constructor; two string being passed into class and relable as n and b
  Dog(String n, String b){
    name=n;
    breed=b;
  }
  //Methods
  void printMydog(){
    System.out.print("My dog " + name );
  }
  void printBreed(){
    System.out.println(" is a " + breed + ".");
  }
  void bark() {
    System.out.println("woof ");
  }
  void dig() {
    System.out.println("wah ");

  }
}
