public class bmj
{
  public static final bmj fDN = new bmj(-1, (short)0);
  private final int RZ;
  private final short aFe;

  public bmj(int paramInt, short paramShort)
  {
    this.RZ = paramInt;
    this.aFe = paramShort;
  }

  public int gw() {
    return this.RZ;
  }

  public short nP() {
    return this.aFe;
  }

  public boolean equals(Object paramObject)
  {
    if (this == paramObject)
      return true;
    if ((paramObject == null) || (getClass() != paramObject.getClass())) {
      return false;
    }
    bmj localbmj = (bmj)paramObject;

    return (this.RZ == localbmj.RZ) && (this.aFe == localbmj.aFe);
  }

  public int hashCode()
  {
    int i = this.RZ;
    i = 31 * i + this.aFe;
    return i;
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("RecipeResultItem");
    localStringBuilder.append("{m_itemId=").append(this.RZ);
    localStringBuilder.append(", m_quantity=").append(this.aFe);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}