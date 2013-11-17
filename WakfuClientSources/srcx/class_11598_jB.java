import java.nio.ByteBuffer;
import java.util.ArrayList;

public class jB extends dzz
{
  private final ArrayList aLF = new ArrayList();

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    int i = localByteBuffer.get();

    for (int j = 0; j < i; j++)
    {
      int k = localByteBuffer.getShort();
      byte[] arrayOfByte = new byte[k];
      localByteBuffer.get(arrayOfByte);

      this.aLF.add(arrayOfByte);
    }

    return true;
  }

  public int getId()
  {
    return 2048;
  }

  public ArrayList ro()
  {
    return this.aLF;
  }
}