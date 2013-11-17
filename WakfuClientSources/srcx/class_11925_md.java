import java.awt.Rectangle;

class md extends Rectangle
{
  private final aFD aQg;

  public md(int paramInt1, int paramInt2, int paramInt3, int paramInt4, aFD paramaFD)
  {
    super(paramInt1, paramInt2, paramInt3, paramInt4);
    this.aQg = paramaFD;
  }

  public aFD tT() {
    return this.aQg;
  }

  public int bA(int paramInt) {
    int i = (int)getX();
    if (this.aQg == aFD.ebX) {
      i = (int)(i + (getWidth() - paramInt));
    }
    return i;
  }

  public int bB(int paramInt) {
    int i = (int)getY();
    if (this.aQg == aFD.ebV) {
      i = (int)(i + (getHeight() - paramInt));
    }
    return i;
  }

  public boolean bC(int paramInt) {
    if (this.aQg == aFD.ebX) {
      return paramInt > getX();
    }
    return paramInt < getX() + getWidth();
  }

  public boolean bD(int paramInt) {
    if (this.aQg == aFD.ebV) {
      return paramInt > getY();
    }
    return paramInt < getY() + getHeight();
  }

  public int bE(int paramInt) {
    if (this.aQg == aFD.ebX) {
      return -paramInt;
    }
    return paramInt;
  }

  public int bF(int paramInt) {
    if (this.aQg == aFD.ebV) {
      return -paramInt;
    }
    return paramInt;
  }
}