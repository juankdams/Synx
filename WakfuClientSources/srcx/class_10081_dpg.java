public final class dpg
  implements aTX
{
  private final int aw;
  private final String m_name;
  private long aJf;

  dpg(dpg paramdpg)
  {
    this.aw = paramdpg.aw;
    this.m_name = paramdpg.m_name;
  }

  dpg(int paramInt, String paramString) {
    this.aw = paramInt;
    this.m_name = (paramString != null ? paramString.intern() : null);
  }

  public int getId() {
    return this.aw;
  }

  public String getName() {
    return this.m_name;
  }

  public long getValue() {
    return this.aJf;
  }

  void fM(long paramLong) {
    this.aJf = paramLong;
  }
}