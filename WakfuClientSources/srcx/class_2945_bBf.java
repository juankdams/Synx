public class bBf extends csl
{
  public bBf bJQ()
  {
    return new bBf();
  }

  public boolean isEnabled() {
    byz localbyz = byv.bFN().bFO();
    return !localbyz.bSw();
  }

  public String getLabel()
  {
    String str = super.getLabel();
    lZ locallZ = new lZ().a(str);
    if (byv.bFN().bFO().bSw())
      locallZ.tH().tI().am(ict).a(bU.fH().getString("error.guild.alreadyInGuild")).tJ();
    return locallZ.tP();
  }
}