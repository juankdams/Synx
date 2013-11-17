import java.util.Locale;

public class bMC
  implements bwK
{
  private static final String gQn = "GetEvent";
  private static final String aCv = "sLang";
  private static final String gQo = "sDate";
  private final dxL bXQ;

  public bMC(dxL paramdxL)
  {
    this.bXQ = paramdxL;
  }

  public bcx mu() {
    cVe localcVe = new cVe("GetEvent");
    String str = bU.fH().ajJ().cAZ().getLanguage();

    localcVe.bd("sLang", str);
    localcVe.bd("sDate", I(this.bXQ));

    bcx localbcx = new bcx();
    localbcx.a(localcVe);

    return localbcx;
  }

  private static String I(dxL paramdxL) {
    if ((paramdxL == null) || (paramdxL.avJ())) {
      return "";
    }
    StringBuilder localStringBuilder = new StringBuilder();
    int i = paramdxL.getYear();
    int j = paramdxL.getMonth();
    int k = paramdxL.getDay();
    localStringBuilder.append(i).append('-');
    if (j < 10)
      localStringBuilder.append('0');
    localStringBuilder.append(j).append('-');
    if (k < 10)
      localStringBuilder.append('0');
    localStringBuilder.append(k);
    return localStringBuilder.toString();
  }

  public dxL VN() {
    return this.bXQ;
  }

  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject == null) || (getClass() != paramObject.getClass())) {
      return false;
    }

    bMC localbMC = (bMC)paramObject;
    return this.bXQ.equals(localbMC.bXQ);
  }

  public int hashCode()
  {
    return this.bXQ.hashCode();
  }

  public String toString()
  {
    return "GetEvent{m_date=" + this.bXQ + '}';
  }
}