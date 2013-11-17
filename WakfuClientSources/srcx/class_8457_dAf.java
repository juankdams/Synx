public class dAf extends dDv
{
  public static final bNa lGN = new bNa(0.8F, 0.8F, 0.8F, 0.8F);
  private int lGO;
  private int lGP;
  private int lGQ;
  private final bNa lGR = new bNa(lGN);

  public dAf(int paramInt1, int paramInt2)
  {
    this.lGP = paramInt1;
    this.lGQ = paramInt2;
  }

  public dAf() {
    this(5000, 20000);
  }

  public void setColor(bNa parambNa) {
    this.lGR.f(parambNa);
  }

  public void clear() {
  }

  public void reset() {
    super.reset();
    this.lGO = bCO.cL(this.lGP, this.lGQ);
  }

  public void update(int paramInt)
  {
    super.update(paramInt);

    this.lGO -= paramInt;

    if (this.lGO < 0) {
      this.lGO = bCO.cL(this.lGP, this.lGQ);
      anK.a(this.cHC, this.lGR);
    }
  }

  public void a(bSr parambSr)
  {
  }
}