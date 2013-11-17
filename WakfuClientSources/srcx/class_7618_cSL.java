import java.nio.ByteBuffer;
import java.util.ArrayList;

public class cSL extends dWi
{
  private byte bQn;
  private long[] bQp;
  private byte[] bQr;
  private long bQw;
  private long bQx;
  private dzm kFm;
  private ArrayList kFn = new ArrayList();
  private ArrayList ipG = new ArrayList();
  private byte[] kFo;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    aY(localByteBuffer);
    this.bQn = localByteBuffer.get();
    this.bQw = localByteBuffer.getLong();
    this.bQx = localByteBuffer.getLong();
    int i = localByteBuffer.get();
    for (int j = 0; j < i; j++) {
      this.kFn.add(Long.valueOf(localByteBuffer.getLong()));
    }

    j = localByteBuffer.get();
    this.bQp = new long[j];
    this.bQr = new byte[j];
    for (byte b = 0; b < j; b++) {
      this.bQp[b] = localByteBuffer.getLong();
      this.bQr[b] = localByteBuffer.get();
    }
    b = localByteBuffer.get();
    this.kFm = dzm.fF(b);

    for (int k = (byte)(localByteBuffer.get() - 1); k >= 0; k = (byte)(k - 1)) {
      short s1 = localByteBuffer.getShort();
      short s2 = localByteBuffer.getShort();
      this.ipG.add(new Cs(Short.valueOf(s1), Short.valueOf(s2)));
    }

    this.kFo = new byte[localByteBuffer.remaining()];
    localByteBuffer.get(this.kFo);

    return true;
  }

  public int Rl() {
    return this.bQp.length;
  }

  public long eW(int paramInt) {
    return this.bQp[paramInt];
  }

  public byte eY(int paramInt) {
    return this.bQr[paramInt];
  }

  public int getId()
  {
    return 8006;
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

  public byte[] cIC() {
    return this.kFo;
  }

  public dzm cID() {
    return this.kFm;
  }

  public ArrayList cIE() {
    return this.kFn;
  }

  public ArrayList cIF() {
    return this.ipG;
  }
}