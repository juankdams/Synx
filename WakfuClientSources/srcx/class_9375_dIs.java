import java.nio.ByteBuffer;

public class dIs extends dzz
{
  private cKg aQq;
  private je eaV;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    this.eaV = je.aZ(localByteBuffer.getInt());
    this.aQq = Fk.H(localByteBuffer);

    return true;
  }

  public cKg tZ() {
    return this.aQq;
  }

  public je aRB() {
    return this.eaV;
  }

  public int getId()
  {
    return 5516;
  }
}