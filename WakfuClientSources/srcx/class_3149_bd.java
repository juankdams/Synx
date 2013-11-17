final class bd extends Mo
{
  private final vz iY;

  private bd(byz parambyz, vz paramvz)
  {
    this.iY = paramvz;
    this.iY.ao().a(this);
  }

  public void aS() {
    throw new UnsupportedOperationException("Le client ne devrait pas sérialiser les items decouverts");
  }

  public void aT() {
    byz.l(this.iZ).b(this.iY);
    byz.m(this.iZ).b(this.iY);
  }
}