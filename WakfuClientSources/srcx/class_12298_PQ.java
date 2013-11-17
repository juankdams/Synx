import java.nio.ByteBuffer;
import java.util.ArrayList;

public class PQ extends dzz
{
  private ArrayList cin = new ArrayList();
  private int cio;
  private int cip;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.cio = localByteBuffer.getInt();
    this.cip = localByteBuffer.getInt();
    while (localByteBuffer.hasRemaining())
      this.cin.add(Qy.T(localByteBuffer));
    return true;
  }

  public ArrayList abz() {
    return this.cin;
  }

  public int abA() {
    return this.cio;
  }

  public int abB() {
    return this.cip;
  }

  public int getId()
  {
    return 20012;
  }
}