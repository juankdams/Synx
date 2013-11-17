public abstract class XP
{
  protected String cIk;
  protected long bwF;

  protected XP(String paramString, long paramLong)
  {
    this.cIk = paramString;
    this.bwF = paramLong;
  }

  protected XP() {
  }

  public String getMemberName() {
    return this.cIk;
  }

  public long getDate() {
    return this.bwF;
  }
}