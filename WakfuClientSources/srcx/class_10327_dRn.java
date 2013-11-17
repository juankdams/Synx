import java.util.ArrayList;
import java.util.Collections;

public class dRn
{
  private ArrayList aDd = new ArrayList();
  private cwt mmj;
  private int aEf;
  private int aEh;
  private int aEg;
  private int aEi;
  private int cyp;
  private int cyq;
  private int mmk = 2147483647; private int mml = -2147483648; private int mmm = 2147483647; private int mmn = -2147483648;
  private boolean dBi = false;
  private int mmo;
  private float cfH = 1.0F;
  private dDq bQC = null;
  private boolean aYZ = true;
  private float mmp;
  private float mmq;

  public dRn()
  {
    this.aEf = (this.aEg = 2147483647);
    this.aEh = (this.aEi = -2147483648);
  }

  public ArrayList nw() {
    return this.aDd;
  }

  public void c(cwt paramcwt) {
    this.mmj = paramcwt;
  }

  public void a(short paramShort1, short paramShort2, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7, float paramFloat8)
  {
    this.aDd.add(new dth(paramShort1, paramShort2, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramFloat7, paramFloat8));

    this.aEf = Math.min(this.aEf, paramShort1);
    this.aEh = Math.max(this.aEh, paramShort1);
    this.aEg = Math.min(this.aEg, paramShort2);
    this.aEi = Math.max(this.aEi, paramShort2);

    P((int)paramFloat1, (int)paramFloat4, (int)paramFloat5, (int)paramFloat8);
  }

  private void P(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.mmk = Math.min(this.mmk, paramInt1);
    this.mml = Math.max(this.mml, paramInt3);
    this.mmm = Math.min(this.mmm, paramInt4);
    this.mmn = Math.max(this.mmn, paramInt2);
  }

  public void alD() {
    Collections.sort(this.aDd);
    int i = (this.aEf + this.aEh) / 2;
    int j = (this.aEg + this.aEi) / 2;
    Object localObject = null;

    this.mmk = (this.mmm = 2147483647);
    this.mml = (this.mmn = -2147483648);
    dth localdth;
    for (int k = this.aDd.size() - 1; k >= 0; k--) {
      localdth = (dth)this.aDd.get(k);
      P((int)localdth.getX1(), (int)localdth.getY2(), (int)localdth.cZq(), (int)localdth.cZt());
      if ((dth.f(localdth) == i) && (dth.g(localdth) == j)) {
        localObject = localdth;
        break;
      }
    }

    if ((localObject == null) && (this.aDd.size() > 0)) {
      for (k = this.aDd.size() / 2; k >= 0; k--) {
        localdth = (dth)this.aDd.get(k);
        if (dth.f(localdth) == i) {
          localObject = localdth;
          break;
        }
      }
    }

    if ((localObject == null) && (this.aDd.size() > 0)) {
      localObject = (dth)this.aDd.get(this.aDd.size() / 2);
    }

    if (localObject != null) {
      this.cyp = dth.f((dth)localObject);
      this.cyq = dth.g((dth)localObject);
      this.mmp = ((((dth)localObject).getX1() + ((dth)localObject).cZq()) / 2.0F);
      this.mmq = ((((dth)localObject).getY1() + ((dth)localObject).cZr()) / 2.0F);
    }
  }

  public boolean contains(int paramInt1, int paramInt2) {
    int i = 0; for (int j = this.aDd.size(); i < j; i++) {
      if ((((dth)this.aDd.get(i)).nx() == paramInt1) && (((dth)this.aDd.get(i)).ny() == paramInt2)) {
        return true;
      }
    }

    return false;
  }

  dth aM(int paramInt1, int paramInt2) {
    int i = 0; for (int j = this.aDd.size(); i < j; i++) {
      dth localdth = (dth)this.aDd.get(i);
      if ((dth.f(localdth) == paramInt1) && (dth.g(localdth) == paramInt2)) {
        return localdth;
      }
    }

    return null;
  }

  public float[] cZy() {
    float[] arrayOfFloat = new float[this.aDd.size() * 8];
    int i = 0; for (int j = this.aDd.size(); i < j; i++) {
      dth localdth = (dth)this.aDd.get(i);
      arrayOfFloat[(i * 8)] = localdth.lvB;
      arrayOfFloat[(i * 8 + 1)] = localdth.lvC;
      arrayOfFloat[(i * 8 + 2)] = localdth.lvD;
      arrayOfFloat[(i * 8 + 3)] = localdth.lvE;
      arrayOfFloat[(i * 8 + 4)] = localdth.lvF;
      arrayOfFloat[(i * 8 + 5)] = localdth.lvG;
      arrayOfFloat[(i * 8 + 6)] = localdth.lvH;
      arrayOfFloat[(i * 8 + 7)] = localdth.lvI;
    }

    return arrayOfFloat;
  }

  public void a(jY paramjY) {
    for (int i = this.aEf - 1; i < this.aEh + 1; i++)
      for (int j = this.aEg - 1; j < this.aEi + 1; j++) {
        dth localdth1 = aM(i, j);
        dth localdth2 = aM(i, j + 1);
        dth localdth3 = aM(i + 1, j);

        if (localdth1 == null) {
          if (localdth2 != null) {
            paramjY.add(localdth2.lvD);
            paramjY.add(localdth2.lvE);
            paramjY.add(localdth2.lvF);
            paramjY.add(localdth2.lvG);
          }
          if (localdth3 != null) {
            paramjY.add(localdth3.lvB);
            paramjY.add(localdth3.lvC);
            paramjY.add(localdth3.lvD);
            paramjY.add(localdth3.lvE);
          }
        } else {
          if (localdth2 == null) {
            paramjY.add(localdth1.lvB);
            paramjY.add(localdth1.lvC);
            paramjY.add(localdth1.lvH);
            paramjY.add(localdth1.lvI);
          }
          if (localdth3 == null) {
            paramjY.add(localdth1.lvF);
            paramjY.add(localdth1.lvG);
            paramjY.add(localdth1.lvH);
            paramjY.add(localdth1.lvI);
          }
        }
      }
  }

  public int getMinX()
  {
    return this.aEf;
  }

  public int KW() {
    return this.aEh;
  }

  public int getMinY() {
    return this.aEg;
  }

  public int KX() {
    return this.aEi;
  }

  public bNa getColor() {
    return this.mmj.aqU();
  }

  public String aqW() {
    return this.mmj.aqW();
  }

  public boolean isSelected() {
    return this.dBi;
  }

  public void setSelected(boolean paramBoolean) {
    if (this.dBi == paramBoolean) {
      return;
    }
    this.dBi = paramBoolean;
  }

  public int dsa() {
    return this.mmo;
  }

  public void DM(int paramInt) {
    this.mmo = paramInt;
  }

  public float getLineWidth() {
    return this.cfH;
  }

  public void setLineWidth(float paramFloat) {
    this.cfH = paramFloat;
  }

  public int dsb() {
    return this.cyp;
  }

  public int dsc() {
    return this.cyq;
  }

  public float dsd() {
    return this.mmp;
  }

  public float dse() {
    return this.mmq;
  }

  public int dsf() {
    return this.mmk;
  }

  public int dsg() {
    return this.mml;
  }

  public int dsh() {
    return this.mmm;
  }

  public int dsi() {
    return this.mmn;
  }

  public dDq getPixmap() {
    return this.bQC;
  }

  public void setPixmap(dDq paramdDq) {
    this.bQC = paramdDq;
  }

  public void cleanUp() {
    if ((this.bQC != null) && (this.bQC.hN() != null)) {
      this.bQC.hN().axl();
      this.bQC = null;
    }
  }

  public cwt dsj() {
    return this.mmj;
  }

  public boolean isVisible() {
    return this.aYZ;
  }

  public void setVisible(boolean paramBoolean) {
    this.aYZ = paramBoolean;
  }
}