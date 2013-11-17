public class dNQ extends dyj
{
  private boolean mep;

  public dNQ()
  {
  }

  public dNQ(axA paramaxA)
  {
    m(paramaxA);
    this.mep = true;
  }

  public Object a(Object paramObject, hT paramhT)
  {
    Object localObject = super.a(paramObject, paramhT);
    if (auL.dHJ.equals(localObject)) {
      return auL.dHJ;
    }
    return localObject;
  }

  public void m(axA paramaxA) {
    if (this.mep) {
      throw new UnsupportedOperationException("immutable reference");
    }

    super.m(paramaxA);
  }
}