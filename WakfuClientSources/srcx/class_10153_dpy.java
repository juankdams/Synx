import java.util.Collection;
import java.util.Iterator;
import org.apache.log4j.Logger;

final class dpy
  implements Runnable
{
  public void run()
  {
    try
    {
      Thread.sleep(500L);

      dCZ localdCZ = new dCZ();
      localdCZ.b((dHb)bbf.bpt().cnp().iterator().next());
      localdCZ.d(16501);
      cjO.clE().j(localdCZ);
    } catch (Exception localException) {
      pN.K.error("Erreur lors de l'entrée dans le monde.");
      pN.a(pN.xb(), false);
    }
  }
}