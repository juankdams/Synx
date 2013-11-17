import java.nio.ByteBuffer;

public class Ia extends dWi
{
  private byte bQn;
  private int bQo;
  private long[] bQp;
  private byte[] bQq;
  private byte[] bQr;
  private byte[] bQs;
  private byte[][] bQt;
  private byte[][] bQu;
  private byte[] bQv;
  private long bQw;
  private long bQx;
  private bFL[] bQy;
  private long bQz;
  private long bQA;
  private cpy bQB = new cpy();

  protected void M(ByteBuffer paramByteBuffer) {
    aY(paramByteBuffer);
    this.bQn = paramByteBuffer.get();
    this.bQo = paramByteBuffer.getInt();
    this.bQw = paramByteBuffer.getLong();
    this.bQx = paramByteBuffer.getLong();
    int i = paramByteBuffer.getInt();
    this.bQs = new byte[i];
    paramByteBuffer.get(this.bQs);
    this.bQv = new byte[paramByteBuffer.getShort()];
    paramByteBuffer.get(this.bQv);
    this.bQz = paramByteBuffer.getLong();
    this.bQA = paramByteBuffer.getLong();
    int j = paramByteBuffer.get();
    this.bQp = new long[j];
    this.bQq = new byte[j];
    this.bQr = new byte[j];
    this.bQt = new byte[j][];
    this.bQu = new byte[j][];
    for (int k = 0; k < j; k++) {
      this.bQp[k] = paramByteBuffer.getLong();
      this.bQq[k] = paramByteBuffer.get();
      this.bQr[k] = paramByteBuffer.get();
      this.bQt[k] = new byte[paramByteBuffer.getShort()];
      paramByteBuffer.get(this.bQt[k]);
      this.bQu[k] = new byte[paramByteBuffer.getShort()];

      paramByteBuffer.get(this.bQu[k]);
    }

    k = paramByteBuffer.get();
    this.bQy = new bFL[k];
    for (byte b1 = 0; b1 < k; b1++) {
      b2 = paramByteBuffer.get();
      long l = paramByteBuffer.getLong();
      this.bQy[b1] = new bFL(b2, l, null);
    }

    b1 = paramByteBuffer.get();
    for (byte b2 = 0; b2 < b1; b2++)
      this.bQB.dP(paramByteBuffer.get());
  }

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    M(localByteBuffer);
    return true;
  }

  public int Rl() {
    return this.bQp.length;
  }

  public long eW(int paramInt) {
    return this.bQp[paramInt];
  }

  public long[] Rm() {
    return this.bQp;
  }

  public byte eX(int paramInt) {
    return this.bQq[paramInt];
  }

  public byte eY(int paramInt) {
    return this.bQr[paramInt];
  }

  public byte[] eZ(int paramInt)
  {
    return this.bQt[paramInt];
  }

  public byte[] fa(int paramInt) {
    return this.bQu[paramInt];
  }

  public byte[] Rn() {
    return this.bQv;
  }

  public int getId()
  {
    return 8000;
  }

  public byte[] Ro() {
    return this.bQs;
  }

  public byte Rp() {
    return this.bQn;
  }

  public long Rq() {
    return this.bQw;
  }

  public long Rr() {
    return this.bQx;
  }

  public long Rs() {
    return this.bQz;
  }

  public long Rt() {
    return this.bQA;
  }

  public bFL[] Ru() {
    return this.bQy;
  }

  public cpy Rv() {
    return this.bQB;
  }
}