import org.apache.log4j.Logger;

public abstract class tY extends doA
{
  private static final qM by = new dzQ(new ec[] { new dLx("Modif de Charac", new dmb[] { new dmb("valeur (eventuellement en %) (-1 pour valeur de l'effet declencheur)", dnN.lnR) }), new dLx("Modif de Charac variable", new dmb[] { new dmb("", dnN.lnR), new dmb("D", dnN.lnR), new dmb("+", dnN.lnR), new dmb("(fake, sert à rien, laisser à 0)", dnN.lnS) }), new dLx("Specification du type de Modif (% ou fixe)", new dmb[] { new dmb("valeur (eventuellement en %) (-1 pour valeur de l'effet declencheur)", dnN.lnR), new dmb("Fixe = 0; %=1", dnN.lnS) }), new dLx("Avec id de la charac (cf FighterCharacteriticType)", new dmb[] { new dmb("valeur (eventuellement en %) (-1 pour valeur de l'effet declencheur)", dnN.lnR), new dmb("Fixe = 0; %=1", dnN.lnS), new dmb("Id de la charac", dnN.lnS) }), new dLx("Avec % d'application", new dmb[] { new dmb("valeur (eventuellement en %) (-1 pour valeur de l'effet declencheur)", dnN.lnR), new dmb("Fixe = 0; %=1", dnN.lnS), new dmb("Id de la charac (defaut = -1)", dnN.lnS), new dmb("% d'application (defaut = -1)", dnN.lnS), new dmb("(fake, sert à rien, laisser à 0)", dnN.lnS) }) });
  protected dSc aOF;
  protected boolean bgy;
  private final cCH aFR = new dtk(this);

  public qM aF()
  {
    return by;
  }

  protected tY() {
  }

  protected tY(dSc paramdSc) {
    this.aOF = paramdSc;
    this.bgy = false;
    aH();
  }

  protected tY(dSc paramdSc, boolean paramBoolean) {
    this.aOF = paramdSc;
    this.bgy = paramBoolean;
    aH();
  }

  public dSc sw() {
    return this.aOF;
  }

  public boolean Cu()
  {
    if (this.cxl == 0) {
      return false;
    }
    return super.Cu();
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    if (Cv()) {
      jJ(true);
      return;
    }

    cqm localcqm = Cw();
    if (localcqm == null) {
      jJ(true);
      return;
    }
    if ((this.bgy) && (bkt()))
      d(localcqm);
    e(localcqm);
    Cx();
    if ((bkt()) && 
      (ays.q(this))) {
      b(paramaVc, paramBoolean);
      ays.s(this);
    }
  }

  public void b(int paramInt, float paramFloat, boolean paramBoolean)
  {
    switch (paramInt) {
    case 0:
      if (!paramBoolean)
        this.cxl += bMr.ax(this.cxl * paramFloat / 100.0F); break;
    case 1:
      if (paramBoolean)
        this.cxl = bMr.ax(paramFloat);
      else {
        this.cxl = ((int)(this.cxl + paramFloat));
      }
      break;
    }

    if (this.cxl == 0)
      cVD();
  }

  boolean Cv() {
    return (this.aOF == null) || (sx() == null) || (!sx().b(this.aOF));
  }

  private cqm Cw() {
    cqm localcqm = null;
    switch (this.aOF.ln()) {
    case 0:
      localcqm = sx().a(this.aOF);
      break;
    default:
      K.warn("On veut appliquer une modification de charac sur autre chose qu'une fighterCharac " + this.aOF);
    }
    return localcqm;
  }

  private void d(cqm paramcqm) {
    this.cxl = ((int)(paramcqm.value() / 100.0F * this.cxl));
  }

  abstract void e(cqm paramcqm);

  private void Cx() {
    if ((this.aOF == eu.azq) && (this.ejP != null) && (this.ejP.LH() != null))
      this.ejP.LH().AT();
  }

  public void a(aVc paramaVc)
  {
    if (this.eWL == null)
      return;
    short s = cVC();
    Object localObject;
    if (((dpI)this.eWL).bep() == 4) {
      this.cxl = dpe.ae(((dpI)this.eWL).a(0, s, dNF.meh), ((dpI)this.eWL).a(1, s, dNF.meh), ((dpI)this.eWL).a(2, s, dNF.meh));
    }
    else
    {
      this.cxl = ((dpI)this.eWL).a(0, s, dNF.meh);
      if (((dpI)this.eWL).bep() > 1)
        this.bgy = (((dpI)this.eWL).a(1, s, dNF.meh) == 1);
      if (((dpI)this.eWL).bep() > 2) {
        int i = ((dpI)this.eWL).a(2, s, dNF.meh);
        if ((i != -1) || (this.aOF == null)) {
          localObject = eu.a(Byte.valueOf((byte)i));
          if (localObject == null)
            K.error("Paramétrage foireux d'un effet de modification de charac " + ((dpI)this.eWL).yR());
          else {
            this.aOF = ((dSc)localObject);
          }
        }
      }
    }

    if (this.cxl == -1) {
      doA localdoA = (doA)paramaVc;
      if (localdoA == null) {
        localdoA = ((dji)bkh()).cRV();
      }
      if (localdoA == null) {
        K.error("On ne peut pas copier la valeur de l'effet declencheur, celui-ci est inconnu");
        this.cxl = 0;
        return;
      }
      if ((localdoA instanceof dRu)) {
        localObject = (dRu)localdoA;
        int j = this.aOF.bJ();
        if (j == eu.ayN.bJ())
          this.cxl = ((dRu)localObject).dsq();
        else if (j == eu.ayO.bJ())
          this.cxl = ((dRu)localObject).dsp();
        else if (j == eu.ayP.bJ())
          this.cxl = ((dRu)localObject).dso();
      } else {
        this.cxl = localdoA.getValue();
      }
    }
  }

  public final void aK()
  {
    if ((this.ksH) && (bkM()) && (this.aOF != null)) {
      switch (this.aOF.ln()) {
      case 0:
        if ((sx() != null) && (sx().b(this.aOF))) {
          Cy();
          Cx();
        }
        break;
      }
    }
    super.aK();
  }

  abstract void Cy();

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

  public bTI Cz()
  {
    if ((this.aOF != null) && (this.aOF.ln() == 0)) {
      bTI localbTI = ((eu)this.aOF).lB();
      if (localbTI != null)
        return localbTI;
    }
    return bTI.heW;
  }

  protected boolean CA()
  {
    return cVM();
  }

  protected dle sx()
  {
    return this.evp;
  }

  public cCH lJ() {
    return this.aFR;
  }
}