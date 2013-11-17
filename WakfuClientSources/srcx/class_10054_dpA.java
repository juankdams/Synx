import org.apache.log4j.Logger;

final class dpA
  implements Runnable
{
  public void run()
  {
    try
    {
      Thread.sleep(5000L);
      pN.a(pN.xb(), false);
    } catch (Exception localException) {
      pN.K.error("Erreur lors de l'arrêt de l'AutoLogin.");
    }
  }
}