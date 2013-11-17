import java.nio.ByteBuffer;

public class dDj
  implements cxS
{
  public static final int aL = 0;

  public boolean g(ByteBuffer paramByteBuffer)
  {
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    return true;
  }

  public void clear() {
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 10014) {
      dVb localdVb = new dVb(this, null);
      boolean bool = localdVb.b(paramByteBuffer, paramInt);
      if (bool) {
        localdVb.z();
        return true;
      }
      return false;
    }

    return h(paramByteBuffer);
  }

  public int O()
  {
    return 0;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, "");
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, String paramString)
  {
  }
}