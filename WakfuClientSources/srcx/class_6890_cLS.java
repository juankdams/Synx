public class cLS
{
  public static final byte iLt = 1;
  public static final byte iLu = 2;
  public static final byte iLv = 3;
  public static final float iLw = -2.0F;
  private final float cfy;
  private final float cfz;
  private final byte iLx;
  private boolean iLy;

  public cLS(float paramFloat1, float paramFloat2, byte paramByte)
  {
    this.cfy = paramFloat1;
    this.cfz = paramFloat2;
    this.iLx = paramByte;
  }

  public int t(int paramInt1, int paramInt2) {
    if (this.cfy == -2.0F) {
      return paramInt2;
    }

    return (int)(paramInt1 * this.cfy);
  }

  public int q(int paramInt1, int paramInt2) {
    if (this.cfz == -2.0F) {
      return paramInt2;
    }

    return (int)(paramInt1 * this.cfz);
  }

  public int r(int paramInt1, int paramInt2) {
    switch (this.iLx) {
    case 1:
    case 3:
      return (int)Math.round((paramInt2 - paramInt1) * 0.5D);
    case 2:
      return Math.max(0, paramInt2 - paramInt1);
    }

    return 0;
  }

  public int s(int paramInt1, int paramInt2) {
    switch (this.iLx) {
    case 1:
      return (int)Math.round((paramInt2 - paramInt1) * 0.5D);
    case 2:
    case 3:
      return 0;
    }

    return 0;
  }

  public boolean cEQ() {
    return this.iLy;
  }

  public void iv(boolean paramBoolean) {
    this.iLy = paramBoolean;
  }
}