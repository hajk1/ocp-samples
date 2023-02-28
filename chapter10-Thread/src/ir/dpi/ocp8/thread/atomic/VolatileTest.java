package ir.dpi.ocp8.thread.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class VolatileTest {
  volatile int x=0;
  AtomicInteger y=new AtomicInteger(0);

  public static void main(String[] args) {
    VolatileTest test = new VolatileTest();
    Thread t1 = new Thread(new MyThread(test));
    Thread t2 =  new Thread(new MyThread(test));
    t1.start();
    t2.start();
  }


  public void increment() {
    x++;
    y.incrementAndGet();
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y.get();
  }
}
class MyThread implements Runnable{
  VolatileTest var;
  @Override
  public void run() {
    for (int i = 0; i < 1000000; i++) {
      var.increment();
    }
    System.out.println("x = " + var.getX());
    System.out.println("y = " +var.getY());
  }

  public MyThread(VolatileTest var) {
    this.var = var;
  }
}

