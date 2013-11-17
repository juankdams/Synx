public class bpU
{
  private final int aw;
  private final int Sk;
  private final int dnO;
  private final int aEz;
  private final boolean cxI;
  private final int cxK;
  private final bzS[] fKu;

  public bpU(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean, int paramInt5, bzS[] paramArrayOfbzS)
  {
    this.aw = paramInt1;
    this.Sk = paramInt2;
    this.dnO = paramInt3;
    this.aEz = paramInt4;
    this.cxI = paramBoolean;
    this.cxK = paramInt5;
    this.fKu = paramArrayOfbzS;
  }

  public int getId() {
    return this.aw;
  }

  public int ayN() {
    return this.dnO;
  }

  public int ajS() {
    return this.aEz;
  }

  public boolean ahy() {
    return this.cxI;
  }

  public int ahA() {
    return this.cxK;
  }

  public int gC() {
    return this.Sk;
  }

  public bzS[] byT() {
    return this.fKu;
  }

  public bzS byU() {
    if ((!bB) && (this.fKu.length <= 0)) throw new AssertionError();
    float f1 = 0.0F;
    float f2 = bCO.U(0.0F, byW());
    int i = 0; for (int j = this.fKu.length; i < j; i++) {
      f1 += this.fKu[i].getWeight();
      if (f2 <= f1) {
        return this.fKu[i];
      }
    }
    return this.fKu[(this.fKu.length - 1)];
  }

  public short byV() {
    return (short)byU().bIu();
  }

  private float byW() {
    float f = 0.0F;
    for (bzS localbzS : this.fKu) {
      f += localbzS.getWeight();
    }
    return f;
  }

  public int byX() {
    return this.fKu.length;
  }

  public boolean byY() {
    return this.Sk == 0;
  }
}