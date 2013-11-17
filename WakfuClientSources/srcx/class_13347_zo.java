public abstract class zo extends aTl
{
  private Yp btC = null;

  protected final dFu btD = new dFu();
  protected int btE = -1;
  protected drP btF;
  protected final adz btG = new adz();
  protected boolean btH;

  public zo(cTK paramcTK)
  {
    super(paramcTK);
  }

  public int dJ(int paramInt) {
    return this.btD.get(paramInt);
  }

  public boolean dK(int paramInt) {
    return this.btD.containsKey(paramInt);
  }

  public Yp HK() {
    return this.btC;
  }

  public void b(Yp paramYp)
  {
    this.btC = paramYp;
  }

  public boolean c(Yp paramYp)
  {
    return (this.btC != null) && (this.btC == paramYp);
  }

  public boolean dL(int paramInt)
  {
    aYr localaYr = dsh.luB.BA(paramInt);
    if (localaYr == null) {
      return false;
    }
    aoK localaoK = this.eQI.cJf().UI().aMP();
    dqU localdqU = localaoK.jq(paramInt);

    switch (BC.bDD[localdqU.ordinal()])
    {
    case 1:
      return true;
    case 2:
      return this.btG.contains(paramInt);
    case 3:
      int i = this.btD.get(bP());
      return dwC.dbQ().BQ(i).a(aRk.eOf);
    }
    throw new UnsupportedOperationException("Type d'alignement non reconnu " + localdqU);
  }

  public boolean HL()
  {
    return dL(((dhJ)this.eQI).cQt());
  }

  public int HM()
  {
    return this.btD.get(this.btE);
  }

  public int HN()
  {
    return this.btE;
  }

  public int dM(int paramInt)
  {
    int i = this.btD.ah(this.btE, paramInt, paramInt);
    if (i >= 0)
      this.btD.wH(this.btE);
    return i;
  }

  public int HO() {
    return this.btD.size();
  }

  public int N(int paramInt1, int paramInt2) {
    return this.btD.fg(paramInt1, paramInt2);
  }

  public boolean HP() {
    return !this.btD.isEmpty();
  }

  public aso HQ() {
    return this.btD.abR();
  }

  public void HR() {
    this.btD.wH(this.btE);
  }

  public int[] HS() {
    return this.btD.qe();
  }

  public boolean a(aYr paramaYr) {
    return (paramaYr != null) && (paramaYr != aYr.feh) && (this.btG.hL(paramaYr.bP()));
  }

  public boolean b(aYr paramaYr) {
    return (paramaYr != null) && (this.btG.remove(paramaYr.bP()));
  }

  public adz HT() {
    return this.btG;
  }

  public abstract void dN(int paramInt);

  public abstract void HU();

  public abstract void HV();

  public void c(aYr paramaYr) {
    super.c(paramaYr);
    an(true);
  }

  public void an(boolean paramBoolean) {
    this.btH = paramBoolean;
  }

  public boolean HW() {
    return this.btH;
  }
}