import java.nio.ByteBuffer;

public class amX extends akv
  implements cxS
{
  public int[] dpJ;
  public int[] dpK;
  public int[] dpL;
  private final cCH aW;

  public amX()
  {
    this.dpJ = null;
    this.dpK = null;
    this.dpL = null;

    this.aW = new yY(this);
  }

  public cCH ao()
  {
    return this.aW;
  }

  public boolean g(ByteBuffer paramByteBuffer)
  {
    int i;
    if (this.dpJ != null) {
      if (this.dpJ.length > 65535)
        return false;
      paramByteBuffer.putShort((short)this.dpJ.length);
      for (i = 0; i < this.dpJ.length; i++)
        paramByteBuffer.putInt(this.dpJ[i]);
    }
    else {
      paramByteBuffer.putShort((short)0);
    }
    if (this.dpK != null) {
      if (this.dpK.length > 65535)
        return false;
      paramByteBuffer.putShort((short)this.dpK.length);
      for (i = 0; i < this.dpK.length; i++)
        paramByteBuffer.putInt(this.dpK[i]);
    }
    else {
      paramByteBuffer.putShort((short)0);
    }
    if (this.dpL != null) {
      if (this.dpL.length > 65535)
        return false;
      paramByteBuffer.putShort((short)this.dpL.length);
      for (i = 0; i < this.dpL.length; i++)
        paramByteBuffer.putInt(this.dpL[i]);
    }
    else {
      paramByteBuffer.putShort((short)0);
    }
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.getShort() & 0xFFFF;
    if (i > 0) {
      this.dpJ = new int[i];
      for (j = 0; j < i; j++)
        this.dpJ[j] = paramByteBuffer.getInt();
    }
    else {
      this.dpJ = null;
    }
    int j = paramByteBuffer.getShort() & 0xFFFF;
    if (j > 0) {
      this.dpK = new int[j];
      for (k = 0; k < j; k++)
        this.dpK[k] = paramByteBuffer.getInt();
    }
    else {
      this.dpK = null;
    }
    int k = paramByteBuffer.getShort() & 0xFFFF;
    if (k > 0) {
      this.dpL = new int[k];
      for (int m = 0; m < k; m++)
        this.dpL[m] = paramByteBuffer.getInt();
    }
    else {
      this.dpL = null;
    }
    return true;
  }

  public void clear() {
    this.dpJ = null;
    this.dpK = null;
    this.dpL = null;
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 10026000) {
      bSZ localbSZ = new bSZ(this, null);
      boolean bool = localbSZ.b(paramByteBuffer, paramInt);
      if (bool) {
        localbSZ.z();
        return true;
      }
      return false;
    }

    return h(paramByteBuffer);
  }

  public int O()
  {
    int i = 0;
    i += 2;
    i += (this.dpJ != null ? this.dpJ.length * 4 : 0);
    i += 2;
    i += (this.dpK != null ? this.dpK.length * 4 : 0);
    i += 2;
    i += (this.dpL != null ? this.dpL.length * 4 : 0);
    return i;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, "");
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramString).append("guildEffects=(").append(this.dpJ.length).append(" bytes)\n");
    paramStringBuilder.append(paramString).append("havenWorldEffects=(").append(this.dpK.length).append(" bytes)\n");
    paramStringBuilder.append(paramString).append("antiAddictionEffects=(").append(this.dpL.length).append(" bytes)\n");
  }
}