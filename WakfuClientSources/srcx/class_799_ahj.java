import java.nio.ByteBuffer;

public class ahj extends akv
  implements cxS
{
  public long ayv = 0L;
  public long dbA = 0L;
  public int[] dbB = null;

  private final cCH aW = new cXX(this);

  public cCH ao()
  {
    return this.aW;
  }

  public boolean g(ByteBuffer paramByteBuffer) {
    paramByteBuffer.putLong(this.ayv);
    paramByteBuffer.putLong(this.dbA);
    if (this.dbB != null) {
      if (this.dbB.length > 65535)
        return false;
      paramByteBuffer.putShort((short)this.dbB.length);
      for (int i = 0; i < this.dbB.length; i++)
        paramByteBuffer.putInt(this.dbB[i]);
    }
    else {
      paramByteBuffer.putShort((short)0);
    }
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.ayv = paramByteBuffer.getLong();
    this.dbA = paramByteBuffer.getLong();
    int i = paramByteBuffer.getShort() & 0xFFFF;
    if (i > 0) {
      this.dbB = new int[i];
      for (int j = 0; j < i; j++)
        this.dbB[j] = paramByteBuffer.getInt();
    }
    else {
      this.dbB = null;
    }
    return true;
  }

  public void clear() {
    this.ayv = 0L;
    this.dbA = 0L;
    this.dbB = null;
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    return h(paramByteBuffer);
  }

  public int O() {
    int i = 0;
    i += 8;
    i += 8;
    i += 2;
    i += (this.dbB != null ? this.dbB.length * 4 : 0);
    return i;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, "");
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramString).append("guildId=").append(this.ayv).append('\n');
    paramStringBuilder.append(paramString).append("authorisations=").append(this.dbA).append('\n');
    paramStringBuilder.append(paramString).append("activeBuffs=(").append(this.dbB.length).append(" bytes)\n");
  }
}