package ir.dpi.ocp8.thread.synch;

/**
 * Author: <a href="mailto:k1.tehrani@gmail.com">Kayvan Tehrani</a>
 *
 * Description: <the description of the class for java doc by those that might use it, please use html if possible>
 */
public class Account {

  private int balance = 50;

  public int getBalance() {
    return balance;
  }

  public void setBalance(int balance) {
    this.balance = balance;
  }

  public void withdraw(int amount) {
    setBalance(balance - amount);
  }

}
