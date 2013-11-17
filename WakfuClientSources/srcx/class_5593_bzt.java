public class bzt
  implements dGy
{
  private final short gnq;
  private long gnr;
  private long gns;

  public bzt(short paramShort)
  {
    this.gnq = paramShort;
  }

  public boolean i(cUh paramcUh) {
    if ((ce(paramcUh.nc())) || (this.gnq == paramcUh.nc())) {
      this.gnr += paramcUh.cJu();
      this.gns += paramcUh.cJw();
    }
    return true;
  }

  private boolean ce(short paramShort) {
    dAi localdAi = ars.dzL.aN(paramShort);
    while (localdAi != null) {
      if (localdAi.ddx() == this.gnq)
        return true;
      localdAi = ars.dzL.aN(localdAi.ddx());
    }
    return false;
  }

  public long bIg() {
    return this.gnr;
  }

  public long bIh() {
    return this.gns;
  }
}