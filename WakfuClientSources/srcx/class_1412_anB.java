final class anB extends Mo
{
  private final cXW dri;

  private anB(byz parambyz, cXW paramcXW)
  {
    this.dri = paramcXW;
    this.dri.ao().a(this);
  }

  public void aS() {
    throw new UnsupportedOperationException("Le client ne devrait pas sérialiser les landMarks");
  }

  public void aT() {
    byz.k(this.iZ).b(this.dri);
  }
}