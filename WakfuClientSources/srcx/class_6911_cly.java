import java.nio.ByteBuffer;

class cly extends cCH
{
  cly(deM paramdeM)
  {
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.putShort(this.hNs.az);
    paramByteBuffer.putInt(this.hNs.hY);
    paramByteBuffer.putInt(this.hNs.hZ);
    paramByteBuffer.putShort(this.hNs.aOl);
    byte[] arrayOfByte = dzp.qC(this.hNs.fgH);
    if ((!bB) && (arrayOfByte.length >= 65535)) throw new AssertionError("chaine des parametres trop longue");
    paramByteBuffer.putShort((short)(arrayOfByte.length & 0xFFFF));
    paramByteBuffer.put(arrayOfByte);
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt) {
    throw new UnsupportedOperationException();
  }

  public int cc()
  {
    return 14 + dzp.qC(this.hNs.fgH).length;
  }
}