package edu.cnm.deepdive.book;

/**
 * Construtor creates an instance of a class.
 * Constructor also is named the same of that class.
 * No return values and runs automatically
 */
public class ConstInstance {
  public static void main(String args[]) {

//Two dog objects through a constructor passing strings.
    Dog jerome = new Dog("Jerome", "Golden Retriever");
    Dog tucker = new Dog("Tucker", "Labrador Retriever");

    jerome.printMydog();
    jerome.printBreed();

    tucker.printMydog();
    tucker.printBreed();

    jerome.bark();
    jerome.dig();

  }

}
