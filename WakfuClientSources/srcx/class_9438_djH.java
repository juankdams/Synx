public final class djH extends cGj
{
  public static final String bC = "name";
  public static final String lgJ = "levelMin";
  public static final String lgK = "levelMax";
  public static final String lgL = "priceMin";
  public static final String lgM = "priceMax";
  public static final String lgN = "isLowestPrice";
  private short bNX = -1;
  private short aSh = -1;
  private String m_name;
  private bfb lgO = new bfb();

  public String[] bF = { "name", "levelMin", "levelMax", "priceMin", "priceMax", "isLowestPrice" };

  public String[] getFields()
  {
    return this.bF;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("name")) {
      if ((this.m_name == null) || (this.m_name.length() == 0)) {
        cpa localcpa = cBQ.cxL().coO().nf("marketDialog");
        if (localcpa != null) {
          aTp localaTp = (aTp)localcpa.fi("textEditor");
          if (localaTp != null) {
            return localaTp.getGhostText();
          }
        }
      }
      return this.m_name;
    }if (paramString.equals("levelMin"))
      return this.bNX == -1 ? "" : Short.valueOf(this.bNX);
    if (paramString.equals("levelMax"))
      return this.aSh == -1 ? "" : Short.valueOf(this.aSh);
    int i;
    if (paramString.equals("priceMin")) {
      i = this.lgO.bsB();
      return i == -1 ? "" : Integer.valueOf(i);
    }if (paramString.equals("priceMax")) {
      i = this.lgO.bsC();
      return i == -1 ? "" : Integer.valueOf(i);
    }if (paramString.equals("isLowestPrice")) {
      return Boolean.valueOf(this.lgO.bsz());
    }
    return null;
  }

  public short Qb() {
    return this.bNX;
  }

  public void H(short paramShort) {
    this.bNX = paramShort;
  }

  public short nV() {
    return this.aSh;
  }

  public void I(short paramShort) {
    this.aSh = paramShort;
  }

  public String getName() {
    return this.m_name;
  }

  public void setName(String paramString) {
    this.m_name = paramString;
  }

  public bfb cSz() {
    return this.lgO;
  }

  public void a(bfb parambfb) {
    this.lgO = parambfb;
  }
}