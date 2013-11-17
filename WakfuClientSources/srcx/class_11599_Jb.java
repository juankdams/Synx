public class Jb extends btY
{
  public Jb(int paramInt1, int paramInt2, int paramInt3)
  {
    super(paramInt1, bRu.bYI().tP(paramInt1).ckB(), paramInt2, paramInt3);
  }

  protected String getName() {
    return bU.fH().b(38, this.aDH, new Object[0]);
  }

  protected boolean isProtected() {
    return bWW.ccf().FB().aKu().iA(this.aDH);
  }

  protected boolean fI() {
    return true;
  }

  protected String fJ() {
    if (fL())
      return cwv.iic.wW(this.gdo);
    if (fK()) {
      return cwv.iib.wW(this.gdo);
    }
    return cwv.iia.wW(this.gdo);
  }

  protected boolean fK()
  {
    acy localacy = blo.bws().qc(this.aDH);
    return localacy.aoS() < 0.2F;
  }

  protected boolean fL() {
    acy localacy = blo.bws().qc(this.aDH);
    return (localacy.aoS() < 0.05F) && (!localacy.aoX());
  }

  public boolean fM() {
    return true;
  }

  public String fN() {
    return bU.fH().b(100, bcz.fmD.bqH(), new Object[0]);
  }
}