import org.apache.log4j.Logger;

public final class cYt extends dte
{
  private static Logger K = Logger.getLogger(cYt.class);
  public static final byte eSv = 0;
  public static final byte kLX = 1;
  private final int aLs;
  private final String[] aLt;

  public cYt(int paramInt, String[] paramArrayOfString)
  {
    this.aLt = paramArrayOfString;
    this.aLs = paramInt;
  }

  public boolean isValid() {
    switch (this.aLs) {
    case 0:
      return this.aLt.length == 0;
    case 1:
      return this.aLt.length == 1;
    }
    return false;
  }

  public void execute() {
    cyx localcyx = byv.bFN().aJK();
    if (localcyx == null) {
      cth.cqP().err("Pour accéder à ces commandes il faut être connecté !");
      return;
    }
    try {
      switch (this.aLs) {
      case 0:
        OQ();
        break;
      case 1:
        P(localcyx);
      }
    }
    catch (Exception localException) {
      K.error("Impossible d'executer la commande, Exception : ", localException);
    }
  }

  private void OQ()
  {
    log("-t : trigger un evenement client");
  }

  private void P(cyx paramcyx) {
    int i = Integer.parseInt(this.aLt[0]);
    dIH localdIH = new dIH();
    localdIH.cb(i);
    paramcyx.d(localdIH);
  }
}