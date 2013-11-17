import java.util.Locale;

public class bXA
  implements bwK
{
  private static final String hmJ = "ArticlesSearch";
  private static final String aCu = "sShopKey";
  private static final String aEv = "sLang";
  private static final String TEXT = "sText";
  private static final String hmK = "aCategory";
  private static final String hmL = "iPage";
  private static final String dHB = "iSize";
  private final int ceS;
  private final String hi;
  private final int hmM;
  private final int m_size;
  private final aER hmN;

  public bXA(int paramInt1, int paramInt2, String paramString, int paramInt3, aER paramaER)
  {
    this.ceS = paramInt1;
    this.hmM = paramInt2;
    this.hi = paramString;
    this.m_size = paramInt3;
    this.hmN = paramaER;
  }

  public aER ccU() {
    return this.hmN;
  }

  public bcx mu() {
    cVe localcVe = new cVe("ArticlesSearch");
    String str = bU.fH().ajJ().cAZ().getLanguage();

    dEb localdEb = new dEb();
    localdEb.a(new cQg(this.ceS));

    localcVe.bd("sShopKey", "WAKFU_INGAME");
    localcVe.bd("sLang", str);
    localcVe.bd("sText", this.hi);
    localcVe.c("aCategory", localdEb);
    localcVe.U("iPage", this.hmM);
    localcVe.U("iSize", this.m_size);

    bcx localbcx = new bcx();
    localbcx.a(localcVe);

    return localbcx;
  }

  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject == null) || (getClass() != paramObject.getClass())) {
      return false;
    }

    bXA localbXA = (bXA)paramObject;
    return (this.hmM == localbXA.hmM) && (this.m_size == localbXA.m_size) && (this.ceS == localbXA.ceS);
  }

  public int hashCode()
  {
    int i = this.ceS;
    i = 31 * i + this.hmM;
    i = 31 * i + this.m_size;
    return i;
  }

  public String toString()
  {
    return "QuickBuy{m_category=" + this.ceS + ", m_page=" + this.hmM + ", m_size=" + this.m_size + '}';
  }
}