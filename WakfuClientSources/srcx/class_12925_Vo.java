import java.util.ArrayList;
import org.apache.log4j.Logger;

public class Vo
{
  private static final Logger K = Logger.getLogger(Vo.class);
  public static final float cAe = 43.0F;
  public static final float cAf = 21.5F;
  private final cAY cAg;
  private final cSR cAh = new cSR();
  private final cSi cAi = new cSi();
  private dRn cAj;
  private dRn cAk;

  public Vo(cAY paramcAY)
  {
    this.cAg = paramcAY;
  }

  public dRn aF(int paramInt1, int paramInt2) {
    dmn localdmn = this.cAh.yF();
    while (localdmn.hasNext()) {
      localdmn.fl();
      ZT localZT = (ZT)localdmn.value();
      ArrayList localArrayList = localZT.getChildren();
      int i = 0; for (int j = localArrayList.size(); i < j; i++) {
        dRn localdRn = (dRn)localArrayList.get(i);
        if (localdRn.contains(paramInt1, paramInt2)) {
          return localdRn;
        }
      }
    }

    return null;
  }

  public dRn aG(int paramInt1, int paramInt2) {
    return aF(oU.bV(paramInt1), oU.bW(paramInt2));
  }

  public void clear()
  {
    this.cAh.s(new bAQ(this));

    a(null);
  }

  public void e(float paramFloat1, float paramFloat2, float paramFloat3) {
    int i = 774;
    int j = 387;

    dmn localdmn = this.cAh.yF();
    while (localdmn.hasNext()) {
      localdmn.fl();
      ZT localZT = (ZT)localdmn.value();
      localZT.C(paramFloat1);
      a(paramFloat2, paramFloat3, 774, 387, localZT);
    }
  }

  private static void a(float paramFloat1, float paramFloat2, int paramInt1, int paramInt2, ZT paramZT) {
    ArrayList localArrayList1 = paramZT.getChildren();

    for (int i = localArrayList1.size() - 1; i >= 0; i--) {
      dRn localdRn = (dRn)localArrayList1.get(i);
      ArrayList localArrayList2 = localdRn.nw();

      for (int j = localArrayList2.size() - 1; j >= 0; j--) {
        dth localdth = (dth)localArrayList2.get(j);
        int k = localdth.nx();
        int m = localdth.ny();

        int n = k * 18;
        int i1 = m * 18;

        float f1 = (n - i1) * 43.0F + paramFloat1;
        float f2 = -(n + i1) * 21.5F + paramFloat2;

        localdth.setX1(f1 - paramInt1);
        localdth.setY1(f2 - paramInt2);
        localdth.setX2(f1);
        localdth.setY2(f2);
        localdth.dm(f1 + paramInt1);
        localdth.dn(f2 - paramInt2);
        localdth.jdMethod_do(f1);
        localdth.dp(f2 - 2 * paramInt2);
      }

      localdRn.alD();
    }
  }

  public dRn getSelectedMapZone() {
    return this.cAj;
  }

  public void aH(int paramInt1, int paramInt2) {
    if ((this.cAj != null) && (this.cAj.contains(paramInt1, paramInt2))) {
      return;
    }

    a(aF(paramInt1, paramInt2));
  }

  public void a(dRn paramdRn) {
    if (this.cAj == paramdRn) {
      return;
    }

    if (this.cAj != null) {
      this.cAj.setSelected(false);
    }

    this.cAj = paramdRn;

    if (this.cAj != null) {
      this.cAj.setSelected(true);
    }

    if (this.cAg != null)
      this.cAg.rn(this.cAj != null ? this.cAj.dsj().aqV() : -1);
  }

  public void aiA()
  {
    dmn localdmn = this.cAh.yF();
    while (localdmn.hasNext()) {
      localdmn.fl();
      this.cAi.add(localdmn.zY());
    }
  }

  public void gZ(int paramInt) {
    this.cAi.add(paramInt);
  }

  public void setPlayerMapZone(int paramInt1, int paramInt2) {
    dRn localdRn = aG(paramInt1, paramInt2);
    if (localdRn == this.cAk) {
      return;
    }

    if (this.cAk != null) {
      this.cAk.setLineWidth(1.0F);
      this.cAg.j(this.cAk.dsa(), 1.0F);
    }

    this.cAk = localdRn;

    if (this.cAk != null) {
      this.cAk.setLineWidth(3.0F);
      this.cAg.j(this.cAk.dsa(), 5.0F);
    }
  }

  public void aiB() {
    if (this.cAk != null)
      this.cAg.j(this.cAk.dsa(), 5.0F);
  }

  public boolean aiC()
  {
    return !this.cAh.isEmpty();
  }

  public void aiD() {
    int i = 0; for (int j = this.cAi.size(); i < j; i++) {
      int k = this.cAi.wm(i);
      this.cAg.gZ(k);
      ZT localZT = (ZT)this.cAh.remove(k);
      if ((localZT != null) && (localZT.getPixmap() != null) && (localZT.getPixmap().hN() != null)) {
        localZT.cleanUp();
      }
    }

    this.cAi.clear();
    a(null);
  }

  public void a(float paramFloat, cSR paramcSR, bjI parambjI) {
    dmn localdmn = this.cAh.yF();
    while (localdmn.hasNext()) {
      localdmn.fl();
      ((ZT)localdmn.value()).C(paramFloat);
      ArrayList localArrayList = ((ZT)localdmn.value()).getChildren();
      int i = 0; for (int j = localArrayList.size(); i < j; i++) {
        dRn localdRn = (dRn)localArrayList.get(i);
        cwt localcwt = localdRn.dsj();
        int k = localcwt.getId();
        bNa localbNa = localcwt.aqU();
        byte b = localcwt.aqV();
        paramcSR.put(k, localbNa);
        parambjI.o(k, b);
      }
    }
  }

  public void a(int paramInt, ZT paramZT) {
    this.cAh.put(paramInt, paramZT);
    Cu.b(this.cAi, paramInt);
  }

  public boolean h(int paramInt, boolean paramBoolean) {
    dmn localdmn = this.cAh.yF();
    while (localdmn.hasNext()) {
      localdmn.fl();
      ZT localZT = (ZT)localdmn.value();
      if (!this.cAi.contains(localdmn.zY()))
      {
        ArrayList localArrayList = localZT.getChildren();
        int i = 0; for (int j = localArrayList.size(); i < j; i++) {
          dRn localdRn = (dRn)localArrayList.get(i);
          if (localdRn.dsj().getId() == paramInt) {
            localdRn.setVisible(paramBoolean);
            return true;
          }
        }
      }
    }
    return false;
  }

  public static ZT a(aQI paramaQI, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    ZT localZT = new ZT(paramaQI);
    localZT.C(paramFloat1);

    ArrayList localArrayList = paramaQI.getChildren();
    int i = 0; for (int j = localArrayList.size(); i < j; i++) {
      cwt localcwt = (cwt)localArrayList.get(i);
      dRn localdRn = new dRn();

      localdRn.c(localcwt);

      int k = 774;
      int m = 387;

      Dg localDg = localcwt.aTP();

      if (localDg != null) {
        localObject = localDg.Ms().apz();
        while (((kr)localObject).hasNext()) {
          int n = ((kr)localObject).next();
          short s1 = Xv.he(n);
          short s2 = Xv.hf(n);

          int i1 = s1 * 18;
          int i2 = s2 * 18;

          float f1 = (i1 - i2) * 43.0F + paramFloat2;
          float f2 = -(i1 + i2) * 21.5F + paramFloat3;

          localdRn.a(s1, s2, f1 - 774.0F, f2 - 387.0F, f1, f2, f1 + 774.0F, f2 - 387.0F, f1, f2 - 774.0F);
        }

        localdRn.alD();
      }

      Object localObject = localcwt.fJ();
      if (localObject != null) {
        uz localuz = null;
        try {
          localuz = atz.fK((String)localObject);
        } catch (Exception localException) {
          K.error("Problème lors de la récupération de la texture d'iconUrl");
        }

        if (localuz != null) {
          localdRn.setPixmap(new dDq(localuz));
        }

      }

      localZT.b(localdRn);
    }

    localZT.alD();
    return localZT;
  }
}