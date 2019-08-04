package ir.dpi.ocp8.thread.w8nty;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Author: <a href="mailto:k1.tehrani@gmail.com">Kayvan Tehrani</a>
 *
 * Description: <the description of the class for java doc by those that might use it, please use html if possible>
 */
public class Sender implements Runnable {

  private Data data;

  public Sender(Data data) {
    this.data = data;
  }

  // standard constructors

  public void run() {
    String[] packets = {
        "First packet",
        "Second packet",
        "Third packet",
        "Fourth packet",
        "End"
    };

    for (String packet : packets) {
      data.send(packet);

      // Thread.sleep() to mimic heavy server-side processing
      try {
        Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 5000));
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
        System.out.println("Thread interrupted");
      }
    }
  }
}
