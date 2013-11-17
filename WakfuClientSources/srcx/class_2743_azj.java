public abstract class azj
{
  private final float[] dQv;
  private final float[] dQw;
  private final long dQx;
  protected final float[] dQy;
  protected boolean dQz;
  protected long dQA;

  protected azj(float[] paramArrayOfFloat1, float[] paramArrayOfFloat2, long paramLong)
  {
    this.dQv = paramArrayOfFloat1;
    this.dQw = paramArrayOfFloat2;
    this.dQx = paramLong;

    this.dQz = true;
    this.dQA = 0L;
    this.dQy = new float[3];
    System.arraycopy(this.dQv, 0, this.dQy, 0, 3);
  }

  public boolean ib() {
    float[] arrayOfFloat = this.dQz ? this.dQw : this.dQv;

    return (this.dQy[0] != arrayOfFloat[0]) || (this.dQy[1] != arrayOfFloat[1]) || (this.dQy[2] != arrayOfFloat[2]);
  }

  public void update(int paramInt)
  {
    if (!ib()) {
      return;
    }
    this.dQA += paramInt;
    float f = (float)this.dQA / (float)this.dQx;
    if (f >= 1.0F) {
      if (this.dQz)
        System.arraycopy(this.dQw, 0, this.dQy, 0, this.dQw.length);
      else
        System.arraycopy(this.dQv, 0, this.dQy, 0, this.dQv.length);
      return;
    }
    int i;
    if (this.dQz)
      for (i = 0; i < 3; i++)
        this.dQy[i] = bCO.s(this.dQv[i], this.dQw[i], f);
    else
      for (i = 0; i < 3; i++)
        this.dQy[i] = bCO.s(this.dQw[i], this.dQv[i], f);
  }

  public void aLd()
  {
    this.dQz = true;
    this.dQA = 0L;
  }

  public void yx() {
    this.dQz = false;
    this.dQA = 0L;
  }
}