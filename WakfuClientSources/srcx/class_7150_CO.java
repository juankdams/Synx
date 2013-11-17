public class CO
  implements bjf
{
  private final boolean bHf;

  public CO(boolean paramBoolean)
  {
    this.bHf = paramBoolean;
  }

  public clq hm() {
    return clq.hNf;
  }

  public Object getValue() {
    return Boolean.valueOf(this.bHf);
  }

  public float ai() {
    throw new UnsupportedOperationException("getFloatValue sur BooleanData");
  }

  public int getIntValue() {
    throw new UnsupportedOperationException("IntValue sur BooleanData");
  }

  public String getStringValue() {
    return String.valueOf(this.bHf);
  }

  public boolean getBooleanValue() {
    return this.bHf;
  }

  public K hn() {
    CC localCC = new CC(null, String.valueOf(this.bHf));
    localCC.c(new dvw("xsi:type", hm().getTag()));
    return localCC;
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("BooleanData");
    localStringBuilder.append("{m_value=").append(this.bHf);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}