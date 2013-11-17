import java.nio.ByteBuffer;
import java.util.ArrayList;

public class aTR extends dzz
{
  private ArrayList eSG;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    int i = localByteBuffer.getShort();
    this.eSG = new ArrayList(i);

    for (int j = 0; j < i; j++) {
      diO localdiO = blK.au(localByteBuffer);
      this.eSG.add(localdiO);
    }

    return true;
  }

  public ArrayList biX() {
    return this.eSG;
  }

  public int getId()
  {
    return 14011;
  }
}