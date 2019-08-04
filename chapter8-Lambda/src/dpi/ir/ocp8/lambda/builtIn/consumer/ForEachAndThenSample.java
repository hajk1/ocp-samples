package dpi.ir.ocp8.lambda.builtIn.consumer;

import dpi.ir.ocp8.lambda.model.Dog;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * Author: <a href="mailto:k1.tehrani@gmail.com">Kayvan Tehrani</a>
 *
 * Description: <the description of the class for java doc by those that might use it, please use html if possible>
 */
public class ForEachAndThenSample {

  public static void main(String[] args) {
    List<Dog> dogs = new ArrayList<>();
    Dog boi = new Dog(30, "boi", 6);
    Dog clover = new Dog(32, "clover", 8);
    Dog zooey = new Dog(31, "zooey", 7);
    dogs.add(boi);
    dogs.add(clover);
    dogs.add(zooey);
    Consumer<Dog> displayname = d -> System.out.println(d.getName() + "  ");
    dogs.forEach(displayname);
    dogs.forEach(displayname.andThen(d -> d.bark()));
  }

}
