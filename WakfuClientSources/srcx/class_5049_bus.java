import org.apache.log4j.Logger;

public final class bus extends dte
{
  private static final Logger K = Logger.getLogger(bus.class);
  public static final int HELP = 0;
  public static final int gdN = 1;
  private int aLs;
  private String[] aLt;

  public bus(int paramInt, String[] paramArrayOfString)
  {
    this.aLs = paramInt;
    this.aLt = paramArrayOfString;
  }

  public boolean isValid()
  {
    switch (this.aLs) {
    case 1:
      return this.aLt.length == 0;
    case 0:
      return true;
    }
    return false;
  }

  public void execute()
  {
    cyx localcyx = byv.bFN().aJK();
    if (localcyx == null) {
      cth.cqP().err("Pour accéder à ces commandes il faut être connecté !");
      return;
    }
    try {
      switch (this.aLs) {
      case 1:
        I(localcyx);
        break;
      case 0:
        OQ();
      }
    }
    catch (Exception localException) {
      cth.cqP().err("Problème lors de l'execution d'une commande de calendrier " + localException);
    }
  }

  private void I(cyx paramcyx) {
    aIG localaIG = new aIG();
    localaIG.bM((byte)3);
    localaIG.bf((short)123);
    paramcyx.d(localaIG);
  }

  private void OQ() {
    log("-restat : active le restat des sorts");
  }
}