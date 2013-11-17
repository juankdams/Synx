public class dwy extends cGj
{
  public static final String lBS = "hasSomeBonuses";
  public static final String lBT = "applicationBonuses";
  public static final String lBU = "resistanceBonuses";
  private Xg lBV = new Xg();
  private Xg lBW = new Xg();

  public String[] getFields() {
    return null;
  }

  public void reset() {
    this.lBV.clear();
    this.lBW.clear();
    dLE.doY().a(this, new String[] { "hasSomeBonuses", "applicationBonuses", "resistanceBonuses" });
  }

  public Object getFieldValue(String paramString)
  {
    if (paramString.equals("hasSomeBonuses"))
      return Boolean.valueOf((this.lBV.size() > 0) || (this.lBW.size() > 0));
    if (paramString.equals("applicationBonuses"))
      return this.lBV;
    if (paramString.equals("resistanceBonuses")) {
      return this.lBW;
    }
    return null;
  }

  public void k(short paramShort, int paramInt) {
    bST localbST = (bST)this.lBV.get(paramShort);
    if (localbST == null) {
      if (paramInt != 0) {
        this.lBV.put(paramShort, new bST(paramShort, paramInt));
        dLE.doY().a(this, new String[] { "hasSomeBonuses", "applicationBonuses" });
      }

    }
    else if (paramInt == 0) {
      this.lBV.remove(paramShort);
      dLE.doY().a(this, new String[] { "hasSomeBonuses", "applicationBonuses" });
    }
    else
    {
      localbST.setValue(paramInt);
    }
  }

  public void l(short paramShort, int paramInt) {
    bST localbST = (bST)this.lBW.get(paramShort);
    if (localbST == null) {
      if (paramInt != 0) {
        this.lBW.put(paramShort, new bST(paramShort, paramInt));
        dLE.doY().a(this, new String[] { "hasSomeBonuses", "resistanceBonuses" });
      }

    }
    else if (paramInt == 0) {
      this.lBW.remove(paramShort);
      dLE.doY().a(this, new String[] { "hasSomeBonuses", "resistanceBonuses" });
    }
    else
    {
      localbST.setValue(paramInt);
    }
  }
}