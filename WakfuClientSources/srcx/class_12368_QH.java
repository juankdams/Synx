public class QH extends bzu
{
  private long aLD;

  public int getId()
  {
    return 16807;
  }

  public void setExchangeId(long paramLong) {
    this.aLD = paramLong;
  }

  public long acp() {
    return this.aLD;
  }
}