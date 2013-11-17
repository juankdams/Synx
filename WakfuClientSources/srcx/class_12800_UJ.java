import java.nio.ByteBuffer;
import java.util.ArrayList;

public class UJ extends dzz
{
  private final ArrayList cyY = new ArrayList();
  private bbO bkX;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    int i = localByteBuffer.get();
    for (int j = 0; j < i; j++) {
      dya localdya = new dya();
      localdya.h(localByteBuffer);
      this.cyY.add(localdya);
    }

    this.bkX = new bbO();
    this.bkX.h(localByteBuffer);
    return true;
  }

  public ArrayList aie() {
    return this.cyY;
  }

  public bbO Fe() {
    return this.bkX;
  }

  public int getId()
  {
    return 20078;
  }
}