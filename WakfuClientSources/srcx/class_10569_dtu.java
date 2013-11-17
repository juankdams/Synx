class dtu extends rh
{
  private static final int kNi = 2800;
  private int lwg;
  private int ggI;

  void a(adG paramadG)
  {
    super.a(paramadG);

    if (this.lwg > 0) {
      return;
    }
    int i = 2800;

    rp localrp = paramadG.apF();

    czT localczT = new czT(-15.0F, 15.0F, -15.0F, 15.0F, 0.0F, 36.0F);

    Ud localUd = new Ud();
    localUd.initialize(2800);
    localUd.a(localczT);
    localUd.a(localrp);

    float f1 = 2.5F;
    float f2 = 60000.0F;
    float f3 = 100.0F;
    float f4 = 128.0F;
    localUd.e(128.0F, 100.0F, 60000.0F, 2.5F);

    Pb.aaU().a(localUd);

    this.lwg = localUd.getId();

    this.aYY = true;
  }

  private void bDO() {
    if (this.ggI != 0)
      return;
    dbJ localdbJ = new dbJ(bFq.bMY() + "freeze.cgfx", "freeze");
    bFq.a(localdbJ, new dEl(this, 0.0F));

    this.ggI = localdbJ.getId();
  }

  private void bDP() {
    if (this.ggI == 0)
      return;
    bFq.sB(this.ggI);
    this.ggI = 0;
  }

  void stop() {
    super.stop();

    if (this.lwg != 0) {
      adQ localadQ = Pb.aaU().gh(this.lwg);
      if (localadQ != null) {
        localadQ.L(false);
        Pb.aaU().b(localadQ);
        localadQ.clear();
      }
      this.lwg = 0;
    }

    bDP();

    this.aYY = false;
  }

  public void setVisible(boolean paramBoolean) {
    super.setVisible(paramBoolean);
    if (!paramBoolean) {
      Ud localUd = (Ud)Pb.aaU().gh(this.lwg);
      if (localUd != null)
        localUd.cd(400);
    }
  }

  void a(adG paramadG, float paramFloat1, float paramFloat2)
  {
    if (!this.aYY) {
      return;
    }
    float f1 = this.aZa.bMS();
    if (f1 == 0.0F) {
      stop();
      return;
    }

    bDO();

    Ud localUd = (Ud)Pb.aaU().gh(this.lwg);
    if (localUd != null) {
      int i = (int)((this.aYZ) && (f1 > 0.33F) ? 2800.0F * f1 : 0.0F);
      localUd.cc(i);

      float f2 = 0.5235988F * Math.min(1.0F, 0.4F + paramFloat2);
      float f3 = 1.570796F - f2;
      float f4 = 1.570796F + f2;
      localUd.X(0.05F * (float)Math.cos(bCO.U(f3, f4)));
    }
  }
}