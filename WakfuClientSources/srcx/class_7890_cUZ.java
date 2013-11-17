import java.util.ArrayList;
import org.apache.log4j.Logger;

public class cUZ extends dOb
  implements bBz
{
  private static final Logger K = Logger.getLogger(cUZ.class);

  private ArrayList cMd = new ArrayList();
  private ArrayList kHD = new ArrayList();
  private ArrayList kHE = new ArrayList();
  private Object aNy;
  private static final bOO aCJ = new bOO(new aWZ());

  public static cUZ a(int paramInt1, int paramInt2, int paramInt3, cew paramcew, dtq paramdtq)
  {
    try
    {
      cUZ localcUZ = (cUZ)aCJ.Mm();
      localcUZ.tX(paramInt1);
      localcUZ.tY(paramInt2);
      localcUZ.tZ(paramInt3);
      if (paramdtq.cZC() > 0) {
        localcUZ.cMd.add(paramcew);
        localcUZ.kHD.add(paramdtq);
        localcUZ.kHE.add(Boolean.valueOf(false));
      }

      return localcUZ;
    }
    catch (Exception localException) {
      throw new RuntimeException("Erreur lors d'un checkOut : ", localException);
    }
  }

  public void release()
  {
    try {
      aCJ.y(this);
    } catch (Exception localException) {
      K.error("Exception dans le release de " + getClass().toString() + "(normalement impossible)");
    }
  }

  public void aJ() {
    this.aNy = new Object();
  }

  public void bc() {
    this.cMd.clear();
    this.kHD.clear();
    this.kHE.clear();
    this.aNy = null;
  }

  private cUZ() {
    super(0, 0, 0);
  }

  protected long mC() {
    for (int i = this.cMd.size() - 1; i >= 0; i--) {
      cew localcew = (cew)this.cMd.get(i);
      K.info("onRun :" + localcew.getId());
      localcew.b(this);
      localcew.a((dtq)this.kHD.get(i));
    }
    return 7000L;
  }

  protected void kO() {
    release();
  }

  public void b(dMM paramdMM, int paramInt1, int paramInt2, short paramShort)
  {
    synchronized (this.aNy) {
      paramdMM.c(this);
      int i = 1;
      for (int j = this.cMd.size() - 1; j >= 0; j--)
      {
        if (this.cMd.get(j) == paramdMM) {
          K.info("pathEnded :" + ((cew)this.cMd.get(j)).getId());
          this.kHE.remove(j);
          this.kHE.add(j, Boolean.valueOf(true));
        }
        if (!((Boolean)this.kHE.get(j)).booleanValue()) {
          i = 0;
          K.info("all finish :" + ((cew)this.cMd.get(j)).getId());
        }
      }

      if (i == 1) {
        cAo.cxf().ia(this.aPT);
        bZw();
      }
    }
  }

  public void a(cew paramcew, dtq paramdtq) {
    if (paramdtq.cZC() > 0) {
      this.cMd.add(paramcew);
      this.kHD.add(paramdtq);
      this.kHE.add(Boolean.valueOf(false));
    }
  }
}