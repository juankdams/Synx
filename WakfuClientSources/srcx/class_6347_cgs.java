import org.apache.log4j.Logger;

public class cgs extends bxE
{
  public static final String TAG = "Spring";
  private static Logger K = Logger.getLogger(cgs.class);
  private int cxl;
  private String hEf;
  private String bat;
  private String hEg;
  public static final int hEh = "edge".hashCode();
  public static final int hEi = "referentEdge".hashCode();
  public static final int hEj = "referentId".hashCode();
  public static final int crX = "value".hashCode();

  public cgs()
  {
    this.cxl = 0;
  }

  public String getEdge()
  {
    return this.bat;
  }

  public void setEdge(String paramString)
  {
    this.bat = paramString;
  }

  public String getReferentEdge()
  {
    return this.hEg;
  }

  public void setReferentEdge(String paramString)
  {
    this.hEg = paramString;
  }

  public String getTag()
  {
    return "Spring";
  }

  public int getValue()
  {
    return this.cxl;
  }

  public void setValue(int paramInt)
  {
    this.cxl = paramInt;
  }

  public String toString()
  {
    return Integer.toString(getValue());
  }

  public static cgs a(cgs paramcgs1, cgs paramcgs2)
  {
    return new ciU(paramcgs1, paramcgs2);
  }

  public static cgs b(cgs paramcgs1, cgs paramcgs2) {
    return a(paramcgs1, new dMG(paramcgs2));
  }

  public static cgs vi(int paramInt) {
    return new cKQ(paramInt);
  }

  public static cgs p(dOc paramdOc) {
    return new su(paramdOc);
  }

  public static cgs q(dOc paramdOc) {
    return new dyM(paramdOc);
  }

  public static cgs r(dOc paramdOc) {
    return new aei(paramdOc);
  }

  public static cgs s(dOc paramdOc) {
    return new aWF(paramdOc);
  }

  public String getReferentId()
  {
    return this.hEf;
  }

  public void setReferentId(String paramString)
  {
    this.hEf = paramString;
  }

  public void bc()
  {
    super.bc();
    this.bat = null;
    this.hEg = null;
    this.hEf = null;
    this.cxl = 0;
  }

  public boolean setXMLAttribute(int paramInt, String paramString, aKN paramaKN)
  {
    if (paramInt == hEh)
      setEdge(paramaKN.gL(paramString));
    else if (paramInt == hEi)
      setReferentEdge(paramaKN.gL(paramString));
    else if (paramInt == hEj)
      setReferentId(paramaKN.gL(paramString));
    else if (paramInt == crX)
      setValue(bUD.aR(paramString));
    else {
      return super.setXMLAttribute(paramInt, paramString, paramaKN);
    }

    return true;
  }

  public boolean setPropertyAttribute(int paramInt, Object paramObject) {
    return super.setPropertyAttribute(paramInt, paramObject);
  }
}