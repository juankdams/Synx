public class dDG extends Nr
{
  private static final long serialVersionUID = 1L;
  private final String encoding;

  protected dDG(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, String paramString1, String paramString2, String paramString3)
  {
    super(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramString1, paramString2);
    this.encoding = paramString3;
  }

  public final String dfz()
  {
    return this.encoding;
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(200);
    localStringBuilder.append(super.toString()).append('[');
    localStringBuilder.append("encoding=").append(this.encoding).append(']');
    return localStringBuilder.toString();
  }
}