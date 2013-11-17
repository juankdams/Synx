public class aKG
  implements dBv
{
  public static final String cXf = "index";
  public static final String eok = "color";
  public static final String eol = "factor";
  public static String[] bF = { "index", "color", "factor" };
  private final int m_index;
  private final bNa bPo;
  private int cAU;

  public aKG(int paramInt, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    this.m_index = paramInt;
    this.bPo = new bNa(paramFloat1, paramFloat2, paramFloat3, 1.0F);
  }

  public float QC() {
    return this.bPo.QC();
  }

  public float QD() {
    return this.bPo.QD();
  }

  public float QE() {
    return this.bPo.QE();
  }

  public bNa getColor() {
    return this.bPo;
  }

  public void mT(int paramInt) {
    this.cAU = paramInt;
  }

  public float[] bcl() {
    return new float[] { QC() * 1.25F, QD() * 1.25F, QE() * 1.25F, 1.0F };
  }

  public int getIndex()
  {
    return this.m_index;
  }

  public String[] getFields() {
    return bF;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("index")) {
      return Integer.valueOf(this.m_index);
    }
    if (paramString.equals("color")) {
      return this.bPo;
    }
    if (paramString.equals("factor")) {
      return Integer.valueOf(this.cAU);
    }
    return null;
  }

  public void a(String paramString, Object paramObject) {
  }

  public void b(String paramString, Object paramObject) {
  }

  public void c(String paramString, Object paramObject) {
  }

  public boolean l(String paramString) {
    return false;
  }

  public static void a(aKG paramaKG, cew paramcew, int paramInt) {
    float[] arrayOfFloat = paramaKG != null ? paramaKG.bcl() : null;
    paramcew.e(paramInt, arrayOfFloat);
  }

  public boolean equals(Object paramObject)
  {
    if (this == paramObject)
      return true;
    if ((paramObject == null) || (getClass() != paramObject.getClass())) {
      return false;
    }
    aKG localaKG = (aKG)paramObject;

    if (this.cAU != localaKG.cAU)
      return false;
    if (this.m_index != localaKG.m_index)
      return false;
    if (this.bPo != null ? !this.bPo.equals(localaKG.bPo) : localaKG.bPo != null) {
      return false;
    }
    return true;
  }

  public int hashCode()
  {
    int i = this.m_index;
    i = 31 * i + (this.bPo != null ? this.bPo.hashCode() : 0);
    i = 31 * i + this.cAU;
    return i;
  }
}