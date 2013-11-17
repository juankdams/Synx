import java.nio.ByteBuffer;

public class Ks extends akv
  implements cxS
{
  public ZE bWN;
  public cmg bWO;
  private final cCH aW;

  public Ks()
  {
    this.bWN = null;
    this.bWO = null;

    this.aW = new cbX(this);
  }

  public cCH ao()
  {
    return this.aW;
  }

  public boolean g(ByteBuffer paramByteBuffer)
  {
    boolean bool;
    if (this.bWN != null) {
      paramByteBuffer.put((byte)1);
      bool = this.bWN.g(paramByteBuffer);
      if (!bool)
        return false;
    } else {
      paramByteBuffer.put((byte)0);
    }
    if (this.bWO != null) {
      paramByteBuffer.put((byte)1);
      bool = this.bWO.g(paramByteBuffer);
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
      this.bWN = new ZE();
      bool1 = this.bWN.h(paramByteBuffer);
      if (!bool1)
        return false;
    } else {
      this.bWN = null;
    }
    boolean bool1 = paramByteBuffer.get() == 1;
    if (bool1) {
      this.bWO = new cmg();
      boolean bool2 = this.bWO.h(paramByteBuffer);
      if (!bool2)
        return false;
    } else {
      this.bWO = null;
    }
    return true;
  }

  public void clear() {
    this.bWN = null;
    this.bWO = null;
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 1) {
      bzY localbzY = new bzY(this, null);
      boolean bool = localbzY.b(paramByteBuffer, paramInt);
      if (bool) {
        localbzY.z();
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
    if (this.bWN != null) {
      i += this.bWN.O();
    }
    i++;
    if (this.bWO != null) {
      i += this.bWO.O();
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
    paramStringBuilder.append(paramString).append("inFightData=");
    if (this.bWN == null) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("...\n");
      this.bWN.a(paramStringBuilder, paramString + "  ");
    }
    paramStringBuilder.append(paramString).append("outFightData=");
    if (this.bWO == null) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("...\n");
      this.bWO.a(paramStringBuilder, paramString + "  ");
    }
  }
}