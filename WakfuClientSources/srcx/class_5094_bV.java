public class bV extends btY
{
  public bV(int paramInt1, int paramInt2, int paramInt3)
  {
    super(paramInt1, paramInt1, paramInt2, paramInt3);
  }

  protected String getName() {
    return bU.fH().b(37, this.aDH, new Object[0]);
  }

  protected boolean isProtected() {
    return bWW.ccf().FB().aKu().iB(this.aDH);
  }

  protected boolean fI() {
    return true;
  }

  protected String fJ() {
    return ay.bd().a("ecosystemDifficultyIconsPath", "defaultIconPath", new Object[] { Integer.valueOf(this.aDH), Integer.valueOf(fK() ? 1 : fL() ? 2 : 0) });
  }

  protected boolean fK()
  {
    acy localacy = dcK.cOf().zJ(this.aDH);
    return localacy.aoS() < 0.2F;
  }

  protected boolean fL() {
    acy localacy = dcK.cOf().zJ(this.aDH);
    return (localacy.aoS() < 0.05F) && (!localacy.aoX());
  }

  public boolean fM() {
    return false;
  }

  public String fN() {
    return bU.fH().b(100, this.aDH, new Object[0]);
  }
}