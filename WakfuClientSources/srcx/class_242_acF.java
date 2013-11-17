public class acF
{
  protected final cSR cSL = new cSR();

  public void a(bci parambci)
  {
    this.cSL.put(parambci.getId(), parambci);
  }

  public bci hH(int paramInt) {
    return (bci)this.cSL.get(paramInt);
  }

  public boolean isEmpty() {
    return this.cSL.isEmpty();
  }

  public dmn yF() {
    return this.cSL.yF();
  }
}