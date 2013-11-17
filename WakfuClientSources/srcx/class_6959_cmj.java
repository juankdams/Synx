import java.nio.ByteBuffer;

class cmj extends bJS
{
  private boolean hRe = false;

  cmj(dig paramdig, aym paramaym, int paramInt)
  {
    super(paramaym, paramInt);
  }

  public void b(ByteBuffer paramByteBuffer) {
    paramByteBuffer.put((byte)(this.hRf.ldS ? 1 : 0));
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt) {
    boolean bool = paramByteBuffer.get() == 1;
    this.hRe = (this.hRf.ldS != bool);
    this.hRf.ldS = bool;
  }

  public void aS()
  {
  }

  public void aT() {
    if (this.hRe)
      for (bxV localbxV : dig.f(this.hRf))
        localbxV.a(this);
    this.hRe = false;
  }
}