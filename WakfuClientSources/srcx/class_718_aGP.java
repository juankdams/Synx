public class aGP extends cGj
  implements bbk
{
  public static final String dHB = "size";
  public static final String eef = "inventory";
  public static final String eeg = "editable";
  private aEq eeh;

  public aGP(aEq paramaEq)
  {
    this.eeh = paramaEq;
    this.eeh.a(this);
  }

  public String[] getFields() {
    return null;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("size"))
      return Short.valueOf(this.eeh.aQC().cFy());
    Object localObject;
    if (paramString.equals("inventory")) {
      localObject = this.eeh.aQC();
      Object[] arrayOfObject = new Object[((bCJ)localObject).cHT().cFy()];
      gA[] arrayOfgA = (gA[])((bCJ)localObject).cHT().a(new gA[((bCJ)localObject).cHT().cFy()]);
      cty localcty = new cty();
      int i = 0; for (int j = arrayOfgA.length; i < j; i++) {
        if (arrayOfgA[i] == null)
          arrayOfObject[i] = localcty;
        else {
          arrayOfObject[i] = arrayOfgA[i];
        }
      }
      return arrayOfObject;
    }if (paramString.equals("editable")) {
      localObject = this.eeh.abI();
      return Boolean.valueOf((((EA)localObject).sN() == byv.bFN().bFO().getId()) || (deV.jF(((EA)localObject).sN())));
    }

    return null;
  }

  public aEq aSS() {
    return this.eeh;
  }

  public void a(bNz parambNz) {
    dLE.doY().a(this, new String[] { "inventory" });
  }
}