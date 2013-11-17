import java.nio.ByteBuffer;

class Oi extends cCH
{
  Oi(bSg parambSg, int paramInt)
  {
    super(paramInt);
  }
  public void b(ByteBuffer paramByteBuffer) {
    paramByteBuffer.putInt(bSg.a(this.cfc).getX());
    paramByteBuffer.putInt(bSg.a(this.cfc).getY());
    paramByteBuffer.putShort(bSg.a(this.cfc).IB());
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt)
  {
    bSg.a(this.cfc, new cYk(paramByteBuffer.getInt(), paramByteBuffer.getInt(), paramByteBuffer.getShort()));
  }
}