import java.nio.ByteBuffer;

public class aTM
  implements cxS
{
  public final Xe dur;
  public final Xe dus;
  public final Xe dut;
  public final Xe duu;

  public aTM()
  {
    this.dur = new Xe();
    this.dus = new Xe();
    this.dut = new Xe();
    this.duu = new Xe();
  }
  public boolean g(ByteBuffer paramByteBuffer) {
    boolean bool1 = this.dur.g(paramByteBuffer);
    if (!bool1)
      return false;
    boolean bool2 = this.dus.g(paramByteBuffer);
    if (!bool2)
      return false;
    boolean bool3 = this.dut.g(paramByteBuffer);
    if (!bool3)
      return false;
    boolean bool4 = this.duu.g(paramByteBuffer);
    if (!bool4)
      return false;
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    boolean bool1 = this.dur.h(paramByteBuffer);
    if (!bool1)
      return false;
    boolean bool2 = this.dus.h(paramByteBuffer);
    if (!bool2)
      return false;
    boolean bool3 = this.dut.h(paramByteBuffer);
    if (!bool3)
      return false;
    boolean bool4 = this.duu.h(paramByteBuffer);
    if (!bool4)
      return false;
    return true;
  }

  public void clear() {
    this.dur.clear();
    this.dus.clear();
    this.dut.clear();
    this.duu.clear();
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 10028000) {
      aoR localaoR = new aoR(this, null);
      boolean bool = localaoR.b(paramByteBuffer, paramInt);
      if (bool) {
        localaoR.z();
        return true;
      }
      return false;
    }

    return h(paramByteBuffer);
  }

  public int O()
  {
    int i = 0;
    i += this.dur.O();
    i += this.dus.O();
    i += this.dut.O();
    i += this.duu.O();
    return i;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, "");
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramString).append("challengeMerchantInventory=...\n");
    this.dur.a(paramStringBuilder, paramString + "  ");
    paramStringBuilder.append(paramString).append("climateMerchantInventory=...\n");
    this.dus.a(paramStringBuilder, paramString + "  ");
    paramStringBuilder.append(paramString).append("buffsMerchantInventory=...\n");
    this.dut.a(paramStringBuilder, paramString + "  ");
    paramStringBuilder.append(paramString).append("itemsMerchantInventory=...\n");
    this.duu.a(paramStringBuilder, paramString + "  ");
  }
}