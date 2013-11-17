final class cJq extends Mo
{
  private final bQV iHp;

  private cJq(byz parambyz, bQV parambQV)
  {
    this.iHp = parambQV;
    this.iHp.ao().a(this);
  }

  public void aS() {
    throw new UnsupportedOperationException("Pas de serialisation de part ici.");
  }

  public void aT() {
    ((ud)this.iZ.bSt()).l(this.iHp.gZr);
    ((ud)this.iZ.bSt()).cW(this.iHp.gZs);
    ((ud)this.iZ.bSt()).K(this.iHp.gZt);
    this.iZ.ayD();
  }
}