import java.nio.ByteBuffer;

public class Fe extends dsQ
{
  private long bux;
  private aiZ bMr;
  private int bMs;
  private int bMt;
  private short bMu;
  private boolean buz;
  private boolean buA;
  private int bMv;

  public boolean a(byte[] paramArrayOfByte)
  {
    if (!j(paramArrayOfByte.length, 35, false)) {
      return false;
    }
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    aN(localByteBuffer);

    this.bux = localByteBuffer.getLong();
    this.bMr = new aiZ();
    if (!this.bMr.h(localByteBuffer)) {
      return false;
    }
    this.bMv = localByteBuffer.getInt();
    this.buA = (localByteBuffer.get() == 1);
    if (!this.buA)
      this.buz = (localByteBuffer.get() == 1);
    else {
      this.buz = false;
    }
    this.bMs = localByteBuffer.getInt();
    this.bMt = localByteBuffer.getInt();
    this.bMu = localByteBuffer.getShort();

    return true;
  }

  public int getId()
  {
    return 8110;
  }

  public long Iw() {
    return this.bux;
  }

  public aiZ OG() {
    return this.bMr;
  }

  public int OH() {
    return this.bMs;
  }

  public int OI() {
    return this.bMt;
  }

  public short OJ() {
    return this.bMu;
  }

  public boolean Iy() {
    return this.buz;
  }

  public boolean Iz() {
    return this.buA;
  }

  public int OK() {
    return this.bMv;
  }

  public int eo() {
    return 0;
  }

  public dPD ep() {
    return dPD.mhd;
  }
}