import org.apache.log4j.Logger;

public final class dhj extends doA
{
  private static final Logger K = Logger.getLogger(dhj.class);

  private static final aee bx = new bOO(new PM());

  private static final qM by = new dzQ(new ec[] { new dLx("Sort a ajouter (level = level du container)", new dmb[] { new dmb("Id", dnN.lnS) }), new dLx("Sort a ajouter", new dmb[] { new dmb("Id", dnN.lnS), new dmb("Level", dnN.lnS) }) });
  private int bla;
  private short epB;
  private bfE lco;
  public cCH lcp = new PJ(this);

  public qM aF()
  {
    return by;
  }

  public dhj cQb()
  {
    dhj localdhj;
    try
    {
      localdhj = (dhj)bx.Mm();
      localdhj.aOr = bx;
    } catch (Exception localException) {
      localdhj = new dhj();
      localdhj.aOr = null;
      localdhj.eXg = false;
      K.error("Erreur lors d'un checkOut sur un AddSpellToInventory : " + localException.getMessage());
    }
    return localdhj;
  }

  public void a(aVc paramaVc) {
    if (((dpI)this.eWL).bep() >= 1)
      this.bla = ((dpI)this.eWL).a(0, cVC(), dNF.meh);
    if (((dpI)this.eWL).bep() >= 2)
      this.epB = ((short)((dpI)this.eWL).a(1, cVC(), dNF.meh));
    else
      this.epB = cVC();
  }

  protected void a(aVc paramaVc, boolean paramBoolean) {
    if (this.evp == null) {
      return;
    }
    if (!(this.evp instanceof dhJ)) {
      return;
    }
    this.lco = czE.cwt().h(this.bla, this.epB);
    if (this.lco == null) {
      K.error("Impossible de créer le sort d'id " + this.bla + " pour le level " + this.epB);
      return;
    }

    dhJ localdhJ = (dhJ)this.evp;
    dCi localdCi = localdhJ.auK();
    try {
      if (!localdCi.f(this.lco))
        localdCi.c(this.lco);
    } catch (Exception localException) {
      K.error("Exception levee", localException);
      this.lco.release();
      this.lco = null;
    }
  }

  public void aK() {
    if (this.lco == null)
      return;
    if (!(this.evp instanceof dhJ))
      return;
    dhJ localdhJ = (dhJ)this.evp;
    dCi localdCi = localdhJ.auK();
    localdCi.d(this.lco);
    this.lco.release();
    super.aK();
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

  public void bc() {
    super.bc();
    this.bla = 0;
    this.epB = 0;
    this.lco = null;
  }

  public cCH lJ()
  {
    return this.lcp;
  }
}