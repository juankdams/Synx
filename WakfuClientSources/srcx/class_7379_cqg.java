import java.nio.ByteBuffer;

public class cqg extends akv
  implements cxS
{
  public alN gey;
  private final cCH aW;

  public cqg()
  {
    this.gey = null;

    this.aW = new lH(this);
  }

  public cCH ao()
  {
    return this.aW;
  }

  public boolean g(ByteBuffer paramByteBuffer)
  {
    if (this.gey != null) {
      paramByteBuffer.put((byte)1);
      boolean bool = this.gey.g(paramByteBuffer);
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
      this.gey = new alN();
      boolean bool = this.gey.h(paramByteBuffer);
      if (!bool)
        return false;
    } else {
      this.gey = null;
    }
    return true;
  }

  public void clear() {
    this.gey = null;
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 10027003) {
      buQ localbuQ = new buQ(this, null);
      boolean bool = localbuQ.b(paramByteBuffer, paramInt);
      if (bool) {
        localbuQ.z();
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
    if (this.gey != null) {
      i += this.gey.O();
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
    paramStringBuilder.append(paramString).append("creationData=");
    if (this.gey == null) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("...\n");
      this.gey.a(paramStringBuilder, paramString + "  ");
    }
  }
}