import java.nio.ByteBuffer;
import java.util.ArrayList;

public class bZz extends dzz
{
  private boolean hpZ = false;

  private final ArrayList hqa = new ArrayList();

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    if (localByteBuffer.get() == 0) {
      this.hpZ = true;
    }
    int i = localByteBuffer.get();

    for (int j = 0; j < i; j++) {
      this.hqa.add(Long.valueOf(localByteBuffer.getLong()));
    }

    return true;
  }

  public int getId() {
    return 5300;
  }

  public boolean cee() {
    return this.hpZ;
  }

  public ArrayList cef() {
    return this.hqa;
  }
}