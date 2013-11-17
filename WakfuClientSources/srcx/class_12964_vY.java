public final class vY
{
  private float[] blc;
  private int m_size;

  public vY(int paramInt)
  {
    this.blc = new float[paramInt * paramInt];
    this.m_size = paramInt;
  }

  public vY(float[] paramArrayOfFloat) {
    c(paramArrayOfFloat);
  }

  public final void c(float[] paramArrayOfFloat)
  {
    if ((!bB) && (Math.sqrt(paramArrayOfFloat.length) != (int)Math.sqrt(paramArrayOfFloat.length))) throw new AssertionError();
    this.m_size = ((int)Math.sqrt(paramArrayOfFloat.length));
    this.blc = new float[paramArrayOfFloat.length];
    System.arraycopy(paramArrayOfFloat, 0, this.blc, 0, this.blc.length);
  }

  public final float[] Fj() {
    return this.blc;
  }

  public final int getSize() {
    return this.m_size;
  }
}