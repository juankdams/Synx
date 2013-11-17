import org.apache.log4j.Logger;

public class ctE extends zo
{
  private boolean idN = false;
  private boolean idO = false;
  private bDi idP;

  private ctE(cTK paramcTK)
  {
    super(paramcTK);
  }

  public static ctE k(cTK paramcTK) {
    ctE localctE = new ctE(paramcTK);
    localctE.reset();
    localctE.a(new bWR(localctE));
    return localctE;
  }

  public void a(bDi parambDi) {
    this.idP = parambDi;
  }

  public bDi crd() {
    return this.idP;
  }

  public void a(cvY paramcvY)
  {
    super.a(paramcvY);
    this.idP = new bWR(this);
    this.idN = paramcvY.biE();
    this.idO = paramcvY.biG();
  }

  public void m(aYr paramaYr)
  {
    super.m(paramaYr);
    Su localSu = (Su)this.eQI;
    if (localSu.aeI()) {
      bPE.bWu().m(paramaYr);
      bjv.ir(paramaYr == null ? bjv.fzX : bPE.bWu().getName());
      dLE.doY().a(byv.bFN().bFO(), new String[] { "hasNation" });

      K.info("Définition de la nation : " + paramaYr);
    }

    if (this.idP != null)
      this.idP.o(paramaYr);
  }

  public void c(aYr paramaYr)
  {
    super.c(paramaYr);
    this.idN = false;
    this.idO = false;
  }

  public void reset()
  {
    super.reset();

    this.btD.clear();
    this.btG.clear();
    this.btH = false;

    if (this.btF != null) {
      this.btF.reset();
      HV();
    }
  }

  public boolean biE() {
    return (this.idN) || (super.biE());
  }

  public void hx(boolean paramBoolean) {
    this.idN = paramBoolean;

    if (this.idP != null)
      this.idP.bLF();
  }

  public void dN(int paramInt)
  {
    this.btE = paramInt;
    if (this.btF != null) {
      K.info("Cooldown de Purgation déjà démarré");
      return;
    }
    this.btF = new avS(this);
    dka.cSF().a(this.btF, 1000L, -1);
    this.btF.aHU();
  }

  public void HV() {
    dka.cSF().j(this.btF);
    HR();
    this.btF = null;
    this.btE = -1;
  }

  public void HU() {
    dka.cSF().j(this.btF);
    this.btF.aHT();
    this.btF = null;
    this.btE = -1;
  }

  public void st(int paramInt) {
    if (this.idP != null)
      this.idP.st(paramInt);
  }

  public void cP(int paramInt1, int paramInt2) {
    dkI localdkI = dwC.dbQ().BQ(paramInt2);
    int i = this.btD.get(paramInt1) - paramInt2;

    ((bKm)this.eQI).a(paramInt1, this, localdkI, dJ(paramInt1), i);

    if (this.btE == paramInt1) {
      if (this.btF != null)
        this.btF.bq(i, paramInt2);
      else
        K.warn("Données erronées dans le client, on ne peut pas purger une peine de prison sans avoir de cooldown");
    }
    if (this.idP != null)
      this.idP.cP(paramInt1, paramInt2);
  }

  public cTK bDq() {
    return this.eQI;
  }

  public void bLG() {
    if (this.idP != null)
      this.idP.bLG();
  }

  public void cre() {
    if (this.idP != null)
      this.idP.adq();
  }

  public void crf() {
    this.btG.clear();
  }

  public void an(boolean paramBoolean) {
    super.an(paramBoolean);
    if (this.idP != null)
      this.idP.bLH();
  }

  public boolean biG()
  {
    return this.idO;
  }

  public void hy(boolean paramBoolean)
  {
    this.idO = paramBoolean;
  }

  public void b(Yp paramYp) {
    super.b(paramYp);
    cre();
  }
}