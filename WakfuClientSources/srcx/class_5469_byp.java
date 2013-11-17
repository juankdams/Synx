public class byp extends aXi
{
  public byp(String paramString, int paramInt)
  {
    this.m_name = paramString;
    this.aSg = paramInt;
  }

  public byp() {
  }

  public aXi arH() {
    return new byp(this.m_name, this.aSg);
  }

  public boolean isEnabled() {
    return this.bur;
  }

  public String getLabel() {
    lZ locallZ = new lZ().tz().am(isEnabled() ? icr : ict);
    locallZ.a(bU.fH().getString(this.m_name)).tA();
    return locallZ.tP();
  }
}