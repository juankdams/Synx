import java.nio.ByteBuffer;

public class bmT extends akv
  implements cxS
{
  public int[] fFO = null;
  public int fFP = 0;

  private final cCH aW = new dzO(this);

  public cCH ao()
  {
    return this.aW;
  }

  public boolean g(ByteBuffer paramByteBuffer) {
    if (this.fFO != null) {
      if (this.fFO.length > 65535)
        return false;
      paramByteBuffer.putShort((short)this.fFO.length);
      for (int i = 0; i < this.fFO.length; i++)
        paramByteBuffer.putInt(this.fFO[i]);
    }
    else {
      paramByteBuffer.putShort((short)0);
    }
    paramByteBuffer.putInt(this.fFP);
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.getShort() & 0xFFFF;
    if (i > 0) {
      this.fFO = new int[i];
      for (int j = 0; j < i; j++)
        this.fFO[j] = paramByteBuffer.getInt();
    }
    else {
      this.fFO = null;
    }
    this.fFP = paramByteBuffer.getInt();
    return true;
  }

  public void clear() {
    this.fFO = null;
    this.fFP = 0;
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    return h(paramByteBuffer);
  }

  public int O() {
    int i = 0;
    i += 2;
    i += (this.fFO != null ? this.fFO.length * 4 : 0);
    i += 4;
    return i;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, "");
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramString).append("adminRights=(").append(this.fFO.length).append(" bytes)\n");
    paramStringBuilder.append(paramString).append("accountFlags=").append(this.fFP).append('\n');
  }
}