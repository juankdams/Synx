import java.nio.ByteBuffer;

public class bsH extends dzz
{
  private int biu;
  private byte fZD;
  private int fZE;
  private float fZF;
  private float cxt;
  private float fZG;
  private float fZH;
  private float fZI;
  private float fZJ;
  private float fZK;
  private float fZL;
  private float fZM;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.biu = localByteBuffer.getInt();
    this.fZD = localByteBuffer.get();

    this.fZE = (localByteBuffer.getShort() & 0xFFFF);
    this.fZF = localByteBuffer.getFloat();

    this.cxt = localByteBuffer.getFloat();

    this.fZG = localByteBuffer.getFloat();
    this.fZH = localByteBuffer.getFloat();
    this.fZI = localByteBuffer.getFloat();
    this.fZJ = localByteBuffer.getFloat();
    this.fZK = localByteBuffer.getFloat();
    this.fZL = localByteBuffer.getFloat();
    this.fZM = localByteBuffer.getFloat();

    return true;
  }

  public int getId() {
    return 9504;
  }

  public int DB() {
    return this.biu;
  }

  public int bAH() {
    return this.fZD;
  }

  public int bAI() {
    return this.fZE;
  }

  public float bAJ() {
    return this.fZF;
  }

  public float bxz() {
    return this.cxt;
  }

  public float bAK() {
    return this.fZG;
  }

  public float bAL() {
    return this.fZH;
  }

  public float bAM() {
    return this.fZI;
  }

  public float bAN() {
    return this.fZJ;
  }

  public float bAO() {
    return this.fZK;
  }

  public float bAP() {
    return this.fZL;
  }

  public float bAQ() {
    return this.fZM;
  }
}