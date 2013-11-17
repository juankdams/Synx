import com.ankamagames.wakfu.client.WakfuClient;
import com.ankamagames.wakfu.client.WakfuClientInstance;
import org.apache.log4j.Logger;

public class bZC
  implements Runnable
{
  public bZC(WakfuClient paramWakfuClient, WakfuClientInstance paramWakfuClientInstance)
  {
  }

  public void run()
  {
    try
    {
      this.hqc.initialize();
    }
    catch (Throwable localThrowable)
    {
      WakfuClient.ch().fatal("Erreur au lancement", localThrowable);

      System.exit(1);
    }
  }
}