import java.util.ArrayList;

public class dFP extends cGj
{
  public static final String aGo = "title";
  public static final String lQm = "levelDesc";
  public static final String RI = "description";
  public static final String aIE = "type";
  public static final String dtM = "buffs";
  public static final String lQn = "firstGroup";
  public static final String lQo = "secondGroup";
  public static final String lQp = "thirdGroup";
  public static final String[] bF = { "title", "levelDesc", "description", "type", "buffs", "firstGroup", "secondGroup", "thirdGroup" };
  private aBU lQq;
  private static final int lQr = 3;
  private final int fBv;
  private bTk lQs = null;
  private bTk lQt = null;
  private bTk lQu = null;

  public dFP(aBU paramaBU)
  {
    this.lQq = paramaBU;
    ArrayList localArrayList = this.lQq.cGs();
    this.lQs = (localArrayList.size() > 0 ? new aeD((aEW)localArrayList.get(0)) : new rc());
    this.lQt = (localArrayList.size() > 1 ? new aeD((aEW)localArrayList.get(1)) : new rc());
    this.lQu = (localArrayList.size() > 2 ? new aeD((aEW)localArrayList.get(2)) : new rc());
    this.fBv = paramaBU.cGt().Lm();
  }

  public String[] getFields()
  {
    return bF;
  }

  public Object getFieldValue(String paramString)
  {
    dVR localdVR;
    if (paramString.equals("title")) {
      localdVR = aqx.dyc.jx(this.lQq.cGt().Lk());
      return localdVR.getName();
    }
    if (paramString.equals("description")) {
      localdVR = aqx.dyc.jx(this.lQq.cGt().Lk());
      return localdVR.getDescription();
    }if (paramString.equals("levelDesc"))
      return Integer.valueOf(this.fBv);
    if (paramString.equals("type"))
      return Integer.valueOf(this.lQq.cGt().Ll().ordinal());
    if (paramString.equals("buffs"))
    {
      return null;
    }if (paramString.equals("firstGroup"))
      return this.lQs;
    if (paramString.equals("secondGroup"))
      return this.lQt;
    if (paramString.equals("thirdGroup")) {
      return this.lQu;
    }
    return null;
  }

  public aBU dhg() {
    return this.lQq;
  }
}