public abstract class bXI
{
  protected final dpI cwt;

  protected bXI(dpI paramdpI)
  {
    this.cwt = paramdpI;
  }

  public abstract void a(cew paramcew);

  public boolean a(bXI parambXI) {
    if (parambXI == this) {
      return true;
    }
    if (parambXI == null) {
      return false;
    }
    return parambXI.cwt == this.cwt;
  }

  public abstract bXI eu();
}