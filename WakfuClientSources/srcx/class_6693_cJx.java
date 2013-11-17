public class cJx extends cGj
{
  public static final String ciu = "iconUrl";
  public static final String aLh = "description";
  private final deN iHF;

  public cJx(deN paramdeN)
  {
    this.iHF = paramdeN;
  }

  public String[] getFields() {
    return null;
  }

  private boolean isComplete() {
    bCP localbCP = byv.bFN().bFO().bGa();
    return (!localbCP.lZ(this.iHF.abU())) || (localbCP.ma(this.iHF.abU()));
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("iconUrl")) {
      return isComplete() ? ay.bd().a("protectorSecretIconUrl", "defaultIconPath", new Object[] { Integer.valueOf(this.iHF.abW()) }) : ay.bd().a("protectorSecretIconUrl", "defaultIconPath", new Object[] { Integer.valueOf(this.iHF.abV()) });
    }

    if (paramString.equals("description")) {
      return isComplete() ? bU.fH().b(95, this.iHF.cPc(), new Object[0]) : bU.fH().getString("protector.secret.notFound");
    }

    return null;
  }
}