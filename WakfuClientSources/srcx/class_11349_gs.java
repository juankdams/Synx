import java.util.Locale;

public class gs
  implements bwK
{
  private static final String aEu = "QuickBuy";
  private static final String aCu = "sShopKey";
  private static final String aEv = "sLang";
  private static final String aEw = "iArticleId";
  private static final String aEx = "iQuantity";
  private final int aEy;
  private final int aEz;
  private final dRc aEA;

  public gs(int paramInt1, int paramInt2, dRc paramdRc)
  {
    this.aEy = paramInt1;
    this.aEz = paramInt2;
    this.aEA = paramdRc;
  }

  public bcx mu() {
    cVe localcVe = new cVe("QuickBuy");
    String str = bU.fH().ajJ().cAZ().getLanguage();

    localcVe.bd("sShopKey", "WAKFU_INGAME");
    localcVe.bd("sLang", str);
    localcVe.U("iArticleId", this.aEy);
    localcVe.U("iQuantity", this.aEz);

    bcx localbcx = new bcx();
    localbcx.a(localcVe);

    return localbcx;
  }

  public dRc nC() {
    return this.aEA;
  }

  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject == null) || (getClass() != paramObject.getClass())) {
      return false;
    }

    gs localgs = (gs)paramObject;
    return (this.aEy == localgs.aEy) && (this.aEz == localgs.aEz);
  }

  public int hashCode()
  {
    int i = this.aEy;
    i = 31 * i + this.aEz;
    return i;
  }

  public String toString()
  {
    return "QuickBuy{m_articleId=" + this.aEy + ", m_quantity=" + this.aEz + '}';
  }
}