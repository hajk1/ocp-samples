package ir.dpi.ocp8.lambda.functionalInterface;

import ir.dpi.ocp8.lambda.model.Dog;

public class SyntaxBasics {

  public static void main(String[] args) {
    Dog boi = new Dog(8, "Boi", 30);
    Dog clover = new Dog(12, "Clover", 35);

    DogQuerier dq = new DogQuerier() {
      @Override
      public boolean test(Dog d) {
        return d.getAge() > 9;
      }
    };

    DogQuerier dq3 = d -> d.getAge() > 9;

    //You can supply the type if you want to, but if you do, you’ll have to use the parentheses around the
    //parameter:
    DogQuerier dq2 = (Dog d) -> d.getAge() > 9;

    //If you want to write return , then you’ll have to write the lambda like this:
    DogQuerier dq4 = d -> {
      return d.getAge() > 9;
    };

    /*If the body of your lambda is anything more than an
    expression—that is, a statement or multiple statements—you’ll need to use
    the curly braces: */
    DogQuerier dq5 = d -> {
      System.out.println("Testing " + d.getName());
      return d.getAge() > 9;
    };

    System.out.println("Is Boi older than 9? " + dq.test(boi));
    System.out.println("Is Boi older than 9? " + dq2.test(boi));
    System.out.println("Is Boi older than 9? " + dq3.test(boi));
    System.out.println("Is Boi older than 9? " + dq4.test(boi));
    System.out.println("Is Boi older than 9? " + dq5.test(boi));
    System.out.println("Is Clover older than 9? " + dq4.test(clover));
  }
}
