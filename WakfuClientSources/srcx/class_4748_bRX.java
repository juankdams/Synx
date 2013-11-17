import org.apache.log4j.Logger;

public final class bRX extends doA
{
  private static final aee bx = new bOO(new bgn());

  private static final qM by = new dzQ(new ec[] { new dLx("Params", new dmb[0]) });

  public qM aF()
  {
    return by;
  }

  public bRX()
  {
    aH();
  }

  public bRX bYS()
  {
    bRX localbRX;
    try {
      localbRX = (bRX)bx.Mm();
      localbRX.aOr = bx;
    } catch (Exception localException) {
      localbRX = new bRX();
      localbRX.aOr = null;
      localbRX.eXg = false;
      K.error("Erreur lors d'un checkOut sur un ChangeLevel : " + localException.getMessage());
    }
    return localbRX;
  }

  public void a(aVc paramaVc) {
    if ((this.evp == null) || (this.evo == null)) {
      return;
    }
    if ((this.evp instanceof dhJ)) {
      this.cxl = ((dhJ)this.evp).nU();
    }
    else if ((this.evp instanceof aAn))
      this.cxl = ((aAn)this.evp).nU();
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    if ((this.evo == null) || (!(this.evo instanceof dhJ)) || (((dhJ)this.evo).uO() != 1620) || (this.cxl == 0))
    {
      cVD();
      return;
    }

    dhJ localdhJ = (dhJ)this.evo;
    dGf localdGf = (dGf)localdhJ.aJp();
    int i = localdGf.alN();
    int j = localdhJ.nU();
    if (j == i) {
      cVD();
      return;
    }

    int k = ((dhJ)this.evo).aft().nU();
    if (j >= k) {
      cVD();
      return;
    }

    int m = localdhJ.g(eu.ayM);
    int n = localdhJ.e(eu.ayM);

    short s = (short)Math.min(Math.min(j + this.cxl, i), k);
    localdhJ.aQ(s);
    localdhJ.bFv();

    int i1 = localdhJ.g(eu.ayM);
    int i2 = i1 - m;
    int i3 = n + i2;

    localdhJ.d(eu.ayM).set(i3);
  }

  public boolean aL() {
    return false;
  }

  public boolean aM() {
    return true;
  }

  public boolean aN() {
    return false;
  }
}