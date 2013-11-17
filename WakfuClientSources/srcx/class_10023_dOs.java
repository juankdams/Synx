import java.nio.ByteBuffer;

public final class dOs extends cAl
{
  public dOs(String paramString)
  {
    super(paramString);
  }

  public final azc dqo()
  {
    return new azc();
  }

  public final void a(azc paramazc, ByteBuffer paramByteBuffer)
  {
    paramazc.dQh = paramByteBuffer.get();
  }

  public void a(dSw paramdSw, String paramString)
  {
    paramdSw.writeByte(Byte.parseByte(paramString));
  }
}