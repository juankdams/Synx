import java.nio.ByteBuffer;

class abB extends cCH
{
  abB(gl paramgl, int paramInt)
  {
    super(paramInt);
  }
  public void b(ByteBuffer paramByteBuffer) {
    paramByteBuffer.putLong(gl.a(this.cQc));
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt)
  {
    gl.a(this.cQc, paramByteBuffer.getLong());
    gl.a(this.cQc, null);
  }
}