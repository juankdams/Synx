import java.util.ArrayList;
import org.apache.log4j.Logger;

public final class cXC extends dte
{
  private static final Logger K = Logger.getLogger(bus.class);
  public static final int HELP = 0;
  public static final int kLj = 1;
  public static final int kLk = 2;
  private int aLs;
  private String[] aLt;

  public cXC(int paramInt, String[] paramArrayOfString)
  {
    this.aLs = paramInt;
    this.aLt = paramArrayOfString;
  }

  public boolean isValid()
  {
    switch (this.aLs) {
    case 1:
    case 2:
      return this.aLt.length == 1;
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
        activate();
        break;
      case 2:
        cLm();
        break;
      case 0:
        OQ();
      }
    }
    catch (Exception localException) {
      cth.cqP().err("Problème lors de l'execution d'une commande de calendrier " + localException);
    }
  }

  private void cLm() {
    Ig localIg = cwy.dU(cwy.iiE.getId(), 0);
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(new ciM(Integer.parseInt(this.aLt[0])));
    localArrayList.add(new bBB(false));
    localIg.k(localArrayList);
    localIg.execute();
  }

  private void activate() {
    Ig localIg = cwy.dU(cwy.iiE.getId(), 0);
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(new ciM(Integer.parseInt(this.aLt[0])));
    localArrayList.add(new bBB(true));
    localIg.k(localArrayList);
    localIg.execute();
  }

  private void OQ() {
    log("cge ('-activate' | '-a') id : active l'evenement id");
    log("cge ('-inactivate' | '-i') id : désactive l'evenement id");
  }
}