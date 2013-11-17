import javax.media.opengl.GL;

public final class brZ
{
  public static final int fOm = 0;
  public static final int fOn = 1;
  public static final int fOo = 2;
  public static final int fOp = 4;
  public static final int fOq = 8;
  private GL dzZ;
  private int fOr = 0;

  public void i(GL paramGL) {
    this.dzZ = paramGL;
  }

  public void qH(int paramInt) {
    if (paramInt == this.fOr) {
      return;
    }
    if (paramInt == 0) {
      if ((this.fOr & 0x1) != 0)
        this.dzZ.glDisableClientState(32884);
      if ((this.fOr & 0x2) != 0)
        this.dzZ.glDisableClientState(32885);
      if ((this.fOr & 0x4) != 0)
        this.dzZ.glDisableClientState(32886);
      if ((this.fOr & 0x8) != 0)
        this.dzZ.glDisableClientState(32888);
      this.fOr = paramInt;
      return;
    }

    this.fOr = paramInt;
    if ((this.fOr & 0x1) != 0)
      this.dzZ.glEnableClientState(32884);
    if ((this.fOr & 0x2) != 0)
      this.dzZ.glEnableClientState(32885);
    if ((this.fOr & 0x4) != 0)
      this.dzZ.glEnableClientState(32886);
    if ((this.fOr & 0x8) != 0)
      this.dzZ.glEnableClientState(32888);
  }
}