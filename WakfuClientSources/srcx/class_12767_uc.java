import java.nio.ByteBuffer;

public abstract class uc
  implements cxS
{
  public static uc z(ByteBuffer paramByteBuffer)
  {
    int i = paramByteBuffer.get();
    XS localXS;
    switch (i) {
    case 0:
      localXS = new XS();
      break;
    default:
      return null;
    }
    if (!localXS.h(paramByteBuffer))
      return null;
    return localXS;
  }

  public static uc g(ByteBuffer paramByteBuffer, int paramInt) {
    int i = paramByteBuffer.get();
    XS localXS;
    switch (i) {
    case 0:
      localXS = new XS();
      break;
    default:
      return null;
    }
    if (!localXS.b(paramByteBuffer, paramInt))
      return null;
    return localXS;
  }

  public abstract byte N();

  public abstract void a(StringBuilder paramStringBuilder, String paramString);
}