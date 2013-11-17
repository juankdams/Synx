import java.nio.ByteBuffer;
import java.util.ArrayList;

public class cNH
  implements cxS
{
  public String title;
  public String message;
  public final ArrayList aZC;

  public cNH()
  {
    this.title = null;
    this.message = null;
    this.aZC = new ArrayList(0);
  }

  public boolean g(ByteBuffer paramByteBuffer)
  {
    byte[] arrayOfByte;
    if (this.title != null) {
      arrayOfByte = dzp.qC(this.title);
      if (arrayOfByte.length > 65535)
        return false;
      paramByteBuffer.putShort((short)arrayOfByte.length);
      paramByteBuffer.put(arrayOfByte);
    } else {
      paramByteBuffer.putShort((short)0);
    }
    if (this.message != null) {
      arrayOfByte = dzp.qC(this.message);
      if (arrayOfByte.length > 65535)
        return false;
      paramByteBuffer.putShort((short)arrayOfByte.length);
      paramByteBuffer.put(arrayOfByte);
    } else {
      paramByteBuffer.putShort((short)0);
    }
    if (this.aZC.size() > 65535)
      return false;
    paramByteBuffer.putShort((short)this.aZC.size());
    for (int i = 0; i < this.aZC.size(); i++) {
      iE localiE = (iE)this.aZC.get(i);
      boolean bool = localiE.g(paramByteBuffer);
      if (!bool)
        return false;
    }
    return true;
  }

  public boolean h(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.getShort() & 0xFFFF;
    byte[] arrayOfByte1 = new byte[i];
    paramByteBuffer.get(arrayOfByte1);
    this.title = dzp.aJ(arrayOfByte1);
    int j = paramByteBuffer.getShort() & 0xFFFF;
    byte[] arrayOfByte2 = new byte[j];
    paramByteBuffer.get(arrayOfByte2);
    this.message = dzp.aJ(arrayOfByte2);
    int k = paramByteBuffer.getShort() & 0xFFFF;
    this.aZC.clear();
    this.aZC.ensureCapacity(k);
    for (int m = 0; m < k; m++) {
      iE localiE = new iE();
      boolean bool = localiE.h(paramByteBuffer);
      if (!bool)
        return false;
      this.aZC.add(localiE);
    }
    return true;
  }

  public void clear() {
    this.title = null;
    this.message = null;
    this.aZC.clear();
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    return h(paramByteBuffer);
  }

  public int O() {
    int i = 0;
    i += 2;
    i += (this.title != null ? dzp.qC(this.title).length : 0);
    i += 2;
    i += (this.message != null ? dzp.qC(this.message).length : 0);
    i += 2;
    for (int j = 0; j < this.aZC.size(); j++) {
      iE localiE = (iE)this.aZC.get(j);
      i += localiE.O();
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
    paramStringBuilder.append(paramString).append("title=").append(this.title).append('\n');
    paramStringBuilder.append(paramString).append("message=").append(this.message).append('\n');
    paramStringBuilder.append(paramString).append("contents=");
    if (this.aZC.isEmpty()) {
      paramStringBuilder.append("{}").append('\n');
    } else {
      paramStringBuilder.append("(").append(this.aZC.size()).append(" elements)...\n");
      for (int i = 0; i < this.aZC.size(); i++) {
        iE localiE = (iE)this.aZC.get(i);
        localiE.a(paramStringBuilder, paramString + i + "/ ");
      }
    }
  }
}