import com.ankamagames.framework.graphics.engine.Anm2.Anm;
import com.ankamagames.framework.graphics.engine.Anm2.Anm.ObjectFactory;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Semaphore;
import org.apache.log4j.Logger;

public final class bOE
{
  public static final Logger K = Logger.getLogger(bOE.class);
  private static final boolean gTI = true;
  private final HashMap gTJ;
  private boolean gTK;
  private boolean gTL;
  private final Semaphore gTM;
  private static final bOE gTN = new bOE();

  private bOE()
  {
    this.gTJ = new HashMap();
    this.gTM = new Semaphore(1);
    this.gTK = true;
    this.gTL = false;
  }

  public static bOE bVz()
  {
    return gTN;
  }

  public void gt(boolean paramBoolean) {
    this.gTK = paramBoolean;
  }

  public boolean bVA() {
    return this.gTK;
  }

  public boolean bVB() {
    return this.gTL;
  }

  public void gu(boolean paramBoolean) {
    this.gTL = paramBoolean;
  }

  public void kg(String paramString) {
    QX.log("animation", paramString);
    try {
      aYQ localaYQ = aYQ.V(dtb.readFile(paramString));
      long l = 0L;
      int i = 0;
      int j = localaYQ.readInt();
      for (int k = 0; k < j; k++) {
        int m = localaYQ.readShort() & 0xFFFF;
        byte[] arrayOfByte = localaYQ.ot(m);
        String str = dzp.aJ(arrayOfByte);
        Anm localAnm = C(str, false);
        localAnm.gQ();

        K.trace("préchargement des anms: " + str);
        l += dtb.readFile(str).length;
        i++;
      }

      localaYQ.close();

      K.trace("préchargement des anms: " + i + " fichiers (" + l / 1024L + "ko)");
    }
    catch (IOException localIOException) {
      K.error("Error while loading Common Animations :", localIOException);
    }
  }

  public dR B(String paramString, boolean paramBoolean) {
    Anm localAnm = C(paramString, paramBoolean);
    if (localAnm == null)
      return null;
    String str1 = dtb.pY(paramString);
    String str2 = dtb.pW(paramString);
    return new dR(localAnm, str1, str2);
  }

  public Anm C(String paramString, boolean paramBoolean) { this.gTM.acquireUninterruptibly();
    Anm localAnm;
    try {
      localAnm = (Anm)this.gTJ.get(paramString);
      if (localAnm == null) {
        localAnm = (Anm)Anm.Sy.bQy();
        localAnm.b(paramString, paramBoolean);
        this.gTJ.put(paramString, localAnm);
      }
    } finally {
      this.gTM.release();
    }
    return localAnm; }

  public void kh(String paramString)
  {
    Anm localAnm = (Anm)this.gTJ.remove(paramString);
    if (localAnm == null)
      return;
    localAnm.axl();
  }

  public void a(String paramString, vp paramvp, dR paramdR) {
    if ((!bB) && (paramdR == null)) throw new AssertionError();
    if ((!bB) && (paramvp == null)) throw new AssertionError();

    String str = paramdR.getPath() + paramString + ".anm";
    Anm localAnm = (Anm)this.gTJ.get(str);
    if (localAnm == null) {
      try {
        localAnm = C(str, this.gTK);
      }
      catch (IOException localIOException) {
        K.error("Unable to load file " + str, localIOException);
      }
    }

    if (localAnm == null) {
      paramdR.a(null, null);
      return;
    }

    if (localAnm.gI()) {
      paramdR.a(localAnm, localAnm.ad(paramvp.bjv));
    } else {
      paramdR.UO = paramvp.m_name;
      paramdR.a(null, null);
    }
  }

  public void bVC() {
    update(0);
  }

  public void update(int paramInt) {
    this.gTM.acquireUninterruptibly();
    Set localSet = this.gTJ.entrySet();
    Iterator localIterator = localSet.iterator();

    for (int i = this.gTJ.size(); i > 0; i--) {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      Anm localAnm = (Anm)localEntry.getValue();

      if (!localAnm.gI())
        try {
          localAnm.update();
        } catch (IOException localIOException) {
          K.error("Exception", localIOException);
        }
      else {
        localAnm.gS();
      }
      if (localAnm.gR() <= 0) {
        if ((!bB) && (localAnm.bpu() != 0)) throw new AssertionError();
        localAnm.axl();
        localIterator.remove();
      }
    }
    this.gTM.release();
  }

  public void bVD() {
    this.gTM.acquireUninterruptibly();
    Set localSet = this.gTJ.entrySet();
    Iterator localIterator = localSet.iterator();

    for (int i = this.gTJ.size(); i > 0; i--) {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      Anm localAnm = (Anm)localEntry.getValue();

      if (!localAnm.gI()) {
        try {
          localAnm.update();
        } catch (IOException localIOException) {
          K.error("Exception", localIOException);
        }
      }
      else if (localAnm.bpu() == 0) {
        localAnm.axl();
        localIterator.remove();
      }
    }

    this.gTM.release();
  }
}