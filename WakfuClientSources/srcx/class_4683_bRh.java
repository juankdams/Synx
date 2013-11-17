public final class bRh
{
  public static final int hah = -1;
  private static final float hai = 1.5F;
  private static final float haj = 1.25F;
  private static final float hak = 1.0F;
  public static final int hal = 5;
  public static final int ham = 95;
  private static final int han = 50;
  private bad hao;
  private bad hap;
  private cYk haq;
  private boolean har;
  private boolean has;

  public bRh()
  {
  }

  public bRh(bad parambad)
  {
    this.hao = parambad;
  }

  public void a(bad parambad) {
    this.hao = parambad;
  }

  public void b(bad parambad) {
    this.hap = parambad;
  }

  public void L(cYk paramcYk) {
    this.haq = paramcYk;
  }

  public boolean bXQ() {
    return this.har;
  }

  public boolean bXR() {
    return this.has;
  }

  public void bXS() {
    this.har = false;
    this.has = false;

    int i = bXT();
    if ((i == 0) || (i == -1)) {
      return;
    }
    int j = dpe.AX(100);

    if (j < i)
      this.har = true;
    else
      this.has = true;
  }

  public int bXT() {
    if (bXU()) {
      return -1;
    }
    if (!this.hap.boZ()) {
      return -1;
    }
    int i = this.hao.boX() - this.hap.boY();
    float f1 = 50 + i / 2;
    float f2 = f1 * bXV();
    float f3 = Math.max(0.0F, 100.0F - f2);

    int j = this.hao.c(cfY.hCK) ? (int)f3 : 5;
    return bCO.J((int)f3, j, 95);
  }

  private boolean bXU() {
    if ((this.hap == null) || (this.hao == null)) {
      return true;
    }

    int i = this.hap.afD() + this.hao.afD();

    cYk localcYk1 = this.haq == null ? this.hao.aKb() : this.haq;
    cYk localcYk2 = this.hap.aKb();

    if (localcYk1.equals(localcYk2)) {
      return true;
    }
    int j = Math.abs(localcYk2.getX() - localcYk1.getX());
    if (j > i + 1)
      return true;
    int k = Math.abs(localcYk2.getY() - localcYk1.getY());
    if (k > i + 1) {
      return true;
    }
    if ((j == i + 1) && (k == i + 1))
      return true;
    return false;
  }

  private float bXV() {
    if (this.hap.atN() != null)
    {
      adr localadr;
      if (this.haq == null) {
        localadr = this.hap.atN().E(this.hao.fa(), this.hao.fb(), this.hao.fc());
      }
      else {
        localadr = this.hap.atN().E(this.haq.getX(), this.haq.getY(), this.haq.IB());
      }
      if (localadr != null) {
        switch (localadr.aps())
        {
        case 2:
          return 1.5F;
        case 1:
        case 3:
          return 1.25F;
        case 0:
        }
        return 1.0F;
      }
    }

    return 0.0F;
  }
}