final class bRF extends Mo
{
  private final bOz hbk;

  private bRF(dhJ paramdhJ, bOz parambOz)
  {
    this.hbk = parambOz;
    this.hbk.ao().a(this);
  }

  public void aS() {
    cYk localcYk = this.bO.ML();
    this.hbk.x = localcYk.getX();
    this.hbk.y = localcYk.getY();
    this.hbk.bEW = localcYk.IB();
    this.hbk.boK = ((byte)this.bO.E().m_index);
    this.hbk.bEX = this.bO.Lk();
  }

  public void aT() {
    this.bO.d(this.hbk.x, this.hbk.y, this.hbk.bEW);
    this.bO.c(CG.eu(this.hbk.boK));
    this.bO.Y(this.hbk.bEX);
    for (azg localazg : this.bO.lcU) {
      localazg.E(this.bO);
      localazg.F(this.bO);
    }
  }
}