import java.nio.ByteBuffer;

public class adT
  implements cxS
{
  public byte cUJ;
  public short cUK;
  public short aDf;
  public String name;

  public adT()
  {
    this.cUJ = 0;
    this.cUK = 0;
    this.aDf = 0;
    this.name = null;
  }
  public boolean g(ByteBuffer paramByteBuffer) {
    paramByteBuffer.put(this.cUJ);
    paramByteBuffer.putShort(this.cUK);
    paramByteBuffer.putShort(this.aDf);
    if (this.name != null) {
      byte[] arrayOfByte = dzp.qC(this.name);
      if (arrayOfByte.length > 65535)
        return false;
      paramByteBuffer.putShort((short)arrayOfByte.length);
      paramByteBuffer.put(arrayOfByte);
    } else {
      paramByteBuffer.putShort((short)0);
    }
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    this.cUJ = paramByteBuffer.get();
    this.cUK = paramByteBuffer.getShort();
    this.aDf = paramByteBuffer.getShort();
    int i = paramByteBuffer.getShort() & 0xFFFF;
    byte[] arrayOfByte = new byte[i];
    paramByteBuffer.get(arrayOfByte);
    this.name = dzp.aJ(arrayOfByte);
    return true;
  }

  public void clear() {
    this.cUJ = 0;
    this.cUK = 0;
    this.aDf = 0;
    this.name = null;
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 10013) {
      ccA localccA = new ccA(this, null);
      boolean bool = localccA.b(paramByteBuffer, paramInt);
      if (bool) {
        localccA.z();
        return true;
      }
      return false;
    }

    return h(paramByteBuffer);
  }

  public int O()
  {
    int i = 0;
    i++;
    i += 2;
    i += 2;
    i += 2;
    i += (this.name != null ? dzp.qC(this.name).length : 0);
    return i;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, "");
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, String paramString) {
    paramStringBuilder.append(paramString).append("index=").append(this.cUJ).append('\n');
    paramStringBuilder.append(paramString).append("typeId=").append(this.cUK).append('\n');
    paramStringBuilder.append(paramString).append("quantity=").append(this.aDf).append('\n');
    paramStringBuilder.append(paramString).append("name=").append(this.name).append('\n');
  }
}