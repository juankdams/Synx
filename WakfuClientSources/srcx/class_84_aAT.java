final class aAT extends Mo
{
  private final cBY dUe;

  private aAT(byz parambyz, cBY paramcBY)
  {
    this.dUe = paramcBY;
    this.dUe.ao().a(this);
  }

  public void aS() {
    throw new UnsupportedOperationException("Le client ne devrait pas sérialiser les customs de havre-sac");
  }

  public void aT() {
    byz.i(this.iZ).b(this.dUe);
  }
}