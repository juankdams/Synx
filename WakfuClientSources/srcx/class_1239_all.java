import java.nio.ByteBuffer;
import java.util.ArrayList;

public class all extends akv
  implements cxS
{
  public final ArrayList dlU;
  public final ArrayList dlV;
  private final cCH aW;

  public all()
  {
    this.dlU = new ArrayList(0);
    this.dlV = new ArrayList(0);

    this.aW = new js(this);
  }

  public cCH ao()
  {
    return this.aW;
  }

  public boolean g(ByteBuffer paramByteBuffer)
  {
    if (this.dlU.size() > 65535)
      return false;
    paramByteBuffer.putShort((short)this.dlU.size());
    Object localObject;
    boolean bool;
    for (int i = 0; i < this.dlU.size(); i++) {
      localObject = (ai)this.dlU.get(i);
      bool = ((ai)localObject).g(paramByteBuffer);
      if (!bool)
        return false;
    }
    if (this.dlV.size() > 65535)
      return false;
    paramByteBuffer.putShort((short)this.dlV.size());
    for (i = 0; i < this.dlV.size(); i++) {
      localObject = (aWa)this.dlV.get(i);
      bool = ((aWa)localObject).g(paramByteBuffer);
      if (!bool)
        return false;
    }
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.dlU.clear();
    this.dlU.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      ai localai = new ai();
      boolean bool1 = localai.h(paramByteBuffer);
      if (!bool1)
        return false;
      this.dlU.add(localai);
    }
    j = paramByteBuffer.getShort() & 0xFFFF;
    this.dlV.clear();
    this.dlV.ensureCapacity(j);
    for (int k = 0; k < j; k++) {
      aWa localaWa = new aWa();
      boolean bool2 = localaWa.h(paramByteBuffer);
      if (!bool2)
        return false;
      this.dlV.add(localaWa);
    }
    return true;
  }

  public void clear() {
    this.dlU.clear();
    this.dlV.clear();
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 222) {
      dmc localdmc = new dmc(this, null);
      boolean bool = localdmc.b(paramByteBuffer, paramInt);
      if (bool) {
        localdmc.z();
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
    for (int j = 0; j < this.dlU.size(); j++) {
      localObject = (ai)this.dlU.get(j);
      i += ((ai)localObject).O();
    }
    i += 2;
    for (j = 0; j < this.dlV.size(); j++) {
      localObject = (aWa)this.dlV.get(j);
      i += ((aWa)localObject).O();
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
    paramStringBuilder.append(paramString).append("nationCitizenScores=");
    int i;
    Object localObject;
    if (this.dlU.isEmpty()) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("(").append(this.dlU.size()).append(" elements)...\n");
      for (i = 0; i < this.dlU.size(); i++) {
        localObject = (ai)this.dlU.get(i);
        ((ai)localObject).a(paramStringBuilder, paramString + i + "/ ");
      }
    }
    paramStringBuilder.append(paramString).append("offendedNations=");
    if (this.dlV.isEmpty()) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("(").append(this.dlV.size()).append(" elements)...\n");
      for (i = 0; i < this.dlV.size(); i++) {
        localObject = (aWa)this.dlV.get(i);
        ((aWa)localObject).a(paramStringBuilder, paramString + i + "/ ");
      }
    }
  }
}