import java.nio.ByteBuffer;

class cAz extends cCH
{
  cAz(FY paramFY)
  {
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.putInt(FY.a(this.iqs));
    byte[] arrayOfByte = dzp.qC(FY.b(this.iqs));
    paramByteBuffer.put((byte)arrayOfByte.length);
    paramByteBuffer.put(arrayOfByte);
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt) {
    FY.a(this.iqs, paramByteBuffer.getInt());
    byte[] arrayOfByte = new byte[paramByteBuffer.get() & 0xFF];
    paramByteBuffer.get(arrayOfByte);
    FY.a(this.iqs, dzp.aJ(arrayOfByte));
  }
}