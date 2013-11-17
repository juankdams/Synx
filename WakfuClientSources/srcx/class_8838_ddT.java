import java.util.Locale;

public class ddT
  implements bwK
{
  private static final String hmJ = "ArticlesList";
  private static final String aCu = "sShopKey";
  private static final String aEv = "sLang";
  private static final String hmK = "iCategory";
  private static final String hmL = "iPage";
  private static final String dHB = "iSize";
  private final int ceS;
  private final int hmM;
  private final int m_size;
  private final Ew kXX;

  public ddT(int paramInt1, int paramInt2, int paramInt3, Ew paramEw)
  {
    this.ceS = paramInt1;
    this.hmM = paramInt2;
    this.m_size = paramInt3;
    this.kXX = paramEw;
  }

  public Ew cOO() {
    return this.kXX;
  }

  public bcx mu() {
    cVe localcVe = new cVe("ArticlesList");
    String str = bU.fH().ajJ().cAZ().getLanguage();

    localcVe.bd("sShopKey", "WAKFU_INGAME");
    localcVe.bd("sLang", str);
    localcVe.U("iCategory", this.ceS);
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

    ddT localddT = (ddT)paramObject;
    return (this.hmM == localddT.hmM) && (this.m_size == localddT.m_size) && (this.ceS == localddT.ceS);
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