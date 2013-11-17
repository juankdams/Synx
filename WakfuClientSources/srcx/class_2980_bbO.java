import java.nio.ByteBuffer;
import java.util.ArrayList;

public class bbO
  implements cxS
{
  public final ArrayList dXh;
  public final ArrayList dXi;

  public bbO()
  {
    this.dXh = new ArrayList(0);
    this.dXi = new ArrayList(0);
  }

  public boolean g(ByteBuffer paramByteBuffer)
  {
    if (this.dXh.size() > 65535)
      return false;
    paramByteBuffer.putShort((short)this.dXh.size());
    Object localObject;
    boolean bool;
    for (int i = 0; i < this.dXh.size(); i++) {
      localObject = (bCj)this.dXh.get(i);
      bool = ((bCj)localObject).g(paramByteBuffer);
      if (!bool)
        return false;
    }
    if (this.dXi.size() > 65535)
      return false;
    paramByteBuffer.putShort((short)this.dXi.size());
    for (i = 0; i < this.dXi.size(); i++) {
      localObject = (Sf)this.dXi.get(i);
      bool = ((Sf)localObject).g(paramByteBuffer);
      if (!bool)
        return false;
    }
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.dXh.clear();
    this.dXh.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      bCj localbCj = new bCj();
      boolean bool1 = localbCj.h(paramByteBuffer);
      if (!bool1)
        return false;
      this.dXh.add(localbCj);
    }
    j = paramByteBuffer.getShort() & 0xFFFF;
    this.dXi.clear();
    this.dXi.ensureCapacity(j);
    for (int k = 0; k < j; k++) {
      Sf localSf = new Sf();
      boolean bool2 = localSf.h(paramByteBuffer);
      if (!bool2)
        return false;
      this.dXi.add(localSf);
    }
    return true;
  }

  public void clear() {
    this.dXh.clear();
    this.dXi.clear();
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 10024001) {
      aCx localaCx = new aCx(this, null);
      boolean bool = localaCx.b(paramByteBuffer, paramInt);
      if (bool) {
        localaCx.z();
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
    Object localObject;
    for (int j = 0; j < this.dXh.size(); j++) {
      localObject = (bCj)this.dXh.get(j);
      i += ((bCj)localObject).O();
    }
    i += 2;
    for (j = 0; j < this.dXi.size(); j++) {
      localObject = (Sf)this.dXi.get(j);
      i += ((Sf)localObject).O();
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
    paramStringBuilder.append(paramString).append("itemHistory=");
    int i;
    Object localObject;
    if (this.dXh.isEmpty()) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("(").append(this.dXh.size()).append(" elements)...\n");
      for (i = 0; i < this.dXh.size(); i++) {
        localObject = (bCj)this.dXh.get(i);
        ((bCj)localObject).a(paramStringBuilder, paramString + i + "/ ");
      }
    }
    paramStringBuilder.append(paramString).append("moneyHistory=");
    if (this.dXi.isEmpty()) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("(").append(this.dXi.size()).append(" elements)...\n");
      for (i = 0; i < this.dXi.size(); i++) {
        localObject = (Sf)this.dXi.get(i);
        ((Sf)localObject).a(paramStringBuilder, paramString + i + "/ ");
      }
    }
  }
}