import java.nio.ByteBuffer;

public final class bhJ
  implements dup
{
  public long fwE;
  public byte fwF;

  bhJ()
  {
  }

  public bhJ(long paramLong, byte paramByte)
  {
    this.fwE = paramLong;
    this.fwF = paramByte;
  }

  public byte[] j() {
    cXr localcXr = new cXr();
    localcXr.jn(this.fwE);
    localcXr.eL(this.fwF);
    return localcXr.toArray();
  }

  public void U(ByteBuffer paramByteBuffer) {
    this.fwE = paramByteBuffer.getLong();
    this.fwF = paramByteBuffer.get();
  }

  public long btS() {
    return this.fwE;
  }

  public byte btT() {
    return this.fwF;
  }

  public short nc() {
    return 1;
  }
}