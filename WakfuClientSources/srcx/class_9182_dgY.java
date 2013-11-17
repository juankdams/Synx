import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class dgY extends dzz
{
  private HashMap lcg = new HashMap();

  public boolean a(byte[] paramArrayOfByte) {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    for (int i = localByteBuffer.get() - 1; i >= 0; i--) {
      long l = localByteBuffer.getLong();
      byte b = localByteBuffer.get();
      this.lcg.put(Long.valueOf(l), Byte.valueOf(b));
    }
    return true;
  }

  public int getId() {
    return 8036;
  }

  public Iterator cPW() {
    return this.lcg.entrySet().iterator();
  }
}