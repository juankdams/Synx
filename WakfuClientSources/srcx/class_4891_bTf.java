public class bTf extends dqt
{
  private Su ehe;

  public bTf(int paramInt1, int paramInt2, int paramInt3, Su paramSu)
  {
    super(paramInt1, paramInt2, paramInt3);
    tX(paramInt1);
    tY(paramInt2);
    tZ(paramInt3);
    aH(paramSu);
  }

  protected long mC() {
    cew localcew = this.ehe.aeL();
    if (localcew.J("AnimTransEffect-Fin")) {
      localcew.eq("AnimTransEffect-Fin");

      return localcew.H("AnimTransEffect-Fin");
    }
    bZJ();
    return 0L;
  }

  private void bZJ()
  {
    cew localcew = this.ehe.aeL();
    this.ehe.gE(0);
    this.ehe.aek();
    localcew.a(localcew.atx(), new Cz(this, localcew));

    dLE.doY().a(this.ehe, new String[] { "name", "nameAndLevel" });
  }

  protected void kO()
  {
    bZJ();
  }

  public Su aUs() {
    return this.ehe;
  }

  public void aH(Su paramSu) {
    this.ehe = paramSu;
  }
}