package dpi.ir.ocp8.lambda.builtIn.function;

import java.util.function.UnaryOperator;

/**
 * Author: <a href="mailto:k1.tehrani@gmail.com">Kayvan Tehrani</a>
 *
 * Description: <the description of the class for java doc by those that might use it, please use html if possible>
 */
public class UnaryOperatorSample {

  public static void main(String[] args) {
    UnaryOperator<Double> log2 = v -> Math.log(v) / Math.log(2);
    System.out.println("log2 = " + log2.apply(8.0));
  }

}
