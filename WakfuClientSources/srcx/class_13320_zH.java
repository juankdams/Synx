import java.nio.ByteBuffer;

public final class zH extends dsQ
{
  private long bux = -1L;
  private int buy = -1;
  private boolean buz;
  private boolean buA;
  private aiZ buB;
  private int hY;
  private int hZ;
  private short aOl;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    aN(localByteBuffer);
    this.bux = localByteBuffer.getLong();
    this.buy = localByteBuffer.getInt();
    this.buz = (localByteBuffer.get() == 1);
    this.buA = (localByteBuffer.get() == 1);

    this.buB = new aiZ();
    if (!this.buB.h(localByteBuffer)) {
      return false;
    }

    this.hY = localByteBuffer.getInt();
    this.hZ = localByteBuffer.getInt();
    this.aOl = localByteBuffer.getShort();

    return true;
  }

  public long Iw() {
    return this.bux;
  }

  public int Ix() {
    return this.buy;
  }

  public boolean Iy() {
    return this.buz;
  }

  public boolean Iz() {
    return this.buA;
  }

  public aiZ IA() {
    return this.buB;
  }

  public int getX() {
    return this.hY;
  }

  public int getY() {
    return this.hZ;
  }

  public short IB() {
    return this.aOl;
  }

  public int eo()
  {
    return 0;
  }

  public dPD ep()
  {
    return dPD.miw;
  }

  public int getId()
  {
    return 8116;
  }
}