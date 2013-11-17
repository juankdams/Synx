public abstract class bgm
  implements aCF
{
  public static int blX = -1;
  private int fug;
  protected int blY = 0;
  protected int aKS = blX;

  public void setDuration(int paramInt) {
    this.aKS = paramInt;
  }

  public int getDuration() {
    return this.aKS;
  }

  protected int Ft() {
    return this.blY;
  }

  public boolean isAlive()
  {
    if (this.aKS == blX) {
      return true;
    }
    return this.blY <= this.aKS + this.fug;
  }

  public void cz(int paramInt) {
    if (this.fug > 0) {
      this.fug -= paramInt;
      if (this.fug <= 0)
        setVisible(true);
    }
    else
    {
      this.blY += paramInt;
    }
  }

  public void pu(int paramInt) {
    if ((!bB) && (paramInt < 0)) throw new AssertionError();
    this.fug = paramInt;
    if (this.fug > 0)
      setVisible(false);
  }

  public abstract void setVisible(boolean paramBoolean);
}