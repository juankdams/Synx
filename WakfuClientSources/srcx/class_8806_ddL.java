import java.nio.ByteBuffer;

public class ddL extends akv
  implements cxS
{
  public btD fsL;
  private final cCH aW;

  public ddL()
  {
    this.fsL = null;

    this.aW = new cjG(this);
  }

  public cCH ao()
  {
    return this.aW;
  }

  public boolean g(ByteBuffer paramByteBuffer)
  {
    if (this.fsL != null) {
      paramByteBuffer.put((byte)1);
      boolean bool = this.fsL.g(paramByteBuffer);
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
      this.fsL = new btD();
      boolean bool = this.fsL.h(paramByteBuffer);
      if (!bool)
        return false;
    } else {
      this.fsL = null;
    }
    return true;
  }

  public void clear() {
    this.fsL = null;
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 1) {
      bfs localbfs = new bfs(this, null);
      boolean bool = localbfs.b(paramByteBuffer, paramInt);
      if (bool) {
        localbfs.z();
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
    if (this.fsL != null) {
      i += this.fsL.O();
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
    paramStringBuilder.append(paramString).append("properties=");
    if (this.fsL == null) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("...\n");
      this.fsL.a(paramStringBuilder, paramString + "  ");
    }
  }
}