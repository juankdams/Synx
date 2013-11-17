final class amQ
{
  private final int baA;
  private final long bux;
  private final long kD;

  private amQ(bqX parambqX, int paramInt, long paramLong1, long paramLong2)
  {
    this.baA = paramInt;
    this.bux = paramLong1;
    this.kD = paramLong2;
  }

  public boolean equals(Object paramObject)
  {
    if (this == paramObject)
      return true;
    if (!(paramObject instanceof amQ)) {
      return false;
    }
    amQ localamQ = (amQ)paramObject;

    if (this.bux != localamQ.bux)
      return false;
    if (this.baA != localamQ.baA)
      return false;
    if (this.kD != localamQ.kD) {
      return false;
    }
    return true;
  }

  public int hashCode()
  {
    int i = this.baA;
    i = 31 * i + (int)(this.bux ^ this.bux >>> 32);
    i = 31 * i + (int)(this.kD ^ this.kD >>> 32);
    return i;
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("IntLongLong");
    localStringBuilder.append("{m_effectId=").append(this.baA);
    localStringBuilder.append(", m_casterId=").append(this.bux);
    localStringBuilder.append(", m_targetId=").append(this.kD);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}