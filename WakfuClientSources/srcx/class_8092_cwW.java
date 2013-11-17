import java.nio.ByteBuffer;
import java.util.ArrayList;

public class cwW extends dzz
{
  private ArrayList ijK = new ArrayList();

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    while (localByteBuffer.hasRemaining()) {
      this.ijK.add(new cFc(Integer.valueOf(localByteBuffer.getInt()), Long.valueOf(localByteBuffer.getLong()), Short.valueOf(localByteBuffer.getShort())));
    }

    return true;
  }

  public int getId()
  {
    return 8402;
  }

  public ArrayList cuw() {
    return this.ijK;
  }
}