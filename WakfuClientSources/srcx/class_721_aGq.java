import java.nio.ByteBuffer;
import java.util.HashMap;

public final class aGq extends dzz
{
  private long iI;
  private int Rm;
  private final HashMap eds = new HashMap();

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.iI = localByteBuffer.getLong();
    this.Rm = localByteBuffer.getInt();
    int i = localByteBuffer.getInt();
    for (int j = 0; j < i; j++) {
      byte[] arrayOfByte = new byte[localByteBuffer.getInt()];
      localByteBuffer.get(arrayOfByte);
      this.eds.put(dzp.aJ(arrayOfByte), Long.valueOf(localByteBuffer.getLong()));
    }

    return true;
  }

  public int getId() {
    return 15402;
  }

  public long eq() {
    return this.iI;
  }

  public int aSv() {
    return this.Rm;
  }

  public HashMap aSw() {
    return this.eds;
  }
}