import org.apache.log4j.Logger;

public class akr
  implements bbk
{
  private static final Logger K = Logger.getLogger(akr.class);

  public static final akr dlo = new akr();

  public void a(bNz parambNz)
  {
    YS localYS;
    switch (bMv.aOs[parambNz.bVg().ordinal()]) {
    case 1:
      localYS = (YS)parambNz;
      if (localYS.nP() <= 0) {
        return;
      }
    case 2:
    case 3:
      localYS = (YS)parambNz;
      dsj localdsj = localYS.akr();
      if (!(localdsj instanceof gA)) {
        K.error("Ce listener ne doit être utilisé que pour des événements d'Item et non de " + localdsj.getClass(), new UnsupportedOperationException());
        return;
      }
      bOU.gUc.b(new bZk(((gA)localdsj).oi()));
    }
  }
}