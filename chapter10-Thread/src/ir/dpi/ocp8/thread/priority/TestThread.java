package ir.dpi.ocp8.thread.priority;

import ir.dpi.ocp8.thread.states.SleepSample;

/**
 * Author: <a href="mailto:k1.tehrani@gmail.com">Kayvan Tehrani</a>
 *
 * Description: <the description of the class for java doc by those that might use it, please use html if possible>
 */
public class TestThread {

  public static void main(String[] args) {
    SleepSample sleepSample = new SleepSample();
    Thread thread = new Thread(sleepSample);
    thread.setPriority(8);
    thread.setPriority(Thread.MAX_PRIORITY);
    thread.setPriority(Thread.MIN_PRIORITY);
    thread.start();
  }

}
