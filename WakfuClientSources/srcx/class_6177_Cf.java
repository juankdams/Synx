public class Cf extends dFr
{
  public static final String TAG = "ToggleButtonAppearance";
  public static final String bEI = "selected";
  public static final String bEJ = "disabledSelected";
  public static final String bEK = "mouseHoverSelected";
  public static final String bEL = "pressedSelected";
  protected boolean ayD;

  public String getTag()
  {
    return "ToggleButtonAppearance";
  }

  public boolean isChecked()
  {
    return this.ayD;
  }

  public boolean Li()
  {
    this.ayD = (!this.ayD);

    dbi localdbi = new dbi(this.aPS, this.ayD);
    boolean bool = this.aPS.g(localdbi);

    cre();
    return bool;
  }

  protected void Lj()
  {
    if (this.ayD)
      setEnabled(getEnableLabel(), true);
    else
      super.Lj();
  }

  private String getEnableLabel()
  {
    if (!this.bur)
      return "disabledSelected";
    if (!this.lPw)
      return "selected";
    if (!this.lPv)
      return "mouseHoverSelected";
    return "pressedSelected";
  }

  public void c(bdj parambdj)
  {
    Cf localCf = (Cf)parambdj;
    super.c(localCf);
    localCf.ayD = this.ayD;
  }

  public void aJ()
  {
    super.aJ();

    this.ayD = false;
  }
}