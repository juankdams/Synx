public class dNh extends cih
{
  private final byte fbG;

  public dNh(int paramInt1, int paramInt2, aPb paramaPb, int paramInt3, byte paramByte)
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
    localStringBuilder.append("IEKrosmozGameBoardParameter");
    localStringBuilder.append("{m_gameId=").append(this.fbG);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}