import java.util.ArrayList;
import org.apache.log4j.Logger;

public class cyz
  implements bSl
{
  private static final Logger K = Logger.getLogger(cyz.class);
  private final bSl imU;
  private final UG iM;
  private final ArrayList imV = new ArrayList();
  private final cSi imW = new cSi();

  public cyz(bSl parambSl, UG paramUG) {
    this.imU = parambSl;
    this.iM = paramUG;
  }

  public void cvx() {
    this.imV.clear();
    this.imW.clear();
  }

  public void a(bSl parambSl, int paramInt) {
    if (!this.imV.contains(parambSl)) {
      this.imV.add(parambSl);
      this.imW.add(paramInt);
    }
  }

  public int cvy() {
    return this.imV.size();
  }

  public float atu() {
    return 0.0F;
  }

  public short fc() {
    return (short)bCO.bD(getAltitude());
  }

  public float getAltitude() {
    int i = this.imV.size();

    int j = 0;
    float f = 0.0F;
    for (int k = 0; k < i; k++)
      if (d((bSl)this.imV.get(k)))
      {
        int m = this.imW.get(k);
        f += ((bSl)this.imV.get(k)).getAltitude() * m;
        j += m;
      }
    if (j == 0) {
      K.error("Aucune target définie");
      return this.imU.getAltitude();
    }
    return f / j;
  }

  public int fa() {
    return bCO.bC(getWorldX());
  }

  public int fb() {
    return bCO.bC(getWorldY());
  }

  public float getWorldX() {
    int i = this.imV.size();
    int j = 0;
    float f = 0.0F;
    for (int k = 0; k < i; k++) {
      if (d((bSl)this.imV.get(k)))
      {
        int m = this.imW.get(k);
        f += ((bSl)this.imV.get(k)).getWorldX() * m;
        j += m;
      }
    }
    if (j == 0) {
      K.error("Aucune target définie");
      return this.imU.getWorldX();
    }
    return f / j;
  }

  public float getWorldY() {
    int i = this.imV.size();

    int j = 0;
    float f = 0.0F;
    for (int k = 0; k < i; k++) {
      if (d((bSl)this.imV.get(k)))
      {
        int m = this.imW.get(k);
        f += ((bSl)this.imV.get(k)).getWorldY() * m;
        j += m;
      }
    }
    if (j == 0) {
      K.error("Aucune target définie");
      return this.imU.getWorldY();
    }

    return f / j;
  }

  public void x(float paramFloat1, float paramFloat2) {
  }

  public void k(float paramFloat1, float paramFloat2, float paramFloat3) {
  }

  public boolean isVisible() {
    return true;
  }

  private boolean d(bSl parambSl)
  {
    return (this.iM == null) || (this.iM.p(parambSl.fa(), parambSl.fb()));
  }
}