import java.util.Locale;

public class ft
  implements bwK
{
  private static final String aCt = "CategoriesList";
  private static final String aCu = "sShopKey";
  private static final String aCv = "sLang";
  private final aA aCw;

  public ft(aA paramaA)
  {
    this.aCw = paramaA;
  }

  public bcx mu() {
    cVe localcVe = new cVe("CategoriesList");
    String str = bU.fH().ajJ().cAZ().getLanguage();

    localcVe.bd("sShopKey", "WAKFU_INGAME");
    localcVe.bd("sLang", str);

    bcx localbcx = new bcx();
    localbcx.a(localcVe);

    return localbcx;
  }

  public aA mv() {
    return this.aCw;
  }

  public boolean equals(Object paramObject)
  {
    return (this == paramObject) || ((paramObject != null) && (getClass() == paramObject.getClass()));
  }

  public int hashCode()
  {
    return 0;
  }

  public String toString()
  {
    return "CategoriesList{}";
  }
}