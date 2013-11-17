import java.nio.ByteBuffer;

public class blx
  implements cxS
{
  public int aRq;
  public bDs aRr;
  public bPH aRs;
  public cil aRt;
  public ij aRu;
  public aTM aRv;
  public cvs aRw;
  public ara aRx;
  public baA aRy;
  public dvI aRz;
  public bSk aRA;
  public ed aRB;
  public aKR aRC;
  public cZY aRD;

  public blx()
  {
    this.aRq = 0;
    this.aRr = null;
    this.aRs = null;
    this.aRt = null;
    this.aRu = null;
    this.aRv = null;
    this.aRw = null;
    this.aRx = null;
    this.aRy = null;
    this.aRz = null;
    this.aRA = null;
    this.aRB = null;
    this.aRC = null;
    this.aRD = null;
  }

  public boolean g(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.putInt(this.aRq);
    boolean bool;
    if (this.aRr != null) {
      paramByteBuffer.put((byte)1);
      bool = this.aRr.g(paramByteBuffer);
      if (!bool)
        return false;
    } else {
      paramByteBuffer.put((byte)0);
    }
    if (this.aRs != null) {
      paramByteBuffer.put((byte)1);
      bool = this.aRs.g(paramByteBuffer);
      if (!bool)
        return false;
    } else {
      paramByteBuffer.put((byte)0);
    }
    if (this.aRt != null) {
      paramByteBuffer.put((byte)1);
      bool = this.aRt.g(paramByteBuffer);
      if (!bool)
        return false;
    } else {
      paramByteBuffer.put((byte)0);
    }
    if (this.aRu != null) {
      paramByteBuffer.put((byte)1);
      bool = this.aRu.g(paramByteBuffer);
      if (!bool)
        return false;
    } else {
      paramByteBuffer.put((byte)0);
    }
    if (this.aRv != null) {
      paramByteBuffer.put((byte)1);
      bool = this.aRv.g(paramByteBuffer);
      if (!bool)
        return false;
    } else {
      paramByteBuffer.put((byte)0);
    }
    if (this.aRw != null) {
      paramByteBuffer.put((byte)1);
      bool = this.aRw.g(paramByteBuffer);
      if (!bool)
        return false;
    } else {
      paramByteBuffer.put((byte)0);
    }
    if (this.aRx != null) {
      paramByteBuffer.put((byte)1);
      bool = this.aRx.g(paramByteBuffer);
      if (!bool)
        return false;
    } else {
      paramByteBuffer.put((byte)0);
    }
    if (this.aRy != null) {
      paramByteBuffer.put((byte)1);
      bool = this.aRy.g(paramByteBuffer);
      if (!bool)
        return false;
    } else {
      paramByteBuffer.put((byte)0);
    }
    if (this.aRz != null) {
      paramByteBuffer.put((byte)1);
      bool = this.aRz.g(paramByteBuffer);
      if (!bool)
        return false;
    } else {
      paramByteBuffer.put((byte)0);
    }
    if (this.aRA != null) {
      paramByteBuffer.put((byte)1);
      bool = this.aRA.g(paramByteBuffer);
      if (!bool)
        return false;
    } else {
      paramByteBuffer.put((byte)0);
    }
    if (this.aRB != null) {
      paramByteBuffer.put((byte)1);
      bool = this.aRB.g(paramByteBuffer);
      if (!bool)
        return false;
    } else {
      paramByteBuffer.put((byte)0);
    }
    if (this.aRC != null) {
      paramByteBuffer.put((byte)1);
      bool = this.aRC.g(paramByteBuffer);
      if (!bool)
        return false;
    } else {
      paramByteBuffer.put((byte)0);
    }
    if (this.aRD != null) {
      paramByteBuffer.put((byte)1);
      bool = this.aRD.g(paramByteBuffer);
      if (!bool)
        return false;
    } else {
      paramByteBuffer.put((byte)0);
    }
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.aRq = paramByteBuffer.getInt();
    int i = paramByteBuffer.get() == 1 ? 1 : 0;
    if (i != 0) {
      this.aRr = new bDs();
      bool1 = this.aRr.h(paramByteBuffer);
      if (!bool1)
        return false;
    } else {
      this.aRr = null;
    }
    boolean bool1 = paramByteBuffer.get() == 1;
    if (bool1) {
      this.aRs = new bPH();
      bool2 = this.aRs.h(paramByteBuffer);
      if (!bool2)
        return false;
    } else {
      this.aRs = null;
    }
    boolean bool2 = paramByteBuffer.get() == 1;
    if (bool2) {
      this.aRt = new cil();
      bool3 = this.aRt.h(paramByteBuffer);
      if (!bool3)
        return false;
    } else {
      this.aRt = null;
    }
    boolean bool3 = paramByteBuffer.get() == 1;
    if (bool3) {
      this.aRu = new ij();
      bool4 = this.aRu.h(paramByteBuffer);
      if (!bool4)
        return false;
    } else {
      this.aRu = null;
    }
    boolean bool4 = paramByteBuffer.get() == 1;
    if (bool4) {
      this.aRv = new aTM();
      bool5 = this.aRv.h(paramByteBuffer);
      if (!bool5)
        return false;
    } else {
      this.aRv = null;
    }
    boolean bool5 = paramByteBuffer.get() == 1;
    if (bool5) {
      this.aRw = new cvs();
      bool6 = this.aRw.h(paramByteBuffer);
      if (!bool6)
        return false;
    } else {
      this.aRw = null;
    }
    boolean bool6 = paramByteBuffer.get() == 1;
    if (bool6) {
      this.aRx = new ara();
      bool7 = this.aRx.h(paramByteBuffer);
      if (!bool7)
        return false;
    } else {
      this.aRx = null;
    }
    boolean bool7 = paramByteBuffer.get() == 1;
    if (bool7) {
      this.aRy = new baA();
      bool8 = this.aRy.h(paramByteBuffer);
      if (!bool8)
        return false;
    } else {
      this.aRy = null;
    }
    boolean bool8 = paramByteBuffer.get() == 1;
    if (bool8) {
      this.aRz = new dvI();
      bool9 = this.aRz.h(paramByteBuffer);
      if (!bool9)
        return false;
    } else {
      this.aRz = null;
    }
    boolean bool9 = paramByteBuffer.get() == 1;
    if (bool9) {
      this.aRA = new bSk();
      bool10 = this.aRA.h(paramByteBuffer);
      if (!bool10)
        return false;
    } else {
      this.aRA = null;
    }
    boolean bool10 = paramByteBuffer.get() == 1;
    if (bool10) {
      this.aRB = new ed();
      bool11 = this.aRB.h(paramByteBuffer);
      if (!bool11)
        return false;
    } else {
      this.aRB = null;
    }
    boolean bool11 = paramByteBuffer.get() == 1;
    if (bool11) {
      this.aRC = new aKR();
      bool12 = this.aRC.h(paramByteBuffer);
      if (!bool12)
        return false;
    } else {
      this.aRC = null;
    }
    boolean bool12 = paramByteBuffer.get() == 1;
    if (bool12) {
      this.aRD = new cZY();
      boolean bool13 = this.aRD.h(paramByteBuffer);
      if (!bool13)
        return false;
    } else {
      this.aRD = null;
    }
    return true;
  }

  public void clear() {
    this.aRq = 0;
    this.aRr = null;
    this.aRs = null;
    this.aRt = null;
    this.aRu = null;
    this.aRv = null;
    this.aRw = null;
    this.aRx = null;
    this.aRy = null;
    this.aRz = null;
    this.aRA = null;
    this.aRB = null;
    this.aRC = null;
    this.aRD = null;
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 10028000) {
      ne localne = new ne(this, null);
      boolean bool = localne.b(paramByteBuffer, paramInt);
      if (bool) {
        localne.z();
        return true;
      }
      return false;
    }

    return h(paramByteBuffer);
  }

  public int O()
  {
    int i = 0;
    i += 4;
    i++;
    if (this.aRr != null) {
      i += this.aRr.O();
    }
    i++;
    if (this.aRs != null) {
      i += this.aRs.O();
    }
    i++;
    if (this.aRt != null) {
      i += this.aRt.O();
    }
    i++;
    if (this.aRu != null) {
      i += this.aRu.O();
    }
    i++;
    if (this.aRv != null) {
      i += this.aRv.O();
    }
    i++;
    if (this.aRw != null) {
      i += this.aRw.O();
    }
    i++;
    if (this.aRx != null) {
      i += this.aRx.O();
    }
    i++;
    if (this.aRy != null) {
      i += this.aRy.O();
    }
    i++;
    if (this.aRz != null) {
      i += this.aRz.O();
    }
    i++;
    if (this.aRA != null) {
      i += this.aRA.O();
    }
    i++;
    if (this.aRB != null) {
      i += this.aRB.O();
    }
    i++;
    if (this.aRC != null) {
      i += this.aRC.O();
    }
    i++;
    if (this.aRD != null) {
      i += this.aRD.O();
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
    paramStringBuilder.append(paramString).append("protectorId=").append(this.aRq).append('\n');
    paramStringBuilder.append(paramString).append("nationality=");
    if (this.aRr == null) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("...\n");
      this.aRr.a(paramStringBuilder, paramString + "  ");
    }
    paramStringBuilder.append(paramString).append("appearance=");
    if (this.aRs == null) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("...\n");
      this.aRs.a(paramStringBuilder, paramString + "  ");
    }
    paramStringBuilder.append(paramString).append("challenges=");
    if (this.aRt == null) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("...\n");
      this.aRt.a(paramStringBuilder, paramString + "  ");
    }
    paramStringBuilder.append(paramString).append("referenceMerchantInventories=");
    if (this.aRu == null) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("...\n");
      this.aRu.a(paramStringBuilder, paramString + "  ");
    }
    paramStringBuilder.append(paramString).append("nationMerchantInventories=");
    if (this.aRv == null) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("...\n");
      this.aRv.a(paramStringBuilder, paramString + "  ");
    }
    paramStringBuilder.append(paramString).append("wallet=");
    if (this.aRw == null) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("...\n");
      this.aRw.a(paramStringBuilder, paramString + "  ");
    }
    paramStringBuilder.append(paramString).append("stake=");
    if (this.aRx == null) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("...\n");
      this.aRx.a(paramStringBuilder, paramString + "  ");
    }
    paramStringBuilder.append(paramString).append("taxes=");
    if (this.aRy == null) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("...\n");
      this.aRy.a(paramStringBuilder, paramString + "  ");
    }
    paramStringBuilder.append(paramString).append("weatherModifiers=");
    if (this.aRz == null) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("...\n");
      this.aRz.a(paramStringBuilder, paramString + "  ");
    }
    paramStringBuilder.append(paramString).append("satisfaction=");
    if (this.aRA == null) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("...\n");
      this.aRA.a(paramStringBuilder, paramString + "  ");
    }
    paramStringBuilder.append(paramString).append("monsterTargets=");
    if (this.aRB == null) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("...\n");
      this.aRB.a(paramStringBuilder, paramString + "  ");
    }
    paramStringBuilder.append(paramString).append("resourceTargets=");
    if (this.aRC == null) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("...\n");
      this.aRC.a(paramStringBuilder, paramString + "  ");
    }
    paramStringBuilder.append(paramString).append("ecosystem=");
    if (this.aRD == null) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("...\n");
      this.aRD.a(paramStringBuilder, paramString + "  ");
    }
  }
}