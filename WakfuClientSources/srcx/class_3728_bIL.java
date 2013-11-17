import org.apache.log4j.Logger;

public class bIL extends doA
{
  private static final qM by = new dzQ(new ec[] { new dLx("Param standard", new dmb[] { new dmb("id de la zone", dnN.lnQ) }), new dLx("Param avec niveau de la zone", new dmb[] { new dmb("id de la zone", dnN.lnQ), new dmb("Niveau de la zone", dnN.lnR) }), new dLx("Param avec niveau de la zone + durée apres la mort du caster", new dmb[] { new dmb("id de la zone", dnN.lnQ), new dmb("Niveau de la zone", dnN.lnS), new dmb("La zone reste apres la fin de cet effet (1 = Oui, Non pas defaut)", dnN.lnS) }), new dLx("Niveau de la zone fct du niveau d'un sort du caster", new dmb[] { new dmb("id de la zone", dnN.lnQ), new dmb("Id du sort a prendre en compte pour le niveau", dnN.lnS), new dmb("La zone reste apres la fin de cet effet (1 = Oui, Non pas defaut)", dnN.lnS), new dmb("Ratio du niveau du sort", dnN.lnS) }) });

  static final aee bx = new bOO(new cyD());
  protected aAn gIX;
  protected long aDR;
  protected short gIY;
  protected boolean gIZ = false;
  private boolean gJa = false;
  private boolean aXA = false;
  private boolean gJb = true;
  protected CG gJc;
  static final int gJd = 15;
  public cCH gJe = new cyy(this, 15);

  public bIL()
  {
    aH();
  }

  public bIL(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3) {
    this.gJa = paramBoolean1;
    this.aXA = paramBoolean2;
    this.gJb = paramBoolean3;
  }

  public static bIL a(cOE paramcOE, cYk paramcYk, int paramInt) {
    bIL localbIL;
    try {
      localbIL = (bIL)bx.Mm();
      localbIL.aOr = bx;
    } catch (Exception localException) {
      localbIL = new bIL();
      localbIL.eXg = false;
      localbIL.aOr = null;
      K.error("Erreur lors d'un checkOut sur un SetEffectArea : " + localException.getMessage());
    }
    localbIL.aw = bsj.fSH.getId();
    localbIL.eWQ = ((doA)bsj.fSH.getObject()).DU();
    localbIL.aH();
    localbIL.eUw.ae(paramcYk);
    localbIL.cxl = paramInt;
    localbIL.aDR = paramcOE.LD().P((byte)2);
    localbIL.eWS = -1;
    localbIL.gIY = -1;
    localbIL.ejP = paramcOE;
    return localbIL;
  }

  public void bc()
  {
    super.bc();
    this.gIZ = false;
    this.gIX = null;
    this.gJc = null;
  }

  public bIL rn()
  {
    bIL localbIL;
    try {
      localbIL = (bIL)Bq().Mm();
      localbIL.aOr = Bq();
    } catch (Exception localException) {
      localbIL = new bIL();
      localbIL.aOr = null;
      localbIL.eXg = false;
      K.error("Erreur lors d'un checkOut sur un ArenaRunningEffect : " + localException.getMessage());
    }
    localbIL.aDR = this.aDR;
    localbIL.gIX = this.gIX;
    localbIL.gIZ = this.gIZ;
    localbIL.gJa = this.gJa;
    localbIL.aXA = this.aXA;
    localbIL.gJb = this.gJb;
    localbIL.gIY = this.gIY;
    return localbIL;
  }

  protected aee Bq() {
    return bx;
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    aAn localaAn = bMF.bUo().fo(this.cxl);
    if ((localaAn != null) && (this.eUw != null)) {
      d(localaAn);
      if ((this.ejP == null) || (this.ejP.LC() == null)) {
        K.warn("Impossible d'ajouter une zone d'effet au combat le contexte est null ou l'effectAreaManager est null");
        return;
      }
      b(paramaVc, paramBoolean);
      this.gIX.mk();
      this.ejP.LC().g(this.gIX);
    } else {
      K.error("Impossible d'ajouter une zone inconnue " + this.cxl);
      jJ(true);
    }
  }

  protected void d(aAn paramaAn)
  {
    CG localCG;
    if (this.gJc != null)
      localCG = this.gJc;
    else {
      localCG = this.evo != null ? this.evo.E() : CG.bFM;
    }
    this.gIX = paramaAn.a(new agg(this.aDR, this.eUw.getX(), this.eUw.getY(), this.eUw.IB(), this.ejP, axG(), this.gIY, localCG));

    this.gIX.hg(!this.gIZ);
    if ((bkM()) && (!this.gIZ))
      this.gIX.a(this);
  }

  protected dle axG() {
    return this.evo;
  }

  public void gd(boolean paramBoolean) {
    this.gJa = paramBoolean;
  }

  public boolean aL()
  {
    return this.gJa;
  }

  public boolean aM()
  {
    return this.aXA;
  }

  public boolean aN()
  {
    return this.gJb;
  }

  public void a(aVc paramaVc)
  {
    short s = cVC();
    if (this.eWL != null)
      this.cxl = ((dpI)this.eWL).a(0, s, dNF.meh);
    this.aDR = this.ejP.LD().P((byte)2);
    bO(s);
    if (((dpI)this.eWL).bep() >= 3)
      this.gIZ = (((dpI)this.eWL).a(2, s, dNF.meh) == 1);
  }

  private void bO(short paramShort) {
    if (((dpI)this.eWL).bep() == 4) {
      if ((this.evo == null) || (!(this.evo instanceof dhJ))) {
        K.error("Impossible de poser la zone, le caster n'est pas valide");
        return;
      }

      int i = ((dpI)this.eWL).a(1, paramShort, dNF.meh);
      dCi localdCi = ((dhJ)this.evo).auK();
      if (localdCi == null) {
        K.error("Impossible de poser la zone, le caster n'a pas d'inventaire de sort");
        return;
      }
      bfE localbfE = (bfE)localdCi.hh(i);
      if (localbfE == null) {
        K.error("Impossible de poser la zone, l'inventaire de sort ne contient pas le sort " + i + ", breed caster : " + ((dhJ)this.evo).uO());

        return;
      }
      this.gIY = localbfE.nU();

      float f = ((dpI)this.eWL).o(3, paramShort);
      this.gIY = ((short)(int)(this.gIY * f));
    } else if (((dpI)this.eWL).bep() >= 2) {
      this.gIY = ((short)((dpI)this.eWL).a(1, paramShort, dNF.meh));
    } else {
      this.gIY = cVC();
    }
  }

  public void aK()
  {
    if ((this.gIX != null) && (!this.gIZ) && (bkM()))
      this.ejP.LC().h(this.gIX);
    super.aK();
  }

  public qM aF() {
    return by;
  }

  public void ge(boolean paramBoolean) {
    this.gIZ = paramBoolean;
  }

  public void cD(short paramShort) {
    this.gIY = paramShort;
  }

  public aAn bQj() {
    return this.gIX;
  }

  public cCH lJ()
  {
    return this.gJe;
  }

  public static cjK a(dpI paramdpI, bqk parambqk)
  {
    short s = parambqk.nU();
    int i = paramdpI.a(0, s, dNF.meh);
    return bMF.bUo().fo(i);
  }

  public void h(CG paramCG) {
    this.gJc = paramCG;
  }
}