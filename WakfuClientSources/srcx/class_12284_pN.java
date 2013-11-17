import java.util.LinkedList;
import java.util.Queue;
import org.apache.log4j.Logger;

public final class pN extends Thread
{
  protected static final Logger K = Logger.getLogger(pN.class);
  private static pN aWt;
  private static final Object aNy = new Object();

  private final Queue aWu = new LinkedList();
  private volatile boolean aKV = false;

  public static boolean aWv = false;

  public static void xa()
  {
    try
    {
      if ((!aWv) && (ay.bd().getBoolean("autoLogin"))) {
        aWv = true;
        aWt = new pN();
        aWt.start();
      }
    }
    catch (bdh localbdh)
    {
    }
  }

  public static void c(cWG paramcWG) {
    if (aWt == null) {
      return;
    }
    try
    {
      switch (paramcWG.getId())
      {
      case 1024:
        synchronized (aNy) {
          aWt.aWu.add(new dpy());
        }

        break;
      case 2048:
        synchronized (aNy) {
          aWt.aWu.add(new dpz());
        }

        break;
      case 4100:
        synchronized (aNy) {
          aWt.aWu.add(new dpA());
        }

      }

    }
    catch (Exception localException)
    {
      K.error("Exception levée dans l'AutoLogin:", localException);
    }
  }

  public void run()
  {
    setName("AutoLogin");
    K.info("Démarrage de l'AutoLogin.");
    synchronized (aNy) {
      this.aWu.add(new dpB(this));
    }

    this.aKV = true;

    while (this.aKV) {
      try {
        Thread.sleep(200L);
      } catch (InterruptedException localInterruptedException) {
        K.warn("Interrupted.");
      }
      if (!this.aWu.isEmpty()) {
        ((Runnable)this.aWu.remove()).run();
      }
    }

    K.info("Fin de l'AutoLogin.");
  }
}