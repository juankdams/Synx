import java.nio.ByteBuffer;

class dse extends cCH
{
  dse(bPD parambPD)
  {
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.putLong(bPD.c(this.luw));
    paramByteBuffer.putInt(this.luw.loW);
    paramByteBuffer.putLong(this.luw.oj());
    paramByteBuffer.putInt(bPD.d(this.luw));
    paramByteBuffer.put((byte)(bPD.e(this.luw) ? 1 : 0));
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt)
  {
    bPD.a(this.luw, paramByteBuffer.getLong());
    this.luw.loW = paramByteBuffer.getInt();
    this.luw.aH(paramByteBuffer.getLong());
    bPD.a(this.luw, paramByteBuffer.getInt());
    bPD.a(this.luw, paramByteBuffer.get() == 1);
    bPD.f(this.luw);
  }

  public int cc()
  {
    return 25;
  }
}