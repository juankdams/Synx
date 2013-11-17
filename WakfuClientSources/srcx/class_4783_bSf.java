import java.nio.ByteBuffer;

public class bSf extends akv
  implements cxS
{
  public short hcC;
  public int hcD;
  public final dVs hcE;
  private final cCH aW;

  public bSf()
  {
    this.hcC = 0;
    this.hcD = 0;
    this.hcE = new dVs();

    this.aW = new bWZ(this);
  }

  public cCH ao()
  {
    return this.aW;
  }

  public boolean g(ByteBuffer paramByteBuffer) {
    paramByteBuffer.putShort(this.hcC);
    paramByteBuffer.putInt(this.hcD);
    boolean bool = this.hcE.g(paramByteBuffer);
    if (!bool)
      return false;
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.hcC = paramByteBuffer.getShort();
    this.hcD = paramByteBuffer.getInt();
    boolean bool = this.hcE.h(paramByteBuffer);
    if (!bool)
      return false;
    return true;
  }

  public void clear() {
    this.hcC = 0;
    this.hcD = 0;
    this.hcE.clear();
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 10008) {
      dnC localdnC = new dnC(this, null);
      boolean bool = localdnC.b(paramByteBuffer, paramInt);
      if (bool) {
        localdnC.z();
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
    i += 4;
    i += this.hcE.O();
    return i;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, "");
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramString).append("spellInventoryVersion=").append(this.hcC).append('\n');
    paramStringBuilder.append(paramString).append("lockedSpellId=").append(this.hcD).append('\n');
    paramStringBuilder.append(paramString).append("spellInventory=...\n");
    this.hcE.a(paramStringBuilder, paramString + "  ");
  }
}