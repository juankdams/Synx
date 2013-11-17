import java.nio.ByteBuffer;

class cmm extends bJS
{
  cmm(dig paramdig, aym paramaym, int paramInt)
  {
    super(paramaym, paramInt);
  }
  public void b(ByteBuffer paramByteBuffer) {
    paramByteBuffer.putInt(this.hRf.ibV);
    paramByteBuffer.putInt(this.hRf.ldQ);
    paramByteBuffer.putInt(this.hRf.dkR);
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt) {
    this.hRf.ibV = paramByteBuffer.getInt();
    this.hRf.ldQ = paramByteBuffer.getInt();
    this.hRf.dkR = paramByteBuffer.getInt();
  }

  public int cc() {
    return 12;
  }

  public void aT()
  {
    for (bxV localbxV : dig.a(this.hRf))
      localbxV.a(this);
  }

  public void aS()
  {
  }
}