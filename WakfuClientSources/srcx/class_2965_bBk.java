import org.apache.log4j.Logger;

public final class bBk extends doA
{
  private static final aee bx = new bOO(new aC());

  private static final qM by = new dzQ(new ec[] { new dLx("Id de team", new dmb[] { new dmb("Id de team", dnN.lnR) }) });
  private byte gtD;

  public qM aF()
  {
    return by;
  }

  public bBk() {
    aH();
  }

  public bBk bJZ()
  {
    bBk localbBk;
    try {
      localbBk = (bBk)bx.Mm();
      localbBk.aOr = bx;
    } catch (Exception localException) {
      localbBk = new bBk();
      localbBk.aOr = null;
      localbBk.eXg = false;
      K.error("Erreur lors d'un checkOut sur un SetTeamId : " + localException.getMessage());
    }
    return localbBk;
  }

  public void a(aVc paramaVc)
  {
    this.cxl = -1;
    this.gtD = -1;
    if (this.eWL == null) {
      return;
    }
    this.cxl = ((dpI)this.eWL).a(0, cVC(), dNF.meh);
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    if (this.evp == null) {
      cVD();
      return;
    }

    if (this.cxl == -1) {
      cVD();
      return;
    }

    if (!(this.evp instanceof dMT)) {
      cVD();
      return;
    }

    this.gtD = ((dMT)this.evp).Fx();
    ((dMT)this.evp).as((byte)this.cxl);
  }

  public void aK()
  {
    if ((this.gtD < 0) && (!(this.evp instanceof dMT))) {
      return;
    }
    ((dMT)this.evp).as(this.gtD);
  }

  public boolean aL()
  {
    return false;
  }

  public boolean aM()
  {
    return true;
  }

  public boolean aN()
  {
    return false;
  }

  public void bc()
  {
    this.cxl = -1;
    this.gtD = -1;
    super.bc();
  }
}