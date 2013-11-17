import java.io.IOException;
import java.net.URL;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;

public class dqc extends Thread
{
  private static final Logger K = Logger.getLogger(dqc.class);
  private boolean lqZ;
  private CF SN;
  private final BlockingQueue lra = new LinkedBlockingQueue();
  private static final dqc lrb = new dqc();

  private dqc()
  {
    this.lqZ = true;
    setName("AsyncLoader");
  }

  public static dqc cXp() {
    return lrb;
  }

  public final void run()
  {
    while (this.lqZ)
      if (this.SN == null)
      {
        try {
          this.SN = ((CF)this.lra.poll(1L, TimeUnit.SECONDS)); } catch (InterruptedException localInterruptedException) {
        }
        continue;

        if (this.SN == null);
      }
      else {
        try {
          this.SN.LL();
          if (this.SN.gI())
            this.SN = null;
        }
        catch (IOException localIOException) {
          K.error("An error occurs while streaming the url " + this.SN.getURL().getPath(), localIOException);
          this.SN.LM();
          this.SN = null;
        }
        Thread.yield();
      }
  }

  public final CF k(URL paramURL) {
    CF localCF = new CF(paramURL);
    this.lra.add(localCF);
    return localCF;
  }

  public final void kill() {
    this.lqZ = false;
  }
}