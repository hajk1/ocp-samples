package ir.dpi.ocp.lambda.functionalInterface;

public class Main {

  public static void main(String[] args) {
    Dog boi = new Dog(8, "Boi", 30);
    Dog clover = new Dog(12, "Clover", 35);

    DogQuerier dq = new DogQuerier() {
      @Override
      public boolean test(Dog d) {
        return d.getAge() > 9;
      }
    };

    DogQuerier dq2 = (d) -> d.getAge() > 9;
    DogQuerier dq3 = d -> d.getAge() > 9;
    DogQuerier dq4 = d -> {
      return d.getAge() > 9;
    };

    DogQuerier dq5 = d -> {
      System.out.println("Testing " + d.getName());
      return d.getAge() > 9;
    };

    System.out.println("Is Boi older than 9? " + dq.test(boi));
    System.out.println("Is Boi older than 9? " + dq2.test(boi));
    System.out.println("Is Boi older than 9? " + dq3.test(boi));
    System.out.println("Is Boi older than 9? " + dq4.test(boi));
    System.out.println("Is Boi older than 9? " + dq5.test(boi));
    System.out.println("Is Clover older than 9? " + dq4.test(boi));
  }
}
