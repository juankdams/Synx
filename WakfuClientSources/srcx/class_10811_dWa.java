import java.nio.ByteBuffer;

public class dWa extends akv
  implements cxS
{
  public aIW ekc;
  public doW ekd;
  public XC eke;
  public aIT ekf;
  private final cCH aW;

  public dWa()
  {
    this.ekc = null;
    this.ekd = null;
    this.eke = null;
    this.ekf = null;

    this.aW = new dCY(this);
  }

  public cCH ao()
  {
    return this.aW;
  }

  public boolean g(ByteBuffer paramByteBuffer)
  {
    boolean bool;
    if (this.ekc != null) {
      paramByteBuffer.put((byte)1);
      bool = this.ekc.g(paramByteBuffer);
      if (!bool)
        return false;
    } else {
      paramByteBuffer.put((byte)0);
    }
    if (this.ekd != null) {
      paramByteBuffer.put((byte)1);
      bool = this.ekd.g(paramByteBuffer);
      if (!bool)
        return false;
    } else {
      paramByteBuffer.put((byte)0);
    }
    if (this.eke != null) {
      paramByteBuffer.put((byte)1);
      bool = this.eke.g(paramByteBuffer);
      if (!bool)
        return false;
    } else {
      paramByteBuffer.put((byte)0);
    }
    if (this.ekf != null) {
      paramByteBuffer.put((byte)1);
      bool = this.ekf.g(paramByteBuffer);
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
      this.ekc = new aIW();
      bool1 = this.ekc.h(paramByteBuffer);
      if (!bool1)
        return false;
    } else {
      this.ekc = null;
    }
    boolean bool1 = paramByteBuffer.get() == 1;
    if (bool1) {
      this.ekd = new doW();
      bool2 = this.ekd.h(paramByteBuffer);
      if (!bool2)
        return false;
    } else {
      this.ekd = null;
    }
    boolean bool2 = paramByteBuffer.get() == 1;
    if (bool2) {
      this.eke = new XC();
      bool3 = this.eke.h(paramByteBuffer);
      if (!bool3)
        return false;
    } else {
      this.eke = null;
    }
    boolean bool3 = paramByteBuffer.get() == 1;
    if (bool3) {
      this.ekf = new aIT();
      boolean bool4 = this.ekf.h(paramByteBuffer);
      if (!bool4)
        return false;
    } else {
      this.ekf = null;
    }
    return true;
  }

  public void clear() {
    this.ekc = null;
    this.ekd = null;
    this.eke = null;
    this.ekf = null;
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 1) {
      aJO localaJO = new aJO(this, null);
      boolean bool = localaJO.b(paramByteBuffer, paramInt);
      if (bool) {
        localaJO.z();
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
    if (this.ekc != null) {
      i += this.ekc.O();
    }
    i++;
    if (this.ekd != null) {
      i += this.ekd.O();
    }
    i++;
    if (this.eke != null) {
      i += this.eke.O();
    }
    i++;
    if (this.ekf != null) {
      i += this.ekf.O();
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
    paramStringBuilder.append(paramString).append("plantationCounter=");
    if (this.ekc == null) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("...\n");
      this.ekc.a(paramStringBuilder, paramString + "  ");
    }
    paramStringBuilder.append(paramString).append("nonDestructiveCollectCounter=");
    if (this.ekd == null) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("...\n");
      this.ekd.a(paramStringBuilder, paramString + "  ");
    }
    paramStringBuilder.append(paramString).append("destructiveCollectCounter=");
    if (this.eke == null) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("...\n");
      this.eke.a(paramStringBuilder, paramString + "  ");
    }
    paramStringBuilder.append(paramString).append("recipeCounter=");
    if (this.ekf == null) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("...\n");
      this.ekf.a(paramStringBuilder, paramString + "  ");
    }
  }
}