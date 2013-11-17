public class aWx extends cih
{
  private final byte fbG;

  public aWx(int paramInt1, int paramInt2, aPb paramaPb, int paramInt3, byte paramByte)
  {
    super(paramInt1, paramInt2, paramaPb, paramInt3);
    this.fbG = paramByte;
  }

  public byte bmk() {
    return this.fbG;
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("IEKrosmozGameCollectionParameter");
    localStringBuilder.append("{m_gameId=").append(this.fbG);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}