public class dQo extends cJ
{
  private static final long serialVersionUID = 7760846806886585968L;
  private int status;

  public dQo(int paramInt)
  {
    this.status = paramInt;
  }

  public dQo(String paramString, int paramInt)
  {
    super(paramString);
    this.status = paramInt;
  }

  public dQo(String paramString, int paramInt, aaA paramaaA)
  {
    super(paramString, paramaaA);
    this.status = paramInt;
  }

  public int getStatus()
  {
    return this.status;
  }
}