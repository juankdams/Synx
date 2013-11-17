import java.nio.ByteBuffer;
import java.util.ArrayList;

public final class Fh extends dzz
{
  private ArrayList bMz = new ArrayList();
  private long bMA;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.bMA = localByteBuffer.getLong();
    int i = localByteBuffer.getInt();
    for (int j = 0; j < i; j++) {
      byte[] arrayOfByte = new byte[localByteBuffer.getInt()];
      localByteBuffer.get(arrayOfByte);
      this.bMz.add(arrayOfByte);
    }

    return true;
  }

  public int getId() {
    return 2058;
  }

  public ArrayList OM() {
    return this.bMz;
  }

  public long getTimestamp() {
    return this.bMA;
  }
}