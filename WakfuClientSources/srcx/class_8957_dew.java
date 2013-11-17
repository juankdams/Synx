final class dew extends Mo
{
  private final M kYq;

  dew(bKm parambKm, M paramM)
  {
    this.kYq = paramM;
    this.kYq.ao().a(this);
  }

  public void aS() {
    throw new UnsupportedOperationException("Pas de serialisation dans le client (Server->Client only)");
  }

  public void aT() {
    if (this.kYq.aV == null) {
      this.aHq.bRE();
      return;
    }
    this.aHq.c(this.kYq.aV.aGg, this.kYq.aV.ipX, this.kYq.aV.eRE, this.kYq.aV.eRL, this.kYq.aV.eRF);
  }
}