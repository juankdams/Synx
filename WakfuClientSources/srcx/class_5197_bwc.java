class bwc extends rh
{
  private int ggI;

  void a(adG paramadG)
  {
    super.a(paramadG);
    this.aYY = true;
  }

  private void bDO() {
    if (this.ggI != 0)
      return;
    dbJ localdbJ = new dbJ(bFq.bMY() + "freeze.cgfx", "freeze");
    bFq.a(localdbJ, new Jk(this, 0.0F));

    this.ggI = localdbJ.getId();
  }

  private void bDP() {
    if (this.ggI == 0)
      return;
    bFq.sB(this.ggI);
    this.ggI = 0;
  }

  void stop()
  {
    super.stop();
    bDP();
    this.aYY = false;
  }

  void a(adG paramadG, float paramFloat1, float paramFloat2)
  {
    if (!this.aYY) {
      return;
    }
    float f = this.aZa.bMS();
    if (f == 0.0F) {
      stop();
      return;
    }

    bDO();
  }
}