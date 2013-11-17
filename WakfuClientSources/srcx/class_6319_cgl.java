public final class cgl
{
  private dPx hDQ = new dPx();

  public void b(byte paramByte, long paramLong, short paramShort) {
    this.hDQ.c(paramByte, new uP(paramLong, paramShort));
  }

  public void j(byte paramByte, long paramLong) {
    this.hDQ.c(paramByte, new uP(paramLong, (short)0));
  }

  public boolean isEmpty() {
    return this.hDQ.isEmpty();
  }

  public dPx cix() {
    return this.hDQ;
  }
}