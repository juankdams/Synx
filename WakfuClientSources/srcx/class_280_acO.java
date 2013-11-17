import java.nio.ByteBuffer;

class acO extends cCH
{
  acO(afX paramafX, int paramInt)
  {
    super(paramInt);
  }
  public void b(ByteBuffer paramByteBuffer) {
    paramByteBuffer.putShort(this.cTc.aGz);
    paramByteBuffer.putShort(this.cTc.gCj);
    paramByteBuffer.put(afX.a(this.cTc));
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt)
  {
    this.cTc.aGz = paramByteBuffer.getShort();
    this.cTc.gCj = paramByteBuffer.getShort();
    afX.a(this.cTc, paramByteBuffer.get());
    this.cTc.hqf = bJC.I(this.cTc.aGz, this.cTc.gCj);
  }
}