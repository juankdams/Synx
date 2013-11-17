public class aTk
  implements bjf
{
  private final float dmV;

  public aTk(float paramFloat)
  {
    this.dmV = paramFloat;
  }

  public clq hm() {
    return clq.hNh;
  }

  public Object getValue() {
    return Float.valueOf(this.dmV);
  }

  public float ai() {
    return this.dmV;
  }

  public int getIntValue() {
    return (int)this.dmV;
  }

  public String getStringValue() {
    return String.valueOf(this.dmV);
  }

  public boolean getBooleanValue() {
    throw new UnsupportedOperationException("getBooleanValue sur IntData");
  }

  public K hn() {
    CC localCC = new CC(null, String.valueOf(this.dmV));
    localCC.c(new dvw("xsi:type", hm().getTag()));
    return localCC;
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("IntData");
    localStringBuilder.append("{m_value=").append(this.dmV);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}