import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;

public class czu extends dzz
{
  private final ArrayList iou = new ArrayList();

  public Iterator cwq()
  {
    return this.iou.iterator();
  }

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    while (localByteBuffer.hasRemaining()) {
      Yp localYp = Yp.cj(localByteBuffer.getLong());
      long l = localByteBuffer.getLong();
      byte[] arrayOfByte = new byte[localByteBuffer.getShort()];
      localByteBuffer.get(arrayOfByte);
      String str = dzp.aJ(arrayOfByte);
    }

    return true;
  }

  public int getId()
  {
    return 20020;
  }
}