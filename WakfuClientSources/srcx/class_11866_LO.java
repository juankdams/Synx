public class LO
  implements asx
{
  private String bYJ;
  private boolean bYK = false;
  private long bYL;
  private int aKS;
  private boolean bKT = true;

  public LO(String paramString, int paramInt, long paramLong) {
    this.bYJ = paramString;
    this.aKS = paramInt;
    this.bYL = paramLong;
    this.bKT = (this.aKS == 2147483647);
  }

  public LO(String paramString) {
    this(paramString, 2147483647, 0L);
  }

  public LO(boolean paramBoolean) {
    this.bYK = paramBoolean;
  }

  public String getId()
  {
    return this.bYJ;
  }

  public int getDuration()
  {
    return this.aKS;
  }

  public long getStartTime()
  {
    return this.bYL;
  }

  public void Z(long paramLong)
  {
    this.bYL = paramLong;
  }

  public boolean Wu()
  {
    return this.bYK;
  }

  public boolean gI() {
    return this.bKT;
  }

  public void Wv() {
    this.bKT = true;
  }
}