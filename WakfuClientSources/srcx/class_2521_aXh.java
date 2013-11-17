import java.nio.ByteBuffer;

class aXh extends cCH
{
  aXh(aHR paramaHR)
  {
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    String str = this.fcs.aIX.getTitle();
    byte[] arrayOfByte = dzp.qC(str);
    if (arrayOfByte.length > 32)
      return;
    paramByteBuffer.put((byte)arrayOfByte.length);
    paramByteBuffer.put(arrayOfByte);
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt)
  {
    if (this.fcs.aIX == null) {
      this.fcs.aIX = aHR.aTW().bhQ();
    }

    int i = paramByteBuffer.get();
    byte[] arrayOfByte = new byte[i];
    paramByteBuffer.get(arrayOfByte);
    this.fcs.aIX.setTitle(dzp.aJ(arrayOfByte));
  }

  public int cc()
  {
    byte[] arrayOfByte = dzp.qC(this.fcs.aIX.getTitle());
    int i = 1 + arrayOfByte.length;
    return i;
  }
}