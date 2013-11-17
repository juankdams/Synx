public class cPx
  implements bYw
{
  private String bYJ;
  private String kyB;
  private String aDk;
  private boolean kyC;
  private boolean aDl = false;

  public cPx(K paramK) {
    if ((!paramK.getName().equalsIgnoreCase("font")) || (paramK.e("font") == null) || (paramK.e("id") == null))
    {
      return;
    }

    this.kyC = false;
    if (paramK.e("bordered") != null) {
      this.kyC = paramK.e("bordered").getBooleanValue();
    }

    this.kyB = paramK.e("definition").getStringValue();
    this.aDk = paramK.e("font").getStringValue();
    this.bYJ = paramK.e("id").getStringValue();

    this.aDl = true;
  }

  public void a(uk paramuk) {
    if (this.aDl)
      paramuk.a(this.bYJ, this.kyB, this.aDk, this.kyC);
  }

  public void a(bKD parambKD)
  {
    if (!this.aDl) {
      return;
    }

    String str = parambKD.bSL();

    parambKD.a(new bol(null, "loadFont", str, new String[] { "\"" + this.bYJ + "\"", "\"" + this.kyB + "\"", "\"" + this.aDk + "\"", String.valueOf(this.kyC) }));
  }

  public boolean isInitialized()
  {
    return true;
  }
}