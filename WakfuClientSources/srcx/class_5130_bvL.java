import java.nio.ByteBuffer;

public class bvL extends akv
  implements cxS
{
  public byte bUn = 0;
  public byte ggk = 0;
  public byte ggl = 0;
  public byte ggm = 0;
  public byte ggn = 0;
  public byte ggo = 0;
  public byte cHd = 0;
  public byte cHe = 0;
  public short ggp = -1;

  private final cCH aW = new cso(this);
  public static final int aL = 10;

  public cCH ao()
  {
    return this.aW;
  }

  public boolean g(ByteBuffer paramByteBuffer) {
    paramByteBuffer.put(this.bUn);
    paramByteBuffer.put(this.ggk);
    paramByteBuffer.put(this.ggl);
    paramByteBuffer.put(this.ggm);
    paramByteBuffer.put(this.ggn);
    paramByteBuffer.put(this.ggo);
    paramByteBuffer.put(this.cHd);
    paramByteBuffer.put(this.cHe);
    paramByteBuffer.putShort(this.ggp);
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.bUn = paramByteBuffer.get();
    this.ggk = paramByteBuffer.get();
    this.ggl = paramByteBuffer.get();
    this.ggm = paramByteBuffer.get();
    this.ggn = paramByteBuffer.get();
    this.ggo = paramByteBuffer.get();
    this.cHd = paramByteBuffer.get();
    this.cHe = paramByteBuffer.get();
    this.ggp = paramByteBuffer.getShort();
    return true;
  }

  public void clear() {
    this.bUn = 0;
    this.ggk = 0;
    this.ggl = 0;
    this.ggm = 0;
    this.ggn = 0;
    this.ggo = 0;
    this.cHd = 0;
    this.cHe = 0;
    this.ggp = -1;
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    return h(paramByteBuffer);
  }

  public int O()
  {
    return 10;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, "");
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramString).append("sex=").append(this.bUn).append('\n');
    paramStringBuilder.append(paramString).append("skinColorIndex=").append(this.ggk).append('\n');
    paramStringBuilder.append(paramString).append("hairColorIndex=").append(this.ggl).append('\n');
    paramStringBuilder.append(paramString).append("pupilColorIndex=").append(this.ggm).append('\n');
    paramStringBuilder.append(paramString).append("skinColorFactor=").append(this.ggn).append('\n');
    paramStringBuilder.append(paramString).append("hairColorFactor=").append(this.ggo).append('\n');
    paramStringBuilder.append(paramString).append("clothIndex=").append(this.cHd).append('\n');
    paramStringBuilder.append(paramString).append("faceIndex=").append(this.cHe).append('\n');
    paramStringBuilder.append(paramString).append("currentTitle=").append(this.ggp).append('\n');
  }
}