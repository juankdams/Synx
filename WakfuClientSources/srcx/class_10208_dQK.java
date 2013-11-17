import java.nio.ByteBuffer;
import java.util.ArrayList;

public class dQK
  implements cxS
{
  public final ArrayList gJF;

  public dQK()
  {
    this.gJF = new ArrayList(0);
  }

  public boolean g(ByteBuffer paramByteBuffer)
  {
    if (this.gJF.size() > 65535)
      return false;
    paramByteBuffer.putShort((short)this.gJF.size());
    for (int i = 0; i < this.gJF.size(); i++) {
      abF localabF = (abF)this.gJF.get(i);
      boolean bool = localabF.g(paramByteBuffer);
      if (!bool)
        return false;
    }
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.gJF.clear();
    this.gJF.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      abF localabF = new abF();
      boolean bool = localabF.h(paramByteBuffer);
      if (!bool)
        return false;
      this.gJF.add(localabF);
    }
    return true;
  }

  public void clear() {
    this.gJF.clear();
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 1) {
      bIX localbIX = new bIX(this, null);
      boolean bool = localbIX.b(paramByteBuffer, paramInt);
      if (bool) {
        localbIX.z();
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
    for (int j = 0; j < this.gJF.size(); j++) {
      abF localabF = (abF)this.gJF.get(j);
      i += localabF.O();
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
    paramStringBuilder.append(paramString).append("contentsSelection=");
    if (this.gJF.isEmpty()) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("(").append(this.gJF.size()).append(" elements)...\n");
      for (int i = 0; i < this.gJF.size(); i++) {
        abF localabF = (abF)this.gJF.get(i);
        localabF.a(paramStringBuilder, paramString + i + "/ ");
      }
    }
  }
}