import org.apache.log4j.Logger;

public class dbi extends cSx
{
  private static Logger K = Logger.getLogger(dbi.class);

  private boolean dBi = false;

  public dbi(aNL paramaNL, boolean paramBoolean)
  {
    this.dBi = paramBoolean;
    this.kET = paramaNL;
  }

  public boolean isSelected()
  {
    return this.dBi;
  }

  public void setSelected(boolean paramBoolean)
  {
    this.dBi = paramBoolean;
  }

  public CH mp()
  {
    return CH.bGB;
  }

  public void bc()
  {
    super.bc();
    this.dBi = false;
  }

  public void aJ()
  {
    super.aJ();
  }
}