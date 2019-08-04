package dpi.ir.ocp8.lambda.methodref;

import java.util.Arrays;
import java.util.List;

/**
 * Author: <a href="mailto:k1.tehrani@gmail.com">Kayvan Tehrani</a>
 *
 * Description: <the description of the class for java doc by those that might use it, please use html if possible>
 */
public class MethodRefSample {

  public static void main(String[] args) {
    List<String> trees = Arrays.asList("fir", "cedar", "pine");
    trees.forEach(t -> System.out.println(t));
    trees.forEach(System.out::println);
  }

}
