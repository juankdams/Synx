final class cKa extends Mo
{
  private final bFj iIB;

  private cKa(byz parambyz, bFj parambFj)
  {
    this.iIB = parambFj;
    this.iIB.ao().a(this);
  }

  public void aS() {
    throw new UnsupportedOperationException("Le client ne devrait pas sérialiser les emotes");
  }

  public void aT() {
    byz.h(this.iZ).b(this.iIB);
  }
}