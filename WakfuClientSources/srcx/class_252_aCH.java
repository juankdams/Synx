import org.apache.log4j.Logger;

public class aCH
{
  protected static final Logger K = Logger.getLogger(aCH.class);
  private final int Sk;
  private final String dXt;
  private final int bMx;
  private final String dXu;
  private final int[] bjB;
  private boolean bur = true;
  private final boolean dXv = false;

  public aCH(int paramInt1, String paramString1, int paramInt2, String paramString2, int[] paramArrayOfInt) {
    this.Sk = paramInt1;
    this.dXt = paramString1;

    this.bMx = paramInt2;
    this.dXu = paramString2;

    this.bjB = paramArrayOfInt;
  }

  public int gC() {
    return this.Sk;
  }

  public String aOQ() {
    return this.dXt;
  }

  public int aOR() {
    return this.bMx;
  }

  public String aOS() {
    return this.dXu;
  }

  public boolean isEnabled() {
    return this.bur;
  }

  public void setEnabled(boolean paramBoolean) {
    this.bur = paramBoolean;
  }

  public boolean aOT() {
    return false;
  }

  public boolean aOU() {
    return this.bjB.length != 0;
  }

  public boolean K(dhJ paramdhJ) {
    if (!aOU()) {
      return true;
    }
    return L(paramdhJ) != null;
  }

  public gA L(dhJ paramdhJ) {
    if ((!bB) && (!aOU())) throw new AssertionError();

    gA localgA1 = (gA)paramdhJ.ayJ().dB((short)azO.dRO.hV);
    if (k(localgA1)) {
      return localgA1;
    }
    for (int k : this.bjB) {
      gA localgA2 = paramdhJ.bHr().yf(k);
      if (localgA2 != null)
        return localgA2;
    }
    return null;
  }

  private boolean k(dsj paramdsj)
  {
    if (paramdsj == null)
      return false;
    for (int k : this.bjB)
      if (paramdsj.ok() == k)
        return true;
    return false;
  }

  public int[] Ei() {
    return (int[])this.bjB.clone();
  }
}