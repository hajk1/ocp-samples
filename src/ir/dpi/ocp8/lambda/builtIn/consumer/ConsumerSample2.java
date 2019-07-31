package ir.dpi.ocp8.lambda.builtIn.consumer;

import java.util.Map;
import java.util.function.BiConsumer;

/**
 * Author: <a href="mailto:k1.tehrani@gmail.com">Kayvan Tehrani</a>
 *
 * Description: <the description of the class for java doc by those that might use it, please use html if possible>
 */
public class ConsumerSample2 {

  public static void main(String[] args) {
    Map<String, String> env = System.getenv();
    BiConsumer<String, String> printEnv = (key, value) -> {
      System.out.println(key + ": " + value);
    };

    printEnv.accept("USER", env.get("USER"));
  }

}
