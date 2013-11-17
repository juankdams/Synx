import org.apache.log4j.Logger;

public abstract class cNd
  implements bbk
{
  protected static final Logger K = Logger.getLogger(cNd.class);

  public final void a(bNz parambNz)
  {
    YS localYS;
    switch (dKH.aOs[parambNz.bVg().ordinal()]) {
    case 1:
    case 2:
      localYS = (YS)parambNz;

      p(localYS.akr());
      return;
    case 3:
    case 4:
      localYS = (YS)parambNz;

      q(localYS.akr());
      return;
    case 5:
      localYS = (YS)parambNz;

      c(localYS.akr(), localYS.nP());
      return;
    }

    throw new UnsupportedOperationException("Event " + parambNz.bVg() + " non pris en compte par ce visiteur");
  }

  protected void p(dsj paramdsj)
  {
  }

  protected void q(dsj paramdsj)
  {
  }

  protected void c(dsj paramdsj, short paramShort)
  {
  }
}