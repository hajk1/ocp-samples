package ir.dpi.ocp8.thread.w8nty;

/**
 * Author: <a href="mailto:k1.tehrani@gmail.com">Kayvan Tehrani</a>
 *
 * Description: <the description of the class for java doc by those that might use it, please use html if possible>
 */
public class Data {

  private String packet;

  // True if receiver should wait
  // False if sender should wait
  private boolean transfer = true;

  public synchronized void send(String packet) {
    while (!transfer) {
      try {
        wait();
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
        System.out.println("Thread interrupted");
      }
    }
    transfer = false;

    this.packet = packet;
    System.out.println("sent packet finished= " + packet);
    notifyAll();
  }

  public synchronized String receive() {
    while (transfer) {
      try {
        wait();
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
        System.out.println("Thread interrupted");
      }
    }
    transfer = true;
    System.out.println("packet receive finished= " + packet);
    notifyAll();
    return packet;
  }
}
