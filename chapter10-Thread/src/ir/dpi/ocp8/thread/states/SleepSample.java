package ir.dpi.ocp8.thread.states;

/**
 * Author: <a href="mailto:k1.tehrani@gmail.com">Kayvan Tehrani</a>
 *
 * Description: <the description of the class for java doc by those that might use it, please use html if possible>
 */
public class SleepSample implements Runnable {

  public static void main(String[] args) {
    SleepSample ss = new SleepSample();
    Thread one = new Thread(ss);
    one.setName("one");
    Thread two = new Thread(ss);
    two.setName("two");
    Thread three = new Thread(ss);
    three.setName("three");
    one.start();
    two.start();
    three.start();
  }

  @Override
  public void run() {
    for (int i = 0; i < 4; i++) {
      System.out.println("Run by :" + Thread.currentThread().getName());
    }
    try {
      Thread.sleep(1000);
    } catch (InterruptedException ex) {
      System.out.println("interuped!");
    }
  }
}
