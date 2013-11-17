import java.nio.ByteBuffer;

public class dtg extends dzz
{
  private int bq;
  private int lvx;
  private int lvy;
  private int dqb;
  private dxL cZH;
  private cSi lvz = new cSi();
  private byte dpP;
  private int aGC;
  private boolean lvA;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.dpP = localByteBuffer.get();
    this.bq = localByteBuffer.getInt();
    this.lvx = localByteBuffer.getInt();
    this.lvy = localByteBuffer.getInt();
    this.cZH = cYq.jq(localByteBuffer.getLong());
    this.aGC = localByteBuffer.getInt();
    this.dqb = localByteBuffer.getInt();
    this.lvA = (localByteBuffer.get() == 1);
    while (localByteBuffer.hasRemaining()) {
      this.lvz.add(localByteBuffer.getInt());
    }

    return true;
  }

  public int getId() {
    return 11214;
  }

  public cSi cZl() {
    return this.lvz;
  }

  public int cZm()
  {
    return this.bq;
  }

  public int cZn() {
    return this.lvx;
  }

  public int cZo()
  {
    return this.lvy;
  }

  public dxL EQ() {
    return this.cZH;
  }

  public byte azu() {
    return this.dpP;
  }

  public int CB() {
    return this.aGC;
  }

  public int azM() {
    return this.dqb;
  }

  public boolean cZp() {
    return this.lvA;
  }
}