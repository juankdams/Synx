import java.nio.ByteBuffer;

class ck extends cCH
{
  ck(bZG parambZG, int paramInt)
  {
    super(paramInt);
  }
  public void b(ByteBuffer paramByteBuffer) {
    paramByteBuffer.putShort(this.Rt.aGz);
    paramByteBuffer.putShort(this.Rt.gCj);
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt)
  {
    this.Rt.aGz = paramByteBuffer.getShort();
    this.Rt.gCj = paramByteBuffer.getShort();
    this.Rt.hqf = bJC.I(this.Rt.aGz, this.Rt.gCj);
  }
}