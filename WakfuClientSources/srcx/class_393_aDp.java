public final class aDp extends aRw
{
  private long ag;
  private dup dXY;

  public byte[] encode()
  {
    byte[] arrayOfByte = this.dXY.j();
    cXr localcXr = new cXr();
    localcXr.jn(this.ag);
    localcXr.dT(this.dXY.nc());
    localcXr.aD(arrayOfByte);
    return a((byte)3, localcXr.toArray());
  }

  public int getId() {
    return 10123;
  }

  public void b(long paramLong) {
    this.ag = paramLong;
  }

  public void a(dup paramdup) {
    this.dXY = paramdup;
  }
}