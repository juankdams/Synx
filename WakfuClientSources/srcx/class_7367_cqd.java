import java.nio.ByteBuffer;

public final class cqd extends cAl
{
  public cqd(String paramString)
  {
    super(paramString);
  }

  public final Ap cps()
  {
    return new Ap();
  }

  public final void a(Ap paramAp, ByteBuffer paramByteBuffer)
  {
    paramAp.bvN = paramByteBuffer.getShort();
  }

  public void a(dSw paramdSw, String paramString)
  {
    paramdSw.writeShort(Short.parseShort(paramString));
  }
}