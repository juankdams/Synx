public abstract class ass
{
  private final bTF dCk;
  private final String UV;
  private final PX dCl = new PX();

  public ass(bTF parambTF, String paramString) {
    this.dCk = parambTF;
    this.UV = paramString;
  }

  public int h(byte paramByte, int paramInt) {
    return this.dCl.c(paramByte, paramInt);
  }

  public void aEI() {
    this.dCl.clear();
  }

  public bTF aEJ() {
    return this.dCk;
  }

  public String getAnimName() {
    return this.UV;
  }

  public PX aEK() {
    return this.dCl;
  }

  public abstract dPl yJ();

  public abstract cCH yI();
}