import java.nio.ByteBuffer;

class cAy extends cCH
{
  cAy(FY paramFY, int paramInt)
  {
    super(paramInt);
  }
  public void b(ByteBuffer paramByteBuffer) {
    byte[] arrayOfByte1 = dzp.qC(FY.c(this.iqs));
    paramByteBuffer.put((byte)arrayOfByte1.length);
    paramByteBuffer.put(arrayOfByte1);

    byte[] arrayOfByte2 = FY.d(this.iqs).getBytes();
    paramByteBuffer.put((byte)arrayOfByte2.length);
    paramByteBuffer.put(arrayOfByte2);
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt)
  {
    byte[] arrayOfByte1 = new byte[paramByteBuffer.get() & 0xFF];
    paramByteBuffer.get(arrayOfByte1);
    FY.b(this.iqs, dzp.aJ(arrayOfByte1));

    byte[] arrayOfByte2 = new byte[paramByteBuffer.get() & 0xFF];
    paramByteBuffer.get(arrayOfByte2);
    FY.c(this.iqs, new String(arrayOfByte2));
  }
}