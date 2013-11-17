public class aAz extends cGj
  implements cSS
{
  public static final String dTe = "isToday";
  public static final String dTf = "isEnabled";
  public static final String dTg = "dateTitle";
  public static final String dTh = "entry";
  private final dxL bXQ;
  private final int dTi;

  public aAz(dxL paramdxL)
  {
    this.bXQ = new cYq(paramdxL);

    aiX localaiX = Oj.cfd.l(paramdxL);
    this.dTi = localaiX.getId();
  }

  public dxL VN() {
    return this.bXQ;
  }

  public int mw() {
    return this.bXQ.getDay();
  }

  public Object getContent() {
    return this;
  }

  public String[] getFields() {
    return null;
  }

  public Object getFieldValue(String paramString)
  {
    Object localObject;
    if (paramString.equals("dateTitle")) {
      localObject = new lZ();
      ((lZ)localObject).bw(this.bXQ.getDay()).e(' ');
      ((lZ)localObject).a(bU.fH().getString("calendar.month.", new Object[] { Integer.valueOf(this.bXQ.getMonth()) }));
      return ((lZ)localObject).tP();
    }if (paramString.equals("isToday")) {
      localObject = dBW.lJB.deO();
      return Boolean.valueOf((((cYq)localObject).getDay() == this.bXQ.getDay()) && (((cYq)localObject).getMonth() == this.bXQ.getMonth()));
    }if (paramString.equals("entry"))
      return xS.bqG.dG(this.dTi);
    if (paramString.equals("isEnabled")) {
      return Boolean.valueOf(!aMy());
    }
    return null;
  }

  public boolean aMy() {
    dxL localdxL = dDE.dft().VN();
    return (this.bXQ.S(localdxL)) || (this.bXQ.Q(cGN.iBV));
  }

  void aMz() {
    dLE.doY().a(this, new String[] { "isToday" });
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("AlmanachDateView");
    localStringBuilder.append("{m_date=").append(this.bXQ);
    localStringBuilder.append(", m_entryId=").append(this.dTi);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}