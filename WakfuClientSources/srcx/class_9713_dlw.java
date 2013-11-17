import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.log4j.Logger;

public class dlw
{
  private static final Logger K = Logger.getLogger(dlw.class);

  private static final dlw liU = new dlw();

  private final cSR liV = new cSR();
  private static final int liW = 1;
  private int kYj = 0;

  public static dlw cTl()
  {
    return liU;
  }

  private void a(cDB paramcDB, cSR paramcSR) {
    paramcDB.d(this.kYj++);
    paramcSR.put(paramcDB.getId(), paramcDB);
  }

  public cDB a(int paramInt1, int paramInt2, String paramString, int paramInt3) {
    cDB localcDB = new cDB(this.kYj++, paramInt1, paramInt2, paramString, paramInt3);
    a(localcDB, this.liV);
    cTn();
    return localcDB;
  }

  public boolean d(cDB paramcDB) {
    boolean bool = this.liV.remove(paramcDB.getId()) != null;
    if (bool) {
      cTn();
    }
    return bool;
  }

  public boolean AC(int paramInt) {
    boolean bool = this.liV.remove(paramInt) != null;
    if (bool) {
      cTn();
    }
    return bool;
  }

  public cSR ej(short paramShort) {
    short s = el(paramShort);
    if (s == cTo()) {
      return this.liV;
    }

    cSR localcSR = new cSR();
    a(s, localcSR);
    return localcSR;
  }

  public void cTm() {
    a(cTo(), this.liV);
  }

  public void cTn() {
    b(cTo(), this.liV);
  }

  private void a(short paramShort, cSR paramcSR) {
    paramcSR.clear();
    if (paramShort == 0) {
      return;
    }
    String str = ek(paramShort);
    try {
      aYQ localaYQ = aYQ.V(dtb.readFile(str));
      int i = -1;

      if (localaYQ.readInt() == -1)
        i = localaYQ.readInt();
      else {
        localaYQ.setOffset(0);
      }

      int j = localaYQ.readInt();
      for (int k = 0; k < j; k++) {
        cDB localcDB = new cDB();
        localcDB.a(localaYQ, i);
        a(localcDB, paramcSR);
      }
    } catch (IOException localIOException) {
      K.warn("problème à l'ouverture des notes de carte : " + localIOException.getMessage());
    }
  }

  private static void b(short paramShort, cSR paramcSR) {
    String str = ek(paramShort);
    try {
      FileOutputStream localFileOutputStream = dtb.qd(str);
      dSw localdSw = new dSw(localFileOutputStream);
      localdSw.writeInt(-1);
      localdSw.writeInt(1);
      localdSw.writeInt(paramcSR.size());
      dmn localdmn = paramcSR.yF();
      while (localdmn.hasNext()) {
        localdmn.fl();
        ((cDB)localdmn.value()).a(localdSw, 1);
      }
      localdSw.close();
      localFileOutputStream.close();
    } catch (IOException localIOException) {
      K.warn("problème à la sauvegarde des notes de carte :" + localIOException.getMessage());
    }
  }

  private static String ek(short paramShort) {
    return duB.dai().eu(paramShort) + "/notes.dat";
  }

  public dmn yF() {
    return this.liV.yF();
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("LandMarkNoteManager");
    localStringBuilder.append("{}");
    return localStringBuilder.toString();
  }

  private short cTo() {
    short s = bOh.D();
    if (cCZ.cyZ().bMr()) {
      return s;
    }

    return el(s);
  }

  private short el(short paramShort) {
    dUx localdUx = bDk.bLI().cr(paramShort);
    return localdUx == null ? paramShort : localdUx.mrN;
  }
}