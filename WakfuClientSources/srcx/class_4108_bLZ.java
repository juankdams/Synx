public class bLZ
{
  private final String gPy;
  private final String cuq;

  public bLZ(String paramString1, String paramString2)
  {
    this.gPy = paramString1;
    this.cuq = paramString2;
  }

  public String bTE()
  {
    return this.gPy;
  }

  public String getLongName()
  {
    return this.cuq;
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(60);
    localStringBuilder.append(getClass().getSimpleName()).append('[');
    localStringBuilder.append("deviceId=").append(this.gPy).append(',');
    localStringBuilder.append("longName=").append(this.cuq).append(']');
    return localStringBuilder.toString();
  }
}