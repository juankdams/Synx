import java.nio.ByteBuffer;
import java.util.ArrayList;

public class adv extends dzz
{
  private final ArrayList cTE = new ArrayList();

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    int i = localByteBuffer.get();
    this.cTE.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      byte[] arrayOfByte = new byte[localByteBuffer.get() & 0xFF];
      localByteBuffer.get(arrayOfByte);
      String str = dzp.aJ(arrayOfByte);
      long l = localByteBuffer.getLong();
      this.cTE.add(new Cs(Long.valueOf(l), str));
    }

    return true;
  }

  public final int getId() {
    return 3146;
  }

  public final ArrayList apt() {
    return this.cTE;
  }
}