final class dJV extends Mo
{
  private final ddJ lWt;

  private dJV(byz parambyz, ddJ paramddJ)
  {
    this.lWt = paramddJ;
    this.lWt.ao().a(this);
  }

  public void aS() {
    throw new UnsupportedOperationException("Pas de serialisation cliente");
  }

  public void aT() {
    byz.j(this.iZ).b(this.lWt.kXr);
  }

  public String toString()
  {
    return "LocalPlayerCharacterPartInventories{m_part=" + this.lWt + "} ";
  }
}