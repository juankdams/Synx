import java.nio.ByteBuffer;
import java.util.ArrayList;

public class bRZ
  implements cxS
{
  public boolean hbS;
  public final ArrayList hbT;

  public bRZ()
  {
    this.hbS = false;
    this.hbT = new ArrayList(0);
  }

  public boolean g(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.put((byte)(this.hbS ? 1 : 0));
    if (this.hbT.size() > 65535)
      return false;
    paramByteBuffer.putShort((short)this.hbT.size());
    for (int i = 0; i < this.hbT.size(); i++) {
      dDi localdDi = (dDi)this.hbT.get(i);
      boolean bool = localdDi.g(paramByteBuffer);
      if (!bool)
        return false;
    }
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.hbS = (paramByteBuffer.get() == 1);
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.hbT.clear();
    this.hbT.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      dDi localdDi = new dDi();
      boolean bool = localdDi.h(paramByteBuffer);
      if (!bool)
        return false;
      this.hbT.add(localdDi);
    }
    return true;
  }

  public void clear() {
    this.hbS = false;
    this.hbT.clear();
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    return h(paramByteBuffer);
  }

  public int O() {
    int i = 0;
    i++;
    i += 2;
    for (int j = 0; j < this.hbT.size(); j++) {
      dDi localdDi = (dDi)this.hbT.get(j);
      i += localdDi.O();
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
    paramStringBuilder.append(paramString).append("firstChange=").append(this.hbS).append('\n');
    paramStringBuilder.append(paramString).append("laws=");
    if (this.hbT.isEmpty()) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("(").append(this.hbT.size()).append(" elements)...\n");
      for (int i = 0; i < this.hbT.size(); i++) {
        dDi localdDi = (dDi)this.hbT.get(i);
        localdDi.a(paramStringBuilder, paramString + i + "/ ");
      }
    }
  }
}