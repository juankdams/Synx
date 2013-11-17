public class asY extends cGj
{
  public static final String dCW = "new";
  public static final String cTv = "title";
  public static final String dCX = "issueNumber";
  public static final String dCY = "unlocked";
  private final Bn dCZ;
  private final dxL aPJ;
  private int dDa;

  public asY(Bn paramBn, dxL paramdxL)
  {
    this.dCZ = paramBn;
    this.aPJ = paramdxL;
  }

  public String[] getFields() {
    return null;
  }

  public int getId() {
    return this.dCZ.getId();
  }

  public void kd(int paramInt) {
    this.dDa = paramInt;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("new"))
      return Boolean.valueOf(!cFD.iAd.xF(this.dCZ.getId()));
    if (paramString.equals("title")) {
      if (VC())
        return bU.fH().b(121, this.dCZ.getId(), new Object[0]);
      return "???";
    }if (paramString.equals("issueNumber"))
      return Integer.valueOf(this.dDa);
    if (paramString.equals("unlocked")) {
      return Boolean.valueOf(VC());
    }
    return null;
  }

  public boolean VC()
  {
    if (this.aPJ.avJ()) {
      return true;
    }
    dxL localdxL = dDE.dft().VN();
    return localdxL.T(this.aPJ);
  }

  void aEZ() {
    dLE.doY().a(this, new String[] { "new" });
  }
}