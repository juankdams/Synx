public class arj extends csl
{
  public arj aDl()
  {
    return new arj();
  }

  public boolean isEnabled() {
    byz localbyz = byv.bFN().bFO();
    if (!localbyz.bSw()) {
      return false;
    }

    if (aDm()) {
      return false;
    }

    return super.isEnabled();
  }

  private boolean aDm() {
    byz localbyz = byv.bFN().bFO();
    if (!localbyz.bSw()) {
      return true;
    }

    int i = localbyz.bSt().CF();
    short s = localbyz.Lk();
    brW localbrW = ars.dzL.aL(s);
    return (localbrW != null) && (localbrW.getId() != i);
  }

  public String getLabel()
  {
    String str = super.getLabel();
    lZ locallZ = new lZ().a(str);
    if (!byv.bFN().bFO().bSw()) {
      locallZ.tH().tI().am(ict).a(bU.fH().getString("group.error.not_in_guild")).tJ();
    }
    return locallZ.tP();
  }
}