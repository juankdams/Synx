import java.nio.ByteBuffer;

class aqz extends cCH
{
  aqz(bAH parambAH, int paramInt)
  {
    super(paramInt);
  }
  public void b(ByteBuffer paramByteBuffer) {
    paramByteBuffer.put((byte)(bAH.a(this.dye) ? 1 : 0));
    paramByteBuffer.putInt(bAH.b(this.dye));
    paramByteBuffer.put(bAH.c(this.dye));
    paramByteBuffer.put((byte)(bAH.d(this.dye) ? 1 : 0));
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt)
  {
    bAH.a(this.dye, paramByteBuffer.get() == 1);
    bAH.a(this.dye, paramByteBuffer.getInt());
    bAH.a(this.dye, paramByteBuffer.get());
    bAH.b(this.dye, paramByteBuffer.get() == 1);
  }
}