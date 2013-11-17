import java.util.ArrayList;
import org.apache.log4j.Logger;

public class ckd
  implements bIH
{
  private static final Logger K = Logger.getLogger(ckd.class);
  private static final boolean DEBUG = false;
  private long fwk;
  private int aw;
  private String m_name;
  private final Xg hKB = new Xg(4);
  private final aXt hKC = new aXt();
  private final ArrayList fNJ = new ArrayList();
  private final ArrayList hKD = new ArrayList();

  private final ArrayList hKE = new ArrayList();
  private final cSi hKF = new cSi();

  private boolean hKG = false;

  private final ArrayList aBf = new ArrayList();

  private final ArrayList hKH = new ArrayList();

  private final ArrayList hKI = new ArrayList();

  private final ArrayList hKJ = new ArrayList();

  public int getId()
  {
    return this.aw;
  }

  public void d(int paramInt) {
    this.aw = paramInt;
  }

  public String getName() {
    return this.m_name;
  }

  public void setName(String paramString) {
    this.m_name = paramString;
  }

  public ArrayList cmk() {
    return this.hKD;
  }

  public ArrayList cml() {
    return this.fNJ;
  }

  public void a(dyB paramdyB) {
    this.fNJ.add(paramdyB);
  }

  public long btO() {
    return this.fwk;
  }

  public void fA(long paramLong) {
    this.fwk = paramLong;
  }

  public void clear() {
    this.fNJ.clear();
  }

  public void a(cRu paramcRu) {
    this.aBf.add(paramcRu);
  }

  public void b(cRu paramcRu) {
    this.aBf.remove(paramcRu);
  }

  public void hw(long paramLong) {
    if (this.hKD.size() == 0)
      hx(paramLong);
    else
      this.hKG = true;
  }

  private void d(aOv paramaOv)
  {
    int i = this.hKE.indexOf(paramaOv);
    if (i == -1) {
      this.hKE.add(paramaOv);
      this.hKF.add(1);
      paramaOv.a(this);
    } else {
      this.hKF.ev(i, this.hKF.wm(i) + 1);
    }
  }

  private void e(aOv paramaOv) {
    int i = this.hKE.indexOf(paramaOv);
    if (i != -1)
    {
      int j = this.hKF.wm(i);
      if (j > 1) {
        this.hKF.ev(i, j - 1);
      } else {
        this.hKE.remove(i);
        this.hKF.wH(i);
        paramaOv.b(this);
      }
    }
  }

  private void cmm()
  {
    this.hKH.clear();

    for (int i = this.fNJ.size() - 1; i >= 0; i--)
      ((dyB)this.fNJ.get(i)).v(this.hKH);
  }

  public void stop()
  {
    stop(System.currentTimeMillis());
  }

  public synchronized void stop(long paramLong)
  {
    Object localObject;
    int k;
    for (int i = this.hKB.size() - 1; i >= 0; i--) {
      localObject = (Xg)this.hKB.hc(i);
      if (localObject != null)
      {
        for (k = ((Xg)localObject).size() - 1; k >= 0; k--) {
          ArrayList localArrayList = (ArrayList)((Xg)localObject).hc(k);
          int n = 0; for (int i1 = localArrayList.size(); n < i1; n++) {
            arK localarK3 = (arK)localArrayList.get(n);
            localarK3.stop(paramLong);
            e(localarK3.akO());
          }
        }
        ((Xg)localObject).clear();
      }
    }
    for (i = this.hKC.size() - 1; i >= 0; i--) {
      localObject = (ArrayList)this.hKC.hc(i);
      if (localObject != null)
      {
        k = 0; for (int m = ((ArrayList)localObject).size(); k < m; k++) {
          arK localarK2 = (arK)((ArrayList)localObject).get(k);
          localarK2.stop(paramLong);
          e(localarK2.akO());
        }
        ((ArrayList)localObject).clear();
      }
    }
    this.hKC.clear();

    i = 0; for (int j = this.hKD.size(); i < j; i++) {
      arK localarK1 = (arK)this.hKD.get(i);
      localarK1.stop(paramLong);
      e(localarK1.akO());
    }
    this.hKD.clear();
  }

  public void play() {
    dk(System.currentTimeMillis());
  }

  public void dk(long paramLong) {
    hx(paramLong);
  }

  private void a(arK paramarK, long paramLong) {
    a(this.hKD, paramarK, paramLong);
  }

  private void a(ArrayList paramArrayList, arK paramarK, long paramLong)
  {
    paramArrayList.add(paramarK);
    paramarK.dk(paramLong);
    d(paramarK.akO());
  }

  private void b(arK paramarK, long paramLong) {
    b(this.hKD, paramarK, paramLong);
  }

  private void b(ArrayList paramArrayList, arK paramarK, long paramLong)
  {
    paramArrayList.remove(paramarK);
    paramarK.stop(paramLong);
    e(paramarK.akO());
  }

  public synchronized void a(rP paramrP, long paramLong)
  {
    this.hKI.clear();

    for (int i = this.fNJ.size() - 1; i >= 0; i--) {
      ((dyB)this.fNJ.get(i)).a(this.hKI, paramrP);
    }

    Xg localXg = (Xg)this.hKB.get(paramrP.xH());
    if (localXg == null) {
      localXg = new Xg();
      this.hKB.put(paramrP.xH(), localXg);
    }

    int j = paramrP.yp();
    ArrayList localArrayList = (ArrayList)localXg.get(j);
    if (localArrayList == null) {
      localArrayList = new ArrayList();
      localXg.put(j, localArrayList);
    }

    for (int k = localArrayList.size() - 1; k >= 0; k--) {
      arK localarK1 = (arK)localArrayList.get(k);
      if (!this.hKI.contains(localarK1)) {
        b(localArrayList, localarK1, paramLong);
      }

    }

    k = 0; for (int m = this.hKI.size(); k < m; k++) {
      arK localarK2 = (arK)this.hKI.get(k);

      if ((paramrP.ym()) && ((localarK2 instanceof cDK))) {
        cDK localcDK = (cDK)localarK2;
        localcDK.a(paramrP.yn());
      }
      if (!localArrayList.contains(localarK2))
        a(localArrayList, localarK2, paramLong);
    }
  }

  public synchronized void a(long paramLong1, cbI paramcbI, wK paramwK, long paramLong2)
  {
    this.hKJ.clear();

    for (int i = this.fNJ.size() - 1; i >= 0; i--) {
      ((dyB)this.fNJ.get(i)).a(this.hKJ, paramwK);
    }

    if (this.hKJ.size() == 0) {
      return;
    }
    ArrayList localArrayList = (ArrayList)this.hKC.get(paramLong1);

    if (localArrayList == null) {
      localArrayList = new ArrayList();
      this.hKC.c(paramLong1, localArrayList);
    }

    int j = 0; for (int k = this.hKJ.size(); j < k; j++) {
      arK localarK = ((arK)this.hKJ.get(j)).aEp();

      if ((localarK instanceof cDK)) {
        cDK localcDK = (cDK)localarK;
        localcDK.a(paramcbI);
      }
      if (!localArrayList.contains(localarK))
        a(localArrayList, localarK, paramLong2);
    }
  }

  public synchronized void E(long paramLong1, long paramLong2)
  {
    ArrayList localArrayList = (ArrayList)this.hKC.remove(paramLong1);
    if (localArrayList == null)
      return;
    int i = 0; for (int j = localArrayList.size(); i < j; i++) {
      arK localarK = (arK)localArrayList.get(i);
      localarK.stop(paramLong2);
      e(localarK.akO());
    }
  }

  private void hx(long paramLong)
  {
    cmm();

    for (int i = this.hKD.size() - 1; i >= 0; i--) {
      arK localarK1 = (arK)this.hKD.get(i);
      if (!this.hKH.contains(localarK1)) {
        b(localarK1, paramLong);
      }

    }

    i = 0; for (int j = this.hKH.size(); i < j; i++) {
      arK localarK2 = (arK)this.hKH.get(i);
      if (!this.hKD.contains(localarK2)) {
        a(localarK2, paramLong);
      }
    }

    this.hKG = false;
  }

  public synchronized void a(aOv paramaOv, long paramLong)
  {
    if (this.hKG) {
      hx(paramLong);
    }

    for (int i = this.hKD.size() - 1; i >= 0; i--)
      a(paramaOv, paramLong, this.hKD, i);
    Object localObject;
    int k;
    for (i = this.hKB.size() - 1; i >= 0; i--) {
      localObject = (Xg)this.hKB.hc(i);
      for (k = ((Xg)localObject).size() - 1; k >= 0; k--) {
        ArrayList localArrayList = (ArrayList)((Xg)localObject).hc(k);
        for (int m = localArrayList.size() - 1; m >= 0; m--) {
          a(paramaOv, paramLong, localArrayList, m);
        }
      }
    }

    for (i = this.hKC.size() - 1; i >= 0; i--) {
      localObject = (ArrayList)this.hKC.hc(i);
      for (k = ((ArrayList)localObject).size() - 1; k >= 0; k--) {
        a(paramaOv, paramLong, (ArrayList)localObject, k);
      }
    }

    i = 0; for (int j = this.aBf.size(); i < j; i++)
      ((cRu)this.aBf.get(i)).a(this);
  }

  private void a(aOv paramaOv, long paramLong, ArrayList paramArrayList, int paramInt)
  {
    arK localarK = (arK)paramArrayList.get(paramInt);

    if (localarK.akO() != paramaOv) {
      return;
    }

    if (!localarK.dl(paramLong)) {
      paramArrayList.remove(localarK);
      e(localarK.akO());
    }
  }
}