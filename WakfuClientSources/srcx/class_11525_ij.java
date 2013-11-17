import java.nio.ByteBuffer;

public class ij
  implements cxS
{
  public final FU aHK;
  public final FU aHL;
  public final FU aHM;
  public final FU aHN;

  public ij()
  {
    this.aHK = new FU();
    this.aHL = new FU();
    this.aHM = new FU();
    this.aHN = new FU();
  }
  public boolean g(ByteBuffer paramByteBuffer) {
    boolean bool1 = this.aHK.g(paramByteBuffer);
    if (!bool1)
      return false;
    boolean bool2 = this.aHL.g(paramByteBuffer);
    if (!bool2)
      return false;
    boolean bool3 = this.aHM.g(paramByteBuffer);
    if (!bool3)
      return false;
    boolean bool4 = this.aHN.g(paramByteBuffer);
    if (!bool4)
      return false;
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    boolean bool1 = this.aHK.h(paramByteBuffer);
    if (!bool1)
      return false;
    boolean bool2 = this.aHL.h(paramByteBuffer);
    if (!bool2)
      return false;
    boolean bool3 = this.aHM.h(paramByteBuffer);
    if (!bool3)
      return false;
    boolean bool4 = this.aHN.h(paramByteBuffer);
    if (!bool4)
      return false;
    return true;
  }

  public void clear() {
    this.aHK.clear();
    this.aHL.clear();
    this.aHM.clear();
    this.aHN.clear();
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 1) {
      bKo localbKo = new bKo(this, null);
      boolean bool = localbKo.b(paramByteBuffer, paramInt);
      if (bool) {
        localbKo.z();
        return true;
      }
      return false;
    }

    return h(paramByteBuffer);
  }

  public int O()
  {
    int i = 0;
    i += this.aHK.O();
    i += this.aHL.O();
    i += this.aHM.O();
    i += this.aHN.O();
    return i;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, "");
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramString).append("challengeReferenceInventory=...\n");
    this.aHK.a(paramStringBuilder, paramString + "  ");
    paramStringBuilder.append(paramString).append("climateReferenceInventory=...\n");
    this.aHL.a(paramStringBuilder, paramString + "  ");
    paramStringBuilder.append(paramString).append("buffsReferenceInventory=...\n");
    this.aHM.a(paramStringBuilder, paramString + "  ");
    paramStringBuilder.append(paramString).append("itemsReferenceInventory=...\n");
    this.aHN.a(paramStringBuilder, paramString + "  ");
  }
}