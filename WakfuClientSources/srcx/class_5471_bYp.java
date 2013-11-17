import java.nio.ByteBuffer;

public class bYp extends akv
  implements cxS
{
  public cGo epA;
  private final cCH aW;

  public bYp()
  {
    this.epA = null;

    this.aW = new Yf(this);
  }

  public cCH ao()
  {
    return this.aW;
  }

  public boolean g(ByteBuffer paramByteBuffer)
  {
    if (this.epA != null) {
      paramByteBuffer.put((byte)1);
      boolean bool = this.epA.g(paramByteBuffer);
      if (!bool)
        return false;
    } else {
      paramByteBuffer.put((byte)0);
    }
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.get() == 1 ? 1 : 0;
    if (i != 0) {
      this.epA = new cGo();
      boolean bool = this.epA.h(paramByteBuffer);
      if (!bool)
        return false;
    } else {
      this.epA = null;
    }
    return true;
  }

  public void clear() {
    this.epA = null;
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 10028000) {
      aLi localaLi = new aLi(this, null);
      boolean bool = localaLi.b(paramByteBuffer, paramInt);
      if (bool) {
        localaLi.z();
        return true;
      }
      return false;
    }

    return h(paramByteBuffer);
  }

  public int O()
  {
    int i = 0;
    i++;
    if (this.epA != null) {
      i += this.epA.O();
    }
    return i;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, "");
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramString).append("dimensionalBag=");
    if (this.epA == null) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("...\n");
      this.epA.a(paramStringBuilder, paramString + "  ");
    }
  }
}