import java.io.Serializable;

public abstract class Nr
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  private final int ccS;
  private final String ccT;
  private final int ccU;
  private final String ccV;
  private final int id;
  private final int ccW;
  private final int level;
  private final int ccX;
  private final String ccY;
  private final String description;

  protected Nr(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, String paramString1, String paramString2)
  {
    this.ccS = paramInt1;
    this.ccT = fS(paramInt1);
    this.ccU = paramInt2;
    this.ccV = fS(paramInt2);
    this.id = paramInt3;
    this.ccW = paramInt4;
    this.level = paramInt5;
    this.ccX = paramInt6;
    this.ccY = paramString1;
    this.description = paramString2;
  }

  public final int Zu()
  {
    return this.ccS;
  }

  public final String Zv()
  {
    return this.ccT;
  }

  public final int Zw()
  {
    return this.ccS;
  }

  public final String Zx()
  {
    return this.ccV;
  }

  public final int id()
  {
    return this.id;
  }

  public final int Zy()
  {
    return this.ccW;
  }

  public final int Zz()
  {
    return this.level;
  }

  public final int ZA()
  {
    return this.ccX;
  }

  public final String ZB()
  {
    return this.ccY;
  }

  public final String description()
  {
    return this.description;
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(100);
    localStringBuilder.append(getClass().getSimpleName()).append('[');
    localStringBuilder.append("codec=0x").append(Integer.toHexString(this.ccS)).append(',');
    localStringBuilder.append("codecName=").append(this.ccT).append(',');
    localStringBuilder.append("originalCodec=0x").append(Integer.toHexString(this.ccU)).append(',');
    localStringBuilder.append("originalCodecName=").append(this.ccV).append(',');
    localStringBuilder.append("id=").append(this.id).append(',');
    localStringBuilder.append("profile=").append(this.ccW).append(',');
    localStringBuilder.append("level=").append(this.level).append(',');
    localStringBuilder.append("bitRate=").append(this.ccX).append(',');
    localStringBuilder.append("language=").append(this.ccY).append(',');
    localStringBuilder.append("description=").append(this.description).append(']');
    return localStringBuilder.toString();
  }

  private final String fS(int paramInt)
  {
    return paramInt != 0 ? new String(new byte[] { (byte)paramInt, (byte)(paramInt >>> 8), (byte)(paramInt >>> 16), (byte)(paramInt >>> 24) }).trim() : null;
  }
}