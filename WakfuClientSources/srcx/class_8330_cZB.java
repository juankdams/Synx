public class cZB extends bIz
{
  private cZB(crZ paramcrZ)
  {
    super(paramcrZ);
  }

  public final Float ae()
  {
    if ((float)this.dbD <= this.gCm[0].floatValue()) {
      return Float.valueOf(0.0F);
    }
    float f = bPG();
    if ((float)this.dbD <= f) {
      return Float.valueOf(1.0F);
    }
    this.dbD = (()((float)this.dbD - f));
    return Float.valueOf(0.0F);
  }

  public final boolean isActive() {
    return floatValue() != 0.0F;
  }

  public float floatValue()
  {
    return ((Float)get()).floatValue();
  }

  public int intValue()
  {
    return ((Float)get()).intValue();
  }

  public String stringValue()
  {
    throw new UnsupportedOperationException();
  }

  public float bPG()
  {
    return this.gCm[1].floatValue() + this.gCm[0].floatValue();
  }
}