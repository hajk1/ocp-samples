package dpi.ir.ocp8.lambda.functionalInterface;

import dpi.ir.ocp8.lambda.model.Dog;

/**
 * Author: <a href="mailto:k1.tehrani@gmail.com">Kayvan Tehrani</a>
 *
 * Description: <the description of the class for java doc by those that might use it, please use html if possible>
 */
class DogsPlay {

  private DogQuerier dogQuerier;

  DogsPlay(DogQuerier dogQuerier) {
    this.dogQuerier = dogQuerier;
  }

  boolean doQuery(Dog d) {
    return dogQuerier.test(d);
  }
}
