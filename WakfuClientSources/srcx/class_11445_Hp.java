import java.nio.ByteBuffer;

public class Hp
  implements cxS
{
  public dzL bPB;
  public aSE bPC;
  public cir bPD;

  public Hp()
  {
    this.bPB = null;
    this.bPC = null;
    this.bPD = null;
  }

  public boolean g(ByteBuffer paramByteBuffer)
  {
    boolean bool;
    if (this.bPB != null) {
      paramByteBuffer.put((byte)1);
      bool = this.bPB.g(paramByteBuffer);
      if (!bool)
        return false;
    } else {
      paramByteBuffer.put((byte)0);
    }
    if (this.bPC != null) {
      paramByteBuffer.put((byte)1);
      bool = this.bPC.g(paramByteBuffer);
      if (!bool)
        return false;
    } else {
      paramByteBuffer.put((byte)0);
    }
    if (this.bPD != null) {
      paramByteBuffer.put((byte)1);
      bool = this.bPD.g(paramByteBuffer);
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
      this.bPB = new dzL();
      bool1 = this.bPB.h(paramByteBuffer);
      if (!bool1)
        return false;
    } else {
      this.bPB = null;
    }
    boolean bool1 = paramByteBuffer.get() == 1;
    if (bool1) {
      this.bPC = new aSE();
      bool2 = this.bPC.h(paramByteBuffer);
      if (!bool2)
        return false;
    } else {
      this.bPC = null;
    }
    boolean bool2 = paramByteBuffer.get() == 1;
    if (bool2) {
      this.bPD = new cir();
      boolean bool3 = this.bPD.h(paramByteBuffer);
      if (!bool3)
        return false;
    } else {
      this.bPD = null;
    }
    return true;
  }

  public void clear() {
    this.bPB = null;
    this.bPC = null;
    this.bPD = null;
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 10024001) {
      aeS localaeS = new aeS(this, null);
      boolean bool = localaeS.b(paramByteBuffer, paramInt);
      if (bool) {
        localaeS.z();
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
    if (this.bPB != null) {
      i += this.bPB.O();
    }
    i++;
    if (this.bPC != null) {
      i += this.bPC.O();
    }
    i++;
    if (this.bPD != null) {
      i += this.bPD.O();
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
    if (this.bPB == null) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("...\n");
      this.bPB.a(paramStringBuilder, paramString + "  ");
    }
    paramStringBuilder.append(paramString).append("xp=");
    if (this.bPC == null) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("...\n");
      this.bPC.a(paramStringBuilder, paramString + "  ");
    }
    paramStringBuilder.append(paramString).append("gems=");
    if (this.bPD == null) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("...\n");
      this.bPD.a(paramStringBuilder, paramString + "  ");
    }
  }
}