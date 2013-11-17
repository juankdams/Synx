import java.nio.ByteBuffer;

public class dkR extends dzz
{
  private long aLD;
  private gA aUe;
  private long dES;
  private byte etE;
  private short etD;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    this.aLD = localByteBuffer.getLong();
    this.dES = localByteBuffer.getLong();
    this.etE = localByteBuffer.get();
    this.etD = localByteBuffer.getShort();
    dGD localdGD = new dGD();
    if (localdGD.h(localByteBuffer)) {
      this.aUe = new gA();
      this.aUe.b(localdGD);
    } else {
      return false;
    }

    return true;
  }

  public int getId()
  {
    return 6010;
  }

  public gA getItem() {
    return this.aUe;
  }

  public long aFL() {
    return this.dES;
  }

  public long acp() {
    return this.aLD;
  }

  public byte bei() {
    return this.etE;
  }

  public short bej() {
    return this.etD;
  }
}