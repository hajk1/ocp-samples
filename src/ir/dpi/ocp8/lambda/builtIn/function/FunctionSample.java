package ir.dpi.ocp8.lambda.builtIn.function;

import java.util.function.Function;

/**
 * Author: <a href="mailto:k1.tehrani@gmail.com">Kayvan Tehrani</a>
 *
 * Description: <the description of the class for java doc by those that might use it, please use html if possible>
 */
public class FunctionSample {

  public static void main(String[] args) {
    Function<Integer, String> answer = a -> {
      if (a == 42) {
        return "forty-two";
      } else {
        return "No answer for you!";
      }
    };
    System.out.println(answer.apply(42));
    System.out.println(answer.apply(64));
  }
}
