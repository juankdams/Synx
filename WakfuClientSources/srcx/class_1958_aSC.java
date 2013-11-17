public class aSC
  implements awz, dBv
{
  public static final String ePK = "debug.console";
  public static final String ePL = "prompt";
  public static final String ePM = "input";
  public static final String ePN = "logs";
  public static final String[] bF = { "prompt", "input", "logs" };

  private static aSC ePO = new aSC();

  private String ePP = "";
  private String ePQ = "";
  private String ePR = "";

  public aSC()
  {
    dLE localdLE = cBQ.cxL().coO().czu();
    localdLE.t("debug.console", this);
  }

  public static aSC bii()
  {
    return ePO;
  }

  public void setPrompt(String paramString)
  {
    this.ePP = paramString;
    cBQ.cxL().coO().czu().e("debug.console", "prompt", paramString);
  }

  public void err(String paramString)
  {
    String str = new lZ().am("FF0000").a(paramString).a("\n").tP();
    cBQ.cxL().coO().czu().g("debug.console", "logs", str);
  }

  public void log(String paramString)
  {
    String str = new lZ().am("00FF00").a(paramString).a("\n").tP();
    cBQ.cxL().coO().czu().g("debug.console", "logs", str);
  }

  public void s(String paramString, int paramInt) {
    int i = (paramInt & 0xFF) << 16 | paramInt & 0xFF00 | (paramInt & 0xFF0000) >> 16;
    bNa localbNa = new bNa(i);
    String str = new lZ().am(localbNa.bUV()).a(paramString).a("\n").tP();

    cBQ.cxL().coO().czu().g("debug.console", "logs", str);
  }

  public void trace(String paramString)
  {
    cBQ.cxL().coO().czu().g("debug.console", "logs", paramString + "\n");
  }

  public Object getFieldValue(String paramString)
  {
    if (paramString.equals("prompt"))
      return this.ePP;
    if (paramString.equals("input"))
      return this.ePQ;
    if (paramString.equals("logs")) {
      return this.ePR;
    }
    return null;
  }

  public String[] getFields()
  {
    return bF;
  }

  public void a(String paramString, Object paramObject)
  {
    if (paramString.equals("prompt"))
      this.ePP = ((String)paramObject);
    else if (paramString.equals("input"))
      this.ePQ = ((String)paramObject);
    else if (paramString.equals("logs"))
      this.ePR = ((String)paramObject);
  }

  public void c(String paramString, Object paramObject)
  {
    if (paramString.equals("logs"))
      this.ePR += (String)paramObject;
  }

  public void b(String paramString, Object paramObject)
  {
  }

  public boolean l(String paramString)
  {
    if (paramString.equals("logs")) {
      return false;
    }
    return true;
  }
}