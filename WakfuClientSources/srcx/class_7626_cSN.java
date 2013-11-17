import java.nio.ByteBuffer;

class cSN extends cCH
{
  cSN(gE paramgE, int paramInt)
  {
    super(paramInt);
  }
  public void b(ByteBuffer paramByteBuffer) {
    paramByteBuffer.putInt(gE.a(this.kFp).getX());
    paramByteBuffer.putInt(gE.b(this.kFp).getY());
    paramByteBuffer.putShort(gE.c(this.kFp).IB());
    paramByteBuffer.put((byte)(this.kFp.aFK ? 1 : 0));
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt)
  {
    gE.d(this.kFp).ac(paramByteBuffer.getInt(), paramByteBuffer.getInt(), paramByteBuffer.getShort());
    this.kFp.aFK = (paramByteBuffer.get() == 1);
  }
}