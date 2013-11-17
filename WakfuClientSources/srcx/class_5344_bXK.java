final class bXK extends Mo
{
  private final bxl hnJ;

  private bXK(byz parambyz, bxl parambxl)
  {
    this.hnJ = parambxl;
    this.hnJ.ao().a(this);
  }

  public void aS() {
    throw new UnsupportedOperationException("Pas de sérialisation dans le client");
  }

  public void aT() {
    byz.p(this.iZ).b(this.hnJ);
  }
}