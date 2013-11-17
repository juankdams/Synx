import java.nio.ByteBuffer;

class abA extends cCH
{
  private aof cQb;

  abA(gl paramgl)
  {
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.putFloat(gl.b(this.cQc));
    paramByteBuffer.putFloat(gl.c(this.cQc));

    this.cQb.g(paramByteBuffer);
    if ((gl.d(this.cQc) instanceof ajF))
      paramByteBuffer.put(((ajF)gl.e(this.cQc)).awq().aae());
    else
      paramByteBuffer.put((byte)0);
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt)
  {
    gl.a(this.cQc, paramByteBuffer.getFloat());
    gl.b(this.cQc, paramByteBuffer.getFloat());

    this.cQb = new aof();
    this.cQb.h(paramByteBuffer);
    gl.a(this.cQc, paramByteBuffer.get());
    gl.a(this.cQc, new csi());
    gl.f(this.cQc).b(this.cQb);
    gl.f(this.cQc).hu(true);
  }

  public int cc()
  {
    this.cQb = new aof();
    gl.f(this.cQc).a(this.cQb);
    return 8 + this.cQb.O() + 1;
  }
}