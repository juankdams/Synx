import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import org.apache.log4j.Logger;

public class cFD
{
  private static final Logger K = Logger.getLogger(cFD.class);

  public static final cFD iAd = new cFD();
  private static final int VERSION = 0;
  private final cSR iAe = new cSR();
  private final ArrayList bYx = new ArrayList();

  private int iAf = 0;

  public void init()
  {
    this.iAe.clear();
    this.bYx.clear();

    ArrayList localArrayList = cuw.ifd.a(bdD.fpz);
    int i = 0; for (int j = localArrayList.size(); i < j; i++) {
      this.iAe.put(((Bn)localArrayList.get(i)).getId(), Boolean.valueOf(false));
    }

    this.iAf = localArrayList.size();

    cAW();
    Wl();

    dLE.doY().t("gazettes", this.bYx);
    dLE.doY().t("gazettes.notRead", Integer.valueOf(this.iAf));
  }

  public boolean xF(int paramInt) {
    Boolean localBoolean = (Boolean)this.iAe.get(paramInt);
    return (localBoolean != null) && (localBoolean.booleanValue());
  }

  public void xG(int paramInt) {
    if ((!this.iAe.contains(paramInt)) || (xF(paramInt))) {
      return;
    }
    this.iAe.put(paramInt, Boolean.valueOf(true));
    cAX();
    this.iAf -= 1;

    asY localasY = xH(paramInt);
    localasY.aEZ();

    dLE.doY().t("gazettes.notRead", Integer.valueOf(this.iAf));
  }

  private void cAW() {
    String str = getFile();
    try {
      byte[] arrayOfByte = dtb.readFile(str);

      aYQ localaYQ = aYQ.V(arrayOfByte);
      int i = localaYQ.readInt();

      int j = localaYQ.readInt();
      for (int k = 0; k < j; k++) {
        int m = localaYQ.readInt();
        boolean bool = localaYQ.bnT();
        if (this.iAe.contains(m)) {
          this.iAe.put(m, Boolean.valueOf(bool));
          if (bool) {
            this.iAf -= 1;
          }
        }
      }
      localaYQ.close();
    } catch (IOException localIOException) {
      K.warn("Impossible de charger le fichier de gazettes");
    }
  }

  private void cAX()
  {
    String str = getFile();
    try {
      FileOutputStream localFileOutputStream = dtb.qd(str);
      dSw localdSw = new dSw(localFileOutputStream);
      localdSw.writeInt(0);
      localdSw.writeInt(this.iAe.size());
      for (dmn localdmn = this.iAe.yF(); localdmn.hasNext(); ) {
        localdmn.fl();
        int i = localdmn.zY();
        boolean bool = ((Boolean)localdmn.value()).booleanValue();
        localdSw.writeInt(i);
        localdSw.lu(bool);
      }
      localdSw.close();
      localFileOutputStream.close();
    } catch (IOException localIOException) {
      K.warn("Impossible de sauver le fichier de gazettes");
    }
  }

  private void Wl() {
    for (dmn localdmn = this.iAe.yF(); localdmn.hasNext(); ) {
      localdmn.fl();
      Bn localBn = cuw.ifd.wQ(localdmn.zY());
      asY localasY = new asY(localBn, zk.dI(localBn.getId()));
      this.bYx.add(localasY);
    }

    Collections.sort(this.bYx, aeo.cVo);

    int i = this.bYx.size() - 1; for (int j = this.bYx.size(); i >= 0; i--)
      ((asY)this.bYx.get(i)).kd(j - i);
  }

  private asY xH(int paramInt)
  {
    for (int i = this.bYx.size() - 1; i >= 0; i--) {
      asY localasY = (asY)this.bYx.get(i);
      if (localasY.getId() == paramInt) {
        return localasY;
      }
    }
    return null;
  }

  private static String getFile() {
    return duB.dai().dar() + "/gazettes.dat";
  }
}