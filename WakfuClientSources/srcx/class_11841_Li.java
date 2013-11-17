public final class Li
{
  private final float bXJ;
  private final float bXK;

  public Li(float paramFloat1, float paramFloat2)
  {
    this.bXJ = paramFloat1;
    this.bXK = paramFloat2;
  }

  public float VI() {
    return this.bXJ;
  }

  public float VJ() {
    return this.bXK;
  }

  public byte fJ(int paramInt) {
    return (byte)(int)(VI() + paramInt * VJ());
  }
}