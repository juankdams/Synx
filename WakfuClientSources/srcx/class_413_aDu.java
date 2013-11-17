import java.util.Collection;

public class aDu extends byK
{
  private final bMD dYm;
  private final dVX dYn;

  public aDu(bMD parambMD, dVX paramdVX)
  {
    this.dYm = parambMD;
    this.dYn = paramdVX;
  }

  public Object getFieldValue(String paramString)
  {
    if (paramString.equals("bagInventory")) {
      return aPH();
    }
    return super.getFieldValue(paramString);
  }

  private Collection aPH() {
    return this.dYm.a(this.dYn);
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("AllBagsView");
    localStringBuilder.append("{m_bag=").append(this.dYm);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}