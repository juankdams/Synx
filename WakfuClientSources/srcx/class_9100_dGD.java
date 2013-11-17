import java.nio.ByteBuffer;

public class dGD
  implements cxS
{
  public long bPv;
  public int aDe;
  public short aDf;
  public btR hok;
  public aBA hol;
  public bAJ hom;
  public agU hoo;
  public VP hop;

  public dGD()
  {
    this.bPv = 0L;
    this.aDe = 0;
    this.aDf = 0;
    this.hok = null;
    this.hol = null;
    this.hom = null;
    this.hoo = null;
    this.hop = null;
  }

  public boolean g(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.putLong(this.bPv);
    paramByteBuffer.putInt(this.aDe);
    paramByteBuffer.putShort(this.aDf);
    boolean bool;
    if (this.hok != null) {
      paramByteBuffer.put((byte)1);
      bool = this.hok.g(paramByteBuffer);
      if (!bool)
        return false;
    } else {
      paramByteBuffer.put((byte)0);
    }
    if (this.hol != null) {
      paramByteBuffer.put((byte)1);
      bool = this.hol.g(paramByteBuffer);
      if (!bool)
        return false;
    } else {
      paramByteBuffer.put((byte)0);
    }
    if (this.hom != null) {
      paramByteBuffer.put((byte)1);
      bool = this.hom.g(paramByteBuffer);
      if (!bool)
        return false;
    } else {
      paramByteBuffer.put((byte)0);
    }
    if (this.hoo != null) {
      paramByteBuffer.put((byte)1);
      bool = this.hoo.g(paramByteBuffer);
      if (!bool)
        return false;
    } else {
      paramByteBuffer.put((byte)0);
    }
    if (this.hop != null) {
      paramByteBuffer.put((byte)1);
      bool = this.hop.g(paramByteBuffer);
      if (!bool)
        return false;
    } else {
      paramByteBuffer.put((byte)0);
    }
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.bPv = paramByteBuffer.getLong();
    this.aDe = paramByteBuffer.getInt();
    this.aDf = paramByteBuffer.getShort();
    int i = paramByteBuffer.get() == 1 ? 1 : 0;
    if (i != 0) {
      this.hok = new btR();
      bool1 = this.hok.h(paramByteBuffer);
      if (!bool1)
        return false;
    } else {
      this.hok = null;
    }
    boolean bool1 = paramByteBuffer.get() == 1;
    if (bool1) {
      this.hol = new aBA();
      bool2 = this.hol.h(paramByteBuffer);
      if (!bool2)
        return false;
    } else {
      this.hol = null;
    }
    boolean bool2 = paramByteBuffer.get() == 1;
    if (bool2) {
      this.hom = new bAJ();
      bool3 = this.hom.h(paramByteBuffer);
      if (!bool3)
        return false;
    } else {
      this.hom = null;
    }
    boolean bool3 = paramByteBuffer.get() == 1;
    if (bool3) {
      this.hoo = new agU();
      bool4 = this.hoo.h(paramByteBuffer);
      if (!bool4)
        return false;
    } else {
      this.hoo = null;
    }
    boolean bool4 = paramByteBuffer.get() == 1;
    if (bool4) {
      this.hop = new VP();
      boolean bool5 = this.hop.h(paramByteBuffer);
      if (!bool5)
        return false;
    } else {
      this.hop = null;
    }
    return true;
  }

  public void clear() {
    this.bPv = 0L;
    this.aDe = 0;
    this.aDf = 0;
    this.hok = null;
    this.hol = null;
    this.hom = null;
    this.hoo = null;
    this.hop = null;
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 10028000) {
      bYk localbYk = new bYk(this, null);
      boolean bool = localbYk.b(paramByteBuffer, paramInt);
      if (bool) {
        localbYk.z();
        return true;
      }
      return false;
    }

    return h(paramByteBuffer);
  }

  public int O()
  {
    int i = 0;
    i += 8;
    i += 4;
    i += 2;
    i++;
    if (this.hok != null) {
      i += this.hok.O();
    }
    i++;
    if (this.hol != null) {
      i += this.hol.O();
    }
    i++;
    if (this.hom != null) {
      i += this.hom.O();
    }
    i++;
    if (this.hoo != null) {
      i += this.hoo.O();
    }
    i++;
    if (this.hop != null) {
      i += this.hop.O();
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
    paramStringBuilder.append(paramString).append("uniqueId=").append(this.bPv).append('\n');
    paramStringBuilder.append(paramString).append("refId=").append(this.aDe).append('\n');
    paramStringBuilder.append(paramString).append("quantity=").append(this.aDf).append('\n');
    paramStringBuilder.append(paramString).append("timestamp=");
    if (this.hok == null) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("...\n");
      this.hok.a(paramStringBuilder, paramString + "  ");
    }
    paramStringBuilder.append(paramString).append("pet=");
    if (this.hol == null) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("...\n");
      this.hol.a(paramStringBuilder, paramString + "  ");
    }
    paramStringBuilder.append(paramString).append("xp=");
    if (this.hom == null) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("...\n");
      this.hom.a(paramStringBuilder, paramString + "  ");
    }
    paramStringBuilder.append(paramString).append("gems=");
    if (this.hoo == null) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("...\n");
      this.hoo.a(paramStringBuilder, paramString + "  ");
    }
    paramStringBuilder.append(paramString).append("rentInfo=");
    if (this.hop == null) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("...\n");
      this.hop.a(paramStringBuilder, paramString + "  ");
    }
  }
}