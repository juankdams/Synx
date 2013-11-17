import java.nio.ByteBuffer;
import java.util.ArrayList;

public class Eg extends dzz
{
  private ArrayList bIL;

  public boolean a(byte[] paramArrayOfByte)
  {
    this.bIL = new ArrayList();

    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    while (localByteBuffer.hasRemaining()) {
      int i = localByteBuffer.getInt();
      int j = localByteBuffer.getInt();
      float f = localByteBuffer.getFloat();
      byte[] arrayOfByte = new byte[localByteBuffer.getInt()];
      localByteBuffer.get(arrayOfByte);
      String str = dzp.aJ(arrayOfByte);
      int k = localByteBuffer.getInt();
      bjI localbjI = new bjI();
      int m = dsh.luB.cYT().length;
      for (int n = 0; n < m - 2; n++)
        localbjI.o(localByteBuffer.getInt(), localByteBuffer.get());
      this.bIL.add(new jU(this, i, j, f, str, k, localbjI));
    }

    return true;
  }

  public int getId()
  {
    return 20300;
  }

  public ArrayList MN() {
    return this.bIL;
  }
}