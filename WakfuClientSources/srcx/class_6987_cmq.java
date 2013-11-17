import java.nio.ByteBuffer;

class cmq extends bJS
{
  cmq(dig paramdig, aym paramaym, int paramInt)
  {
    super(paramaym, paramInt);
  }
  public void b(ByteBuffer paramByteBuffer) {
    paramByteBuffer.putShort(this.hRf.TD);
    paramByteBuffer.putInt(this.hRf.hY);
    paramByteBuffer.putInt(this.hRf.hZ);
    paramByteBuffer.putShort(this.hRf.aOl);
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt) {
    this.hRf.TD = paramByteBuffer.getShort();
    this.hRf.hY = paramByteBuffer.getInt();
    this.hRf.hZ = paramByteBuffer.getInt();
    this.hRf.aOl = paramByteBuffer.getShort();
  }

  public int cc() {
    return 12;
  }

  public void aT()
  {
    for (bxV localbxV : dig.b(this.hRf))
      localbxV.a(this);
  }

  public void aS()
  {
  }
}