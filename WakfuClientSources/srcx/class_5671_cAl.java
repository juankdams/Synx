import java.nio.ByteBuffer;

public abstract class cAl
{
  private final String m_name;

  public cAl(String paramString)
  {
    this.m_name = paramString;
  }

  public final String getName() {
    return this.m_name;
  }

  public abstract zO aHX();

  public abstract void a(zO paramzO, ByteBuffer paramByteBuffer);

  public abstract void a(dSw paramdSw, String paramString);
}