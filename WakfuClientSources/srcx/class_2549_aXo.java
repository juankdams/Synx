import java.nio.ByteBuffer;

class aXo extends cCH
{
  aXo(aHR paramaHR)
  {
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    String str = this.fcs.aIX.getDescription();
    byte[] arrayOfByte = dzp.qC(str);
    paramByteBuffer.put((byte)arrayOfByte.length);
    paramByteBuffer.put(arrayOfByte);
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt)
  {
    if (this.fcs.aIX == null) {
      this.fcs.aIX = aHR.aTW().bhQ();
    }

    int i = (short)paramByteBuffer.get();
    if (i < 0)
      i = (short)(i + 256);
    byte[] arrayOfByte = new byte[i];
    paramByteBuffer.get(arrayOfByte);
    this.fcs.aIX.aP(dzp.aJ(arrayOfByte));
  }

  public int cc()
  {
    int i = 0;
    byte[] arrayOfByte = dzp.qC(this.fcs.aIX.getDescription());
    i += 1 + arrayOfByte.length;

    return i;
  }
}