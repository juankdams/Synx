import java.nio.ByteBuffer;

class dKw extends cCH
{
  dKw(cCX paramcCX, int paramInt)
  {
    super(paramInt);
  }
  public void b(ByteBuffer paramByteBuffer) {
    paramByteBuffer.putInt(cCX.a(this.lYg).getX());
    paramByteBuffer.putInt(cCX.a(this.lYg).getY());
    paramByteBuffer.putShort(cCX.a(this.lYg).IB());
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt)
  {
    cCX.a(this.lYg, new cYk(paramByteBuffer.getInt(), paramByteBuffer.getInt(), paramByteBuffer.getShort()));
  }
}