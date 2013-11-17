import java.nio.ByteBuffer;
import java.util.ArrayList;

public class bQB extends dzz
{
  private ArrayList gYV = new ArrayList();

  public ArrayList bXB() {
    return this.gYV;
  }

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    int i = localByteBuffer.getShort() & 0xFFFF;
    for (int j = 0; j < i; j++) {
      cNH localcNH = new cNH();
      localcNH.h(localByteBuffer);
      this.gYV.add(localcNH);
    }
    return true;
  }

  public int getId()
  {
    return 13000;
  }
}