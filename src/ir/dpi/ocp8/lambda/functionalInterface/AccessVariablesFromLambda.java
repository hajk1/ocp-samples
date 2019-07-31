package ir.dpi.ocp8.lambda.functionalInterface;

import ir.dpi.ocp8.lambda.model.Dog;

/**
 * Author: <a href="mailto:k1.tehrani@gmail.com">Kayvan Tehrani</a>
 *
 * Description: <the description of the class for java doc by those that might use it, please use html if possible>
 */
public class AccessVariablesFromLambda {

  public static void main(String[] args) {
    Dog boi = new Dog(8, "Boi", 30);

    int numCats = 3;
//        int numBalls = 1; //now we have numBalls in enclosing scope

    DogQuerier dqWithCats = d -> {
      int numBalls = 1; //completely new variable local to lambda
      numBalls++;      //can modify numBalls
      System.out.println("numBalls = " + numBalls); //can access numBalls
      System.out.println("numCats = " + numCats);   //can access numCats
      return d.getAge() > 9;
    };
    System.out.println("dqWithCats = " + dqWithCats.test(boi));
  }

}
