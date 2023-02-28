package dpi.ir.ocp8.lambda.functionalInterface;

import dpi.ir.ocp8.lambda.model.Dog;

/**
 * Author: <a href="mailto:k1.tehrani@gmail.com">Kayvan Tehrani</a>
 *
 * Description: <the description of the class for java doc by those that might use it, please use html if possible>
 */

@FunctionalInterface
public interface DogQuerier {

  boolean test(Dog d);
  default boolean test2(Dog d){
   return true;
  }
  default boolean test3(Dog d){
   return true;
  }

  boolean equals(Object obj);


//  boolean test2(Dog d);

}
