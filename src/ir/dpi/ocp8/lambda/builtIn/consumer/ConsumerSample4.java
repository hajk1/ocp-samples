package ir.dpi.ocp8.lambda.builtIn.consumer;

import ir.dpi.ocp8.lambda.model.User;
import java.util.Map;
import java.util.function.BiConsumer;

/**
 * Author: <a href="mailto:k1.tehrani@gmail.com">Kayvan Tehrani</a>
 *
 * Description: <the description of the class for java doc by those that might use it, please use html if possible>
 */
public class ConsumerSample4 {

  public static void main(String[] args) {
    Map<String, String> env = System.getenv();
    User user = new User();
    BiConsumer<String, String> findUsername = (key, value) -> {
      if (key.equals("USER")) {
        user.setUsername(value);
      }
    };
    env.forEach(findUsername);
    System.out.println("Username from env :  = " + user.getUsername());
  }
}
