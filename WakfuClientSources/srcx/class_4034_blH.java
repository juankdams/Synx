import org.apache.log4j.Logger;

public class blH
  implements cvW
{
  protected static final Logger K = Logger.getLogger(blH.class);

  public static final blH fCO = new blH();

  public void a(aqv paramaqv, boolean paramBoolean) {
  }

  public void b(aqv paramaqv, boolean paramBoolean) {
  }

  public boolean a(cWG paramcWG) {
    switch (paramcWG.getId()) {
    case 2063:
      cBy localcBy = (cBy)paramcWG;
      long l = System.currentTimeMillis() - localcBy.cKB();
      dDE.dft().eh(localcBy.bcB() + l);
      dDE.dft().start(1000L);
      dDE.dft().run();
      return false;
    }

    return true;
  }

  public long getId() {
    return 0L;
  }

  public void a(long paramLong)
  {
  }
}