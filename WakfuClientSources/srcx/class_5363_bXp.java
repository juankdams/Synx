import java.nio.ByteBuffer;
import java.util.ArrayList;

public class bXp extends dzz
{
  private ArrayList hmj = new ArrayList();
  private int hmk;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.hmk = localByteBuffer.getInt();
    while (localByteBuffer.remaining() > 0) {
      aJw localaJw = new aJw();
      localaJw.U(localByteBuffer);
      this.hmj.add(localaJw);
    }

    return true;
  }

  public int ccE() {
    return this.hmk;
  }

  public ArrayList ccF() {
    return this.hmj;
  }

  public int getId()
  {
    return 20086;
  }
}