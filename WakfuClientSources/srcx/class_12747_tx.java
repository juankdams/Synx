import org.apache.log4j.Logger;

public final class tx extends doA
{
  private static final aee bx = new bOO(new aWC());

  private static final qM by = new dzQ(new ec[] { new dLx("Id de la charac", new dmb[] { new dmb("Id de la charac", dnN.lnS) }), new dLx("Ratio", new dmb[] { new dmb("Id de la charac", dnN.lnS), new dmb("Ratio à copier (defaut = 100%)", dnN.lnR) }) });

  private final cCH bef = new aWB(this, 5);

  private byte beg = -1;
  private int beh;

  public qM aF()
  {
    return by;
  }

  public tx() {
    aH();
  }

  public tx BH()
  {
    tx localtx;
    try {
      localtx = (tx)bx.Mm();
      localtx.aOr = bx;
    } catch (Exception localException) {
      localtx = new tx();
      localtx.aOr = null;
      localtx.eXg = false;
      K.error("Erreur lors d'un checkOut sur un CopyCharacValueAtApplication : " + localException.getMessage());
    }
    localtx.beg = this.beg;
    localtx.beh = this.beh;
    return localtx;
  }

  public void a(aVc paramaVc)
  {
  }

  public void oT()
  {
    if (!bkt()) {
      return;
    }
    if (this.eWL == null) {
      return;
    }
    if (((dpI)this.eWL).bep() >= 1) {
      this.beg = ((byte)((dpI)this.eWL).a(0, cVC(), dNF.meh));
    }
    int i = 100;
    if (((dpI)this.eWL).bep() >= 2) {
      i = ((dpI)this.eWL).a(1, cVC(), dNF.meh);
    }
    eu localeu = eu.a(Byte.valueOf(this.beg));
    if (localeu == null) {
      K.error("Charac parametree inconnue " + this.beg);
      return;
    }

    if ((!this.evo.b(localeu)) || (!this.evp.b(localeu))) {
      return;
    }

    int j = this.evo.a(localeu).max();
    this.beh = (j == 2147483647 ? 2147483647 : bMr.ax(j * i / 100.0F));
    this.cxl = bMr.ax(this.evo.e(localeu) * i / 100.0F);

    super.oT();
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    if ((this.evo == null) || (this.evp == null)) {
      cVD();
      return;
    }

    eu localeu = eu.a(Byte.valueOf(this.beg));
    if (localeu == null) {
      K.error("Charac parametree inconnue " + this.beg);
      cVD();
      return;
    }

    if ((!this.evo.b(localeu)) || (!this.evp.b(localeu))) {
      cVD();
      return;
    }

    this.evp.a(localeu).setMax(this.beh);
    this.evp.a(localeu).set(this.cxl);
  }

  public boolean aL()
  {
    return true;
  }

  public boolean aM()
  {
    return true;
  }

  public boolean aN()
  {
    return false;
  }

  public cCH lJ()
  {
    return this.bef;
  }

  public void bc()
  {
    this.beg = -1;
    super.bc();
  }
}