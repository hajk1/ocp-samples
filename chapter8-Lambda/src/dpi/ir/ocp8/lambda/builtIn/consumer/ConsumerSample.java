package dpi.ir.ocp8.lambda.builtIn.consumer;

import java.util.function.Consumer;

/**
 * Author: <a href="mailto:k1.tehrani@gmail.com">Kayvan Tehrani</a>
 *
 * Description: <the description of the class for java doc by those that might use it, please use html if possible>
 */
public class ConsumerSample {

  public static void main(String[] args) {
    Consumer<String> redOrBlue = pill -> {
      if (pill.equals("red")) {
        System.out.println("Down the rabbit hole");
      } else if (pill.equals("blue")) {
        System.out.println("Stay in lalal land");
      }
    };
    redOrBlue.accept("red");
  }

}
