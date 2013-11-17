import java.nio.ByteBuffer;

class cmk extends bJS
{
  private boolean hRe = false;

  cmk(dig paramdig, aym paramaym, int paramInt)
  {
    super(paramaym, paramInt);
  }

  public void b(ByteBuffer paramByteBuffer) {
    paramByteBuffer.putShort(dig.c(this.hRf));
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt) {
    short s = paramByteBuffer.getShort();
    this.hRe = ((dig.c(this.hRf) != 0) && (dig.c(this.hRf) != s));
    dig.a(this.hRf, s);
  }

  public void aS()
  {
  }

  public void aT() {
    if (this.hRe)
      for (bxV localbxV : dig.d(this.hRf))
        localbxV.a(this);
    this.hRe = false;
  }
}