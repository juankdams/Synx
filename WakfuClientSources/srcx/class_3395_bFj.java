import java.nio.ByteBuffer;
import java.util.ArrayList;

public class bFj extends akv
  implements cxS
{
  public final ArrayList gAo;
  private final cCH aW;

  public bFj()
  {
    this.gAo = new ArrayList(0);

    this.aW = new bpm(this);
  }

  public cCH ao()
  {
    return this.aW;
  }

  public boolean g(ByteBuffer paramByteBuffer)
  {
    if (this.gAo.size() > 65535)
      return false;
    paramByteBuffer.putShort((short)this.gAo.size());
    for (int i = 0; i < this.gAo.size(); i++) {
      daX localdaX = (daX)this.gAo.get(i);
      boolean bool = localdaX.g(paramByteBuffer);
      if (!bool)
        return false;
    }
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.gAo.clear();
    this.gAo.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      daX localdaX = new daX();
      boolean bool = localdaX.h(paramByteBuffer);
      if (!bool)
        return false;
      this.gAo.add(localdaX);
    }
    return true;
  }

  public void clear() {
    this.gAo.clear();
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 220) {
      bVP localbVP = new bVP(this, null);
      boolean bool = localbVP.b(paramByteBuffer, paramInt);
      if (bool) {
        localbVP.z();
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
    for (int j = 0; j < this.gAo.size(); j++) {
      daX localdaX = (daX)this.gAo.get(j);
      i += localdaX.O();
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
    paramStringBuilder.append(paramString).append("emotes=");
    if (this.gAo.isEmpty()) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("(").append(this.gAo.size()).append(" elements)...\n");
      for (int i = 0; i < this.gAo.size(); i++) {
        daX localdaX = (daX)this.gAo.get(i);
        localdaX.a(paramStringBuilder, paramString + i + "/ ");
      }
    }
  }
}