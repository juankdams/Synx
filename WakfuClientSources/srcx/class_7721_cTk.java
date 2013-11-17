import java.nio.ByteBuffer;

public class cTk extends dzz
{
  private dGD kFR;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.kFR = new dGD();
    this.kFR.h(localByteBuffer);

    return true;
  }

  public int getId() {
    return 4176;
  }

  public dGD cIV() {
    return this.kFR;
  }
}