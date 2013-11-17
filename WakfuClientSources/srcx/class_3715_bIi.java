public class bIi extends Nr
{
  private static final long serialVersionUID = 1L;
  private final int channels;
  private final int dvW;

  protected bIi(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, String paramString1, String paramString2, int paramInt7, int paramInt8)
  {
    super(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramString1, paramString2);
    this.channels = paramInt7;
    this.dvW = paramInt8;
  }

  public final int bPy()
  {
    return this.channels;
  }

  public final int bPz()
  {
    return this.dvW;
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(200);
    localStringBuilder.append(super.toString()).append('[');
    localStringBuilder.append("channels=").append(this.channels).append(',');
    localStringBuilder.append("rate=").append(this.dvW).append(']');
    return localStringBuilder.toString();
  }
}