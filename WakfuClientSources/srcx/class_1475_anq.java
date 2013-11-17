import java.nio.ByteBuffer;

public class anq extends dzz
{
  private boolean bUX;
  private boolean bPe;
  private dVs dqZ;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.bUX = (localByteBuffer.get() == 1);
    this.bPe = (localByteBuffer.get() == 1);
    if (this.bUX) {
      this.dqZ = new dVs();
      this.dqZ.h(localByteBuffer);
    }
    return true;
  }

  public boolean IR() {
    return this.bUX;
  }

  public boolean QG() {
    return this.bPe;
  }

  public dVs azY() {
    return this.dqZ;
  }

  public int getId()
  {
    return 13202;
  }
}