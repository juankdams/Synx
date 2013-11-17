import java.nio.ByteBuffer;

public final class avT extends cAl
{
  public avT(String paramString)
  {
    super(paramString);
  }

  public TJ aHW()
  {
    return new TJ();
  }

  public void a(TJ paramTJ, ByteBuffer paramByteBuffer)
  {
    int i = paramByteBuffer.get() & 0xFF;
    byte[] arrayOfByte = new byte[i];
    paramByteBuffer.get(arrayOfByte);
    paramTJ.bFu = dzp.aJ(arrayOfByte);
  }

  public void a(dSw paramdSw, String paramString)
  {
    byte[] arrayOfByte = dzp.qC(paramString);
    paramdSw.writeByte((byte)arrayOfByte.length);
    paramdSw.writeBytes(arrayOfByte);
  }
}