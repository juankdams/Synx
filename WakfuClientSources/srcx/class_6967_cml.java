import java.nio.ByteBuffer;

class cml extends bJS
{
  private boolean hRe = false;

  cml(dig paramdig, aym paramaym, int paramInt)
  {
    super(paramaym, paramInt);
  }

  public void b(ByteBuffer paramByteBuffer) {
    paramByteBuffer.put((byte)(this.hRf.ldR ? 1 : 0));
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt) {
    boolean bool = paramByteBuffer.get() == 1;
    this.hRe = (this.hRf.ldR != bool);
    this.hRf.ldR = bool;
  }

  public void aS()
  {
  }

  public void aT() {
    if (this.hRe)
      for (bxV localbxV : dig.e(this.hRf))
        localbxV.a(this);
    this.hRe = false;
  }
}