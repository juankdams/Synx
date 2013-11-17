import java.nio.ByteBuffer;

public class M extends akv
  implements cxS
{
  public czX aV;
  private final cCH aW;

  public M()
  {
    this.aV = null;

    this.aW = new alR(this);
  }

  public cCH ao()
  {
    return this.aW;
  }

  public boolean g(ByteBuffer paramByteBuffer)
  {
    if (this.aV != null) {
      paramByteBuffer.put((byte)1);
      boolean bool = this.aV.g(paramByteBuffer);
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
      this.aV = new czX();
      boolean bool = this.aV.h(paramByteBuffer);
      if (!bool)
        return false;
    } else {
      this.aV = null;
    }
    return true;
  }

  public void clear() {
    this.aV = null;
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 1) {
      Dt localDt = new Dt(this, null);
      boolean bool = localDt.b(paramByteBuffer, paramInt);
      if (bool) {
        localDt.z();
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
    if (this.aV != null) {
      i += this.aV.O();
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
    paramStringBuilder.append(paramString).append("pet=");
    if (this.aV == null) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("...\n");
      this.aV.a(paramStringBuilder, paramString + "  ");
    }
  }
}