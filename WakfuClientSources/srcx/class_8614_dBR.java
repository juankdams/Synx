import java.nio.ByteBuffer;

public final class dBR extends cAl
{
  public dBR(String paramString)
  {
    super(paramString);
  }

  public final aVr deM()
  {
    return new aVr();
  }

  public void a(aVr paramaVr, ByteBuffer paramByteBuffer)
  {
    paramaVr.dmV = paramByteBuffer.getFloat();
  }

  public void a(dSw paramdSw, String paramString)
  {
    paramdSw.writeFloat(Float.parseFloat(paramString));
  }
}