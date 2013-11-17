public class arS extends cSx
{
  private axU bRF = null;
  private Object aOd = null;
  private boolean dBi;

  public arS(aNL paramaNL, axU paramaxU, Object paramObject, boolean paramBoolean)
  {
    this.kET = paramaNL;
    this.bRF = paramaxU;
    this.aOd = paramObject;
    this.dBi = paramBoolean;
  }

  public arS(aNL paramaNL)
  {
    this.kET = paramaNL;
  }

  public void f(axU paramaxU)
  {
    this.bRF = paramaxU;
  }

  public axU aEv()
  {
    return this.bRF;
  }

  public void setSelected(boolean paramBoolean)
  {
    this.dBi = paramBoolean;
  }

  public boolean getSelected()
  {
    return this.dBi;
  }

  public void setValue(Object paramObject)
  {
    this.aOd = paramObject;
  }

  public Object getValue()
  {
    return this.aOd;
  }

  public CH mp()
  {
    return CH.bGk;
  }
}