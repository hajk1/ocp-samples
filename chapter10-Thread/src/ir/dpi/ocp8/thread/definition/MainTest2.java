package ir.dpi.ocp8.thread.definition;

/**
 * Author: <a href="mailto:k1.tehrani@gmail.com">Kayvan Tehrani</a>
 *
 * Description: <the description of the class for java doc by those that might use it, please use html if possible>
 */
public class MainTest2 {

  public static void main(String[] args) {

    Runnable r = () -> {
      for (int i = 0; i < 6; i++) {
        System.out.println("Runnable running  = " + i);
//        System.out.println("Runnable running  = " + i + ", by:"+Thread.currentThread().getName());;

      }
    };

//    Thread foo = new Thread(r);
//    Thread bar= new Thread(r);
//    Thread bat= new Thread(r);
    Thread foo = new Thread(r, "foo");
    Thread bar = new Thread(r, "bar");
    Thread bat = new Thread(r, "bat");
    foo.start();
//    foo.start(); Thread can not be restarted more than once
    bar.start();
    bat.start();
  }

}
