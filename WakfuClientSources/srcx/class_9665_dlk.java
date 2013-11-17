import java.nio.ByteBuffer;

public class dlk
  implements cxS
{
  public final bFi gbh;
  public final dQW gbi;

  public dlk()
  {
    this.gbh = new bFi();
    this.gbi = new dQW();
  }
  public boolean g(ByteBuffer paramByteBuffer) {
    boolean bool1 = this.gbh.g(paramByteBuffer);
    if (!bool1)
      return false;
    boolean bool2 = this.gbi.g(paramByteBuffer);
    if (!bool2)
      return false;
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    boolean bool1 = this.gbh.h(paramByteBuffer);
    if (!bool1)
      return false;
    boolean bool2 = this.gbi.h(paramByteBuffer);
    if (!bool2)
      return false;
    return true;
  }

  public void clear() {
    this.gbh.clear();
    this.gbi.clear();
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 10028000) {
      bte localbte = new bte(this, null);
      boolean bool = localbte.b(paramByteBuffer, paramInt);
      if (bool) {
        localbte.z();
        return true;
      }
      return false;
    }

    return h(paramByteBuffer);
  }

  public int O()
  {
    int i = 0;
    i += this.gbh.O();
    i += this.gbi.O();
    return i;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, "");
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramString).append("questInventory=...\n");
    this.gbh.a(paramStringBuilder, paramString + "  ");
    paramStringBuilder.append(paramString).append("temporaryInventory=...\n");
    this.gbi.a(paramStringBuilder, paramString + "  ");
  }
}