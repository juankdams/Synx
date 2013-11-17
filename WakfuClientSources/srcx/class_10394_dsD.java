public class dsD extends bIz
{
  private dsD(crZ paramcrZ)
  {
    super(paramcrZ);
  }

  public final Float ae()
  {
    float f = bPG();
    if ((float)this.dbD > f) {
      this.dbD = (()((float)this.dbD - f));
    }
    return ((cwc)this.gCm[1]).cn((float)this.dbD);
  }

  public final float floatValue()
  {
    return ((Float)get()).floatValue();
  }

  public final int intValue()
  {
    return ((Float)get()).intValue();
  }

  public final String stringValue()
  {
    throw new UnsupportedOperationException();
  }

  public float bPG()
  {
    return this.gCm[0].floatValue();
  }
}