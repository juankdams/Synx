public class dNa extends Nr
{
  private static final long serialVersionUID = 1L;
  private final int width;
  private final int height;
  private final int mdH;
  private final int mdI;
  private final int mdJ;
  private final int mdK;

  protected dNa(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, String paramString1, String paramString2, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11, int paramInt12)
  {
    super(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramString1, paramString2);
    this.width = paramInt7;
    this.height = paramInt8;
    this.mdH = paramInt9;
    this.mdI = paramInt10;
    this.mdJ = paramInt11;
    this.mdK = paramInt12;
  }

  public final int width()
  {
    return this.width;
  }

  public final int height()
  {
    return this.height;
  }

  public final int dpM()
  {
    return this.mdH;
  }

  public final int dpN()
  {
    return this.mdI;
  }

  public final int dpO()
  {
    return this.mdJ;
  }

  public final int dpP()
  {
    return this.mdK;
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(200);
    localStringBuilder.append(super.toString()).append('[');
    localStringBuilder.append("width=").append(this.width).append(',');
    localStringBuilder.append("height=").append(this.height).append(',');
    localStringBuilder.append("sampleAspectRatio=").append(this.mdH).append(',');
    localStringBuilder.append("sampleAspectRatioBase=").append(this.mdI).append(',');
    localStringBuilder.append("frameRate=").append(this.mdJ).append(',');
    localStringBuilder.append("frameRateBase=").append(this.mdK).append(']');
    return localStringBuilder.toString();
  }
}