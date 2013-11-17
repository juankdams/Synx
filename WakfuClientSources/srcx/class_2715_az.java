public class az extends bzu
{
  private final String hh;
  private final String hi;
  private final int hj;
  private final ana hk;
  private final dBv hl;

  public az(String paramString1, String paramString2, ana paramana)
  {
    this(paramString1, paramString2, paramana, -1);
  }

  public az(String paramString1, String paramString2, ana paramana, int paramInt) {
    this(paramString1, paramString2, paramana, paramInt, null);
  }

  public az(String paramString1, String paramString2, ana paramana, int paramInt, dBv paramdBv) {
    this.hh = paramString1;
    this.hi = paramString2;
    this.hk = paramana;
    this.hj = paramInt;
    this.hl = paramdBv;
  }

  public String getTitle() {
    return this.hh;
  }

  public String getText() {
    return this.hi;
  }

  public ana bu() {
    return this.hk;
  }

  public int getSoundId() {
    return this.hj;
  }

  public dBv bv() {
    return this.hl;
  }

  public int getId() {
    return 16163;
  }
}