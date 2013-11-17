import java.nio.ByteBuffer;

public class bxh extends dsQ
{
  private long dES;
  private int dFY;
  private boolean ghC;
  private int ghD;
  private int ghE;
  private short ghF;
  private boolean buz;
  private boolean buA;
  private short cZu;
  private aiZ bMr;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    aN(localByteBuffer);

    this.dES = localByteBuffer.getLong();
    this.dFY = localByteBuffer.getInt();
    this.cZu = localByteBuffer.getShort();
    this.ghC = (localByteBuffer.get() == 1);
    if (this.ghC) {
      this.bMr = new aiZ();
      if (!this.bMr.h(localByteBuffer)) {
        return false;
      }
    }
    this.buA = (localByteBuffer.get() == 1);
    if (!this.buA) {
      this.buz = (localByteBuffer.get() == 1);
      this.ghD = localByteBuffer.getInt();
      this.ghE = localByteBuffer.getInt();
      this.ghF = localByteBuffer.getShort();
    } else {
      this.buz = false;
    }

    return true;
  }

  public int getId()
  {
    return 8108;
  }

  public boolean Iz() {
    return this.buA;
  }

  public boolean Iy() {
    return this.buz;
  }

  public int UJ() {
    return this.dFY;
  }

  public int bED() {
    return this.ghD;
  }

  public int bEE() {
    return this.ghE;
  }

  public short bEF() {
    return this.ghF;
  }

  public long aFL() {
    return this.dES;
  }

  public boolean bEG() {
    return this.ghC;
  }

  public aiZ OG() {
    return this.bMr;
  }

  public int eo() {
    return 0;
  }

  public short nU() {
    return this.cZu;
  }

  public dPD ep() {
    return dPD.mhx;
  }
}