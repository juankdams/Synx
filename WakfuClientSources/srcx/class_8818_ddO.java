public class ddO extends cGj
  implements dTe
{
  private String cuv;
  private int cGS;
  private short aFe;
  private bVw bsZ;

  public String[] getFields()
  {
    return bF;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("iconUrl"))
      return ay.bd().v(this.bsZ.oc());
    if (paramString.equals("name"))
      return this.bsZ.getName() + " x" + this.aFe;
    if (paramString.equals("quantity"))
      return Short.valueOf(this.aFe);
    if (paramString.equals("allowControls")) {
      return Boolean.valueOf(true);
    }
    return this.bsZ.getFieldValue(paramString);
  }

  public boolean K(boolean paramBoolean) {
    if (paramBoolean)
      this.aFe = 0;
    else {
      this.aFe = ((short)(this.aFe - 1));
    }

    if (this.aFe == 0) {
      return true;
    }

    dLE.doY().a(this, new String[] { "quantity" });
    return false;
  }

  public bVw Hu() {
    return this.bsZ;
  }

  public String aSq() {
    return this.cuv;
  }

  public static ddO a(cxN paramcxN) {
    try {
      ddO localddO = new ddO();
      localddO.cuv = paramcxN.ght;
      localddO.cGS = paramcxN.bPw;
      localddO.aFe = paramcxN.aDf;

      localddO.bsZ = ((bVw)Hh.QM().dh(localddO.cGS));
      if (localddO.bsZ == null)
        throw new IllegalArgumentException("L'item de refId=" + paramcxN.bPw + " n'existe pas");
      return localddO;
    } catch (Exception localException) {
      throw new aSc(localException);
    }
  }
}