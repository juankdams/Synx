public class cQg
  implements bjf
{
  private final int cxl;

  public cQg(int paramInt)
  {
    this.cxl = paramInt;
  }

  public clq hm() {
    return clq.hNg;
  }

  public Object getValue() {
    return Integer.valueOf(this.cxl);
  }

  public int getIntValue() {
    return this.cxl;
  }

  public float ai() {
    return this.cxl;
  }

  public String getStringValue() {
    return String.valueOf(this.cxl);
  }

  public boolean getBooleanValue() {
    throw new UnsupportedOperationException("getBooleanValue sur IntData");
  }

  public K hn() {
    CC localCC = new CC(null, String.valueOf(this.cxl));
    localCC.c(new dvw("xsi:type", hm().getTag()));
    return localCC;
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("IntData");
    localStringBuilder.append("{m_value=").append(this.cxl);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}