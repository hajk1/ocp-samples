package ir.dpi.ocp8.lambda.builtIn.predicate;

import ir.dpi.ocp8.lambda.model.Dog;
import java.util.function.Predicate;

/**
 * Author: <a href="mailto:k1.tehrani@gmail.com">Kayvan Tehrani</a>
 *
 * Description: <the description of the class for java doc by those that might use it, please use html if possible>
 */
public class PredicateSample {

  public static void main(String[] args) {
    Dog boi = new Dog(9, "boi", 30);
    Dog clover = new Dog(10, "clover", 25);
    Predicate<Dog> p = d -> d.getAge() > 9;

    System.out.println("Is Boi older than 9?" + p.test(boi));
    System.out.println("Is Clover older than 9?" + p.test(clover));
  }

}
