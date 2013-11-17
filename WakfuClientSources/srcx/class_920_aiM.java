import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.log4j.Logger;

public class aiM
{
  public static final aiM dgK = new aiM();
  private static final Logger K = Logger.getLogger(aiM.class);
  private static final int VERSION = 1;
  private final cSR dgL = new cSR();

  private static String getFile()
  {
    return duB.dai().dat() + "/questConfig.dat";
  }

  public void avA() {
    this.dgL.clear();
    String str = getFile();
    try {
      aYQ localaYQ = aYQ.V(dtb.readFile(str));
      int i = localaYQ.readInt();

      int j = localaYQ.readInt();
      for (int k = 0; k < j; k++) {
        alg localalg = new alg();
        int m = localaYQ.readInt();
        localalg.a(localaYQ, i);
        this.dgL.put(m, localalg);
      }
    } catch (IOException localIOException) {
      K.warn("problème à l'ouverture des configs de quêtes: " + localIOException.getMessage());
    }
  }

  public void avB() {
    String str = getFile();
    try {
      FileOutputStream localFileOutputStream = dtb.qd(str);
      dSw localdSw = new dSw(localFileOutputStream);
      localdSw.writeInt(1);
      localdSw.writeInt(this.dgL.size());
      dmn localdmn = this.dgL.yF();
      while (localdmn.hasNext()) {
        localdmn.fl();
        localdSw.writeInt(localdmn.zY());
        ((alg)localdmn.value()).a(localdSw, 1);
      }
      localdSw.close();
      localFileOutputStream.close();
    } catch (IOException localIOException) {
      K.warn("problème à la sauvegarde des configs de quêtes :" + localIOException.getMessage());
    }
  }

  public void k(int paramInt, boolean paramBoolean) {
    alg localalg = (alg)this.dgL.get(paramInt);
    if (localalg == null) {
      localalg = new alg();
      this.dgL.put(paramInt, localalg);
    }

    localalg.cq(paramBoolean);

    avB();
  }

  public boolean iJ(int paramInt)
  {
    alg localalg = (alg)this.dgL.get(paramInt);

    return localalg == null ? true : localalg.axS();
  }

  public void iK(int paramInt) {
    this.dgL.remove(paramInt);

    avB();
  }

  public String toString()
  {
    return new sT(this).e("m_configs", this.dgL).toString();
  }
}