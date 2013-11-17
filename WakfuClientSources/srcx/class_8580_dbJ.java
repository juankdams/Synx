public class dbJ extends dDv
{
  private bmb kTV;
  protected final cgR fDt;
  private final String kTW;
  private final String kTX;
  private boolean dLG;

  public dbJ(String paramString1, String paramString2)
  {
    this(paramString1, paramString2, new cgR(new cbW[] { new cbW("gStrength", bHf.gFo) }));
  }

  public dbJ(String paramString1, String paramString2, cgR paramcgR) {
    this.fDt = paramcgR;
    this.kTW = paramString1;
    this.kTX = paramString2;
  }

  public void eS(boolean paramBoolean) {
    this.dLG = paramBoolean;
  }

  public void L(boolean paramBoolean)
  {
    super.L(paramBoolean);
    if (paramBoolean) {
      if (this.kTV == null) {
        this.kTV = new bmb(this.kTW, this.kTX, this.fDt);
        this.kTV.eS(this.dLG);
        Pb.aaU().a(this.kTV);
      }
    }
    else if (this.kTV != null) {
      Pb.aaU().b(this.kTV);
      this.kTV = null;
    }
  }

  public void update(int paramInt)
  {
    super.update(paramInt);
    this.fDt.setFloat("gStrength", xP());
  }

  public void clear()
  {
  }

  public void a(bSr parambSr)
  {
  }
}