public class Pi
  implements bjf
{
  private final String bFu;

  public Pi(String paramString)
  {
    this.bFu = paramString;
  }

  public clq hm() {
    return clq.hNi;
  }

  public String getValue() {
    return this.bFu;
  }

  public int getIntValue() {
    throw new UnsupportedOperationException("getIntValue sur StringData");
  }

  public float ai() {
    throw new UnsupportedOperationException("getFloatValue sur StringData");
  }

  public String getStringValue() {
    return this.bFu;
  }

  public boolean getBooleanValue() {
    throw new UnsupportedOperationException("getBooleanValue sur StringData");
  }

  public K hn() {
    CC localCC = new CC(null, this.bFu);
    localCC.c(new dvw("xsi:type", hm().getTag()));
    return localCC;
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("StringData");
    localStringBuilder.append("{m_value='").append(this.bFu).append('\'');
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}