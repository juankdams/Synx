public class dzS extends byK
{
  private final bMD dYm;

  public dzS(bMD parambMD)
  {
    this.dYm = parambMD;
  }

  public Object getFieldValue(String paramString)
  {
    if (paramString.equals("bagInventory")) {
      return this.dYm.bUi();
    }
    return super.getFieldValue(paramString);
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