public final class dSJ extends cih
{
  private final String UV;
  private final byte aHn;

  public dSJ(int paramInt1, int paramInt2, aPb paramaPb, int paramInt3, String paramString, byte paramByte)
  {
    super(paramInt1, paramInt2, paramaPb, paramInt3);
    this.UV = paramString;
    this.aHn = paramByte;
  }

  public String getAnimName() {
    return this.UV;
  }

  public byte xK() {
    return this.aHn;
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("IEEquipableDummyParameter");
    localStringBuilder.append("{m_animName='").append(this.UV).append('\'');
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}