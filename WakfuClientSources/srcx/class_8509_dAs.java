public class dAs extends cGj
  implements cNg
{
  public static final String bC = "name";
  public static final String bsQ = "price";
  public static final String ceY = "isActivated";
  public static final String ceZ = "isEnabled";
  public static final String lHx = "errorText";
  public static final String[] bF = { "name", "price" };
  private final long lHy;
  private final cPT lHz;
  private final boolean bur;

  public dAs(cPT paramcPT, long paramLong, boolean paramBoolean)
  {
    this.lHz = paramcPT;
    this.lHy = paramLong;
    this.bur = paramBoolean;
  }

  public String[] getFields() {
    return bF;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("name"))
      return getName();
    if (paramString.equals("price"))
      return Integer.valueOf(qW());
    if (paramString.equals("isEnabled"))
      return Boolean.valueOf(this.bur);
    if (paramString.equals("isActivated"))
      return Boolean.valueOf(isActive());
    if (paramString.equals("errorText")) {
      lZ locallZ = new lZ();
      byz localbyz = byv.bFN().bFO();
      if (qW() > 0) if (!bGP.gDv.a(new aGH[] { localbyz })) {
          if (locallZ.length() == 0)
            locallZ.tH();
          locallZ.a(bU.fH().getString("error.playerNotSubscribed"));
        }

      bZA localbZA = this.lHz.F();
      if ((localbZA != null) && (!this.bur)) {
        if (locallZ.length() > 0)
          locallZ.tH();
        locallZ.a(daj.a(localbZA));
      }

      if (qW() > localbyz.JE()) {
        if (locallZ.length() > 0)
          locallZ.tH();
        locallZ.a(bU.fH().getString("error.notEnoughKamas"));
      }
      if (locallZ.length() > 0) {
        String str = locallZ.tP();
        locallZ = new lZ();
        locallZ.tI().am(bNa.gRz.bUV());
        locallZ.a(str);
        locallZ.tJ();
      }

      return locallZ.length() == 0 ? null : locallZ.tP();
    }
    return null;
  }

  public long getId() {
    return this.lHz.cGX() == this.lHy ? this.lHz.cGW() : this.lHz.cGX();
  }

  public String getName() {
    return bU.fH().b(83, (int)getId(), new Object[0]);
  }

  public boolean isActive()
  {
    return true;
  }

  public int qW() {
    awT localawT = byv.bFN().bFO().bGF();
    return ccm.a(localawT, this.lHz) ? this.lHz.qW() : 0;
  }
}