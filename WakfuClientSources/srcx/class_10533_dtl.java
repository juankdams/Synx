public class dtl extends aba
{
  private dtl(crZ paramcrZ)
  {
    super(paramcrZ);
  }

  public final Float ae()
  {
    return Float.valueOf(bCO.U(this.gCm[0].floatValue(), this.gCm[1].floatValue()));
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
}