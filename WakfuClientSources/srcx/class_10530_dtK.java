import java.nio.ByteBuffer;

class dtK extends cCH
{
  dtK(aPH paramaPH)
  {
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    byte[] arrayOfByte = this.chp.LH().Bb();
    paramByteBuffer.putShort((short)arrayOfByte.length);
    paramByteBuffer.put(arrayOfByte);
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt)
  {
    byte[] arrayOfByte = new byte[paramByteBuffer.getShort()];
    paramByteBuffer.get(arrayOfByte);
    this.chp.L(arrayOfByte);
  }

  public int cc()
  {
    return 2 + this.chp.LH().O();
  }
}