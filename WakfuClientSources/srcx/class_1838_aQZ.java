import java.util.Enumeration;
import java.util.Vector;

public class aQZ
  implements Runnable
{
  private Vector eNN = new Vector(1);
  private long eNO = -1L;

  private volatile boolean eNP = false;
  public static final String eNQ = "timeout less than 1.";

  public aQZ(long paramLong)
  {
    if (paramLong < 1L) {
      throw new IllegalArgumentException("timeout less than 1.");
    }
    this.eNO = paramLong;
  }

  public void a(Qk paramQk)
  {
    this.eNN.addElement(paramQk);
  }

  public void b(Qk paramQk)
  {
    this.eNN.removeElement(paramQk);
  }

  protected final void bhx()
  {
    Enumeration localEnumeration = this.eNN.elements();
    while (localEnumeration.hasMoreElements())
      ((Qk)localEnumeration.nextElement()).a(this);
  }

  public synchronized void start()
  {
    this.eNP = false;
    Thread localThread = new Thread(this, "WATCHDOG");
    localThread.setDaemon(true);
    localThread.start();
  }

  public synchronized void stop()
  {
    this.eNP = true;
    notifyAll();
  }

  public synchronized void run()
  {
    long l1 = System.currentTimeMillis();
    long l2 = l1 + this.eNO;
    try
    {
      while ((!this.eNP) && (l2 > l1)) {
        wait(l2 - l1);
        l1 = System.currentTimeMillis();
      }
    }
    catch (InterruptedException localInterruptedException) {
    }
    if (!this.eNP)
      bhx();
  }
}