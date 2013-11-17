public class SM
{
  private final String name;
  private final String cup;
  private final String cuq;
  private final String cur;

  public SM(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    this.name = paramString1;
    this.cup = paramString2;
    this.cuq = paramString3;
    this.cur = paramString4;
  }

  public String name()
  {
    return this.name;
  }

  public String afX()
  {
    return this.cup;
  }

  public String afY()
  {
    return this.cuq;
  }

  public String afZ()
  {
    return this.cur;
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(200);
    localStringBuilder.append(getClass().getSimpleName()).append('[');
    localStringBuilder.append("name=").append(this.name).append(',');
    localStringBuilder.append("shortName=").append(this.cup).append(',');
    localStringBuilder.append("longName=").append(this.cuq).append(',');
    localStringBuilder.append("help=").append(this.cur).append(']');
    return localStringBuilder.toString();
  }
}