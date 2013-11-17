import org.apache.log4j.Logger;

public class cFl
{
  protected static final Logger K = Logger.getLogger(cFl.class);
  private static final cFl izi = new cFl();

  private final aXt izj = new aXt();

  private long cLq = 0L;

  private static final aee izk = new bOO(new Gr());

  public static cFl cAH()
  {
    return izi;
  }

  public long cAI()
  {
    if (this.cLq == 9223372036854775807L) {
      this.cLq = 0L;
    }

    return this.cLq++;
  }

  public synchronized ZG iq(long paramLong) {
    try {
      ZG localZG = (ZG)izk.Mm();
      localZG.bD(true);
      localZG.cr(paramLong == -1L ? cAI() : paramLong);
      this.izj.c(localZG.akM(), localZG);

      return localZG;
    } catch (Exception localException) {
      K.error("Exception levée lors du checkOut d'une source audio : ", localException);
    }
    return null;
  }

  public synchronized void g(ZG paramZG) {
    try {
      if (paramZG != null) {
        aOv localaOv = paramZG.akO();
        baT.b("Removing " + paramZG.als(), localaOv == null ? -1 : localaOv.bfe());
        paramZG.bD(false);
        this.izj.remove(paramZG.akM());
        izk.y(paramZG);
      }
    } catch (Exception localException) {
      K.error("Exception levée lors du release d'une source audio : ", localException);
    }
  }

  public synchronized ZG ir(long paramLong) {
    return (ZG)this.izj.get(paramLong);
  }

  public ZG cAJ() {
    int i = -1;
    Object localObject = null;
    for (int j = this.izj.size() - 1; j >= 0; j--) {
      ZG localZG = (ZG)this.izj.hc(j);
      if (localZG.akN() > i) {
        localObject = localZG;
        i = localZG.akN();
      }
    }

    return localObject;
  }
}