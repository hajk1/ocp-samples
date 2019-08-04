package dpi.ir.ocp8.lambda.functionalInterface;

import dpi.ir.ocp8.lambda.model.Dog;

/**
 * Author: <a href="mailto:k1.tehrani@gmail.com">Kayvan Tehrani</a>
 *
 * Description: <the description of the class for java doc by those that might use it, please use html if possible>
 */
public class PassLambdaToMethods {

  public static void main(String[] args) {
    Dog boi = new Dog(8, "Boi", 30);

    DogsPlay dogsPlay = new DogsPlay(d -> d.getAge() > 9);
    System.out.println("dogsPlay = " + dogsPlay.doQuery(boi));
  }

}
