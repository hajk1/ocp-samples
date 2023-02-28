package ir.dpi.ocp8.thread.w8nty;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Author: <a href="mailto:k1.tehrani@gmail.com">Kayvan Tehrani</a>
 *
 * Description: <the description of the class for java doc by those that might use it, please use html if possible>
 */
public class Receiver implements Runnable {

  private Data load;

  public Receiver(Data load) {
    this.load = load;
  }

  // standard constructors

  public void run() {
    for (String receivedMessage = load.receive(); !"End".equals(receivedMessage); receivedMessage = load.receive()) {

      System.out.println("packet received: "+receivedMessage);

      // ...
      try {
        Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 5000));
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
        System.out.println("Thread interrupted");
      }
    }
  }
}
